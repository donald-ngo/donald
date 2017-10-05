package objects;

class Link{
	public int data1;
	public double data2;
	public Link nextLink;
	
	//Link constructor
	public Link(int d1, double d2){
		this.data1 = d1;
		this.data2 = d2;
	}
	
	//Print Link data
	public void printLink(){
		System.out.println("{" + data1 + ", " + data2 + "} ");
	}
}

public class LinkedList {
	private Link first;
	
	//LinkList constructor
	public LinkedList(){
		first = null;
	}

	//Returns true if the list is empty
	public boolean isEmpty(){
		return first == null;
	}
	
	//Inserts a new link at the first of the list
	public void insert(int d1, double d2){
		//{1, 1.01}->null
		//{2, 2.02}->{1, 1.01}
		Link link = new Link(d1,d2);
		link.nextLink = first;
		first = link;
	}
	
	//Prints list data
	public Link delete(){
		Link temp = first;
		first = first.nextLink;
		return temp;
	}
	
	//Print list data
	public void printList(){
		Link currentLink = first;
		System.out.print("List: ");
		while(currentLink != null){
			currentLink.printLink();
			currentLink = currentLink.nextLink;
		}
		System.out.println("");
	}
}
