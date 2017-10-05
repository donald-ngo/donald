package com.donald.demo.linkedlist;

public class Node {
	int value;
	Node next;
	
	
	public static Node reverse(Node first){
		if (first == null || first.next == null){
			return first;
		}
		
		//5 -> 4 -> 3 -> 2 -> 1 -> null
		Node second = first.next; //4
		Node third = second.next; //3
	
		//Reverse
		first.next = null;  //5-> null   
		second.next = first;  //  4 -> 5-> null
		
		if(third == null){ //If we have two nodes we are done
			return first;
		}
        //                  third   second  first
	    //  null <- 1 <- 2 <- 3     4 ->    5 -> null

		Node currentNode = third;   //null <- 1 <- 2 <-3(current) 4 -> 5 -> null 
		Node previousNode = second; //null <- 1 <- 2 <-3(current) 4(previous) -> 5 -> null 
		
		while ( currentNode != null){
			Node nextNode = currentNode.next;
			currentNode.next = previousNode; 
			previousNode = currentNode; 
			currentNode = nextNode;    
		}
		
		first = previousNode;
		
		return first;
	}
	
	public static void printNodes(Node head){
		while ( head != null){
			System.out.print(head.value + "->");
			head = head.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
	
	public static void main(String[] args){
		Node n1 = new Node(1,null);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		printNodes(n5);
		printNodes(reverse(n5));

	}
}

