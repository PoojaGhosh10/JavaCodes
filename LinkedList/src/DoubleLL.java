
public class DoubleLL {
	private Node head;
	private int size;
	public DoubleLL() {
		this.size=0;
	}
	public class Node{
		private int data;
		private Node next;
		private Node prev;
	
	public Node(int data){
		this.data=data;
	}
	public Node(int data, Node next) {
		this.data=data;
		this.next=next;
	}
	public Node(int data, Node next,Node prev) {
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
	public void insertFirst(int data) {
		Node newNode=new Node(25);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
			size++;
		}
	}
	public void insertEnd(int data) {
		Node newNode=new Node(25);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
			}
			newNode.prev=temp;
			temp.next=newNode;
			size++;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;	
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL newnode= new DoubleLL();
		newnode.display();

	}

}
