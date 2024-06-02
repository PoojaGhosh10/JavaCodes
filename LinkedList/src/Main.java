public class Main{
	private Node head;
	private int size;
	public Main(){
		this.size=0;
	}
public class Node{
	private int data;
	private Node next;
	public Node(int data){
		this.data=data;
	}
	public Node(int data, Node next) {
		this.data=data;
		this.next=next;
	}
}
//Insertion operation: Insert at the beginning, at the end or at a particular index.
//1. Insert at the beginning
	public void insertFirst(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			size++;
		}
		else {
			newNode.next=head;
			head=newNode;
			size++;
		}
			
	}
//2. Insert at the end
	public void insertEnd(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			insertFirst(data);
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			size++;
		}	
	}
//3.Insert at the position x 
	public void insertAtPos(int data, int index) {
		Node newNode= new Node(data);
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
	}
//to display the list created	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;	
		}
		System.out.print("END");
	}
//to delete from start, end, at any position given.
//to delete from the start
	public void deleteStart() {
		if(head==null) {
			System.out.println("The Linkedlist is empty.");
		}
		else {
			head=head.next;
			size--;
		}
	}
//to delete from end.
	public void deleteEnd() {
		if(head==null) {
			System.out.println("The Linkedlist is empty.");
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			size--;
		}
	}
//to delete at any position	
	public void deleteAtPos(int index) {
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
	}
//to get the node in return
	public  Node getNode(int index) {
		if(head==null) {
			return null;
		}
		else {
			Node temp=head;
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
			return temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main newlist=new Main();
		newlist.insertFirst(25);
		newlist.insertFirst(15);
		newlist.insertFirst(35);
		newlist.insertEnd(35);
		newlist.insertAtPos(56,2);
		newlist.display();	
		newlist.deleteAtPos(2);
		System.out.print("\n");
		newlist.display();	
		System.out.println("\n"+ newlist.size);
	}
}
