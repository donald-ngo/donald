package linkedlist;


public class NodeUtils {	

	public static void printNodes(Node head){
		while ( head != null){
			System.out.print(head.value + "->");
			head = head.next;
		}
		System.out.print("null");
		System.out.println("");
	}	

	public static Node reverse(Node head){
		
		//If we have only one node or no nodes;
		if (head == null || head.next == null) return head;
		
		Node second = head.next;
		Node third = second.next;
		
		head.next = null;
		second.next = head;
		
		if (third == null) { // If we have only two nodes	
			head = second;
			return head;
		}

		Node previous = second;
		Node current = third;
		Node next;
	
		while ( current != null){ //When we reach null we are at the end of the linkedlist
			next = current.next; //Save this node for later
			current.next = previous;
			previous = current;
			current = next;
		}
		
		head = previous; //Set the head to the previous non-null node
		
		return head;
	}

	public static void main(String[] args){
		Node n5 = new Node(5,null);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);

		Node m2 = new Node(2,null);
		Node m1 = new Node(1,m2);

		NodeUtils.printNodes(m1);
		NodeUtils.printNodes(NodeUtils.reverse(m1));

		NodeUtils.printNodes(n1);
		NodeUtils.printNodes(NodeUtils.reverse(n1));
	}
}
