package pizzaRestaurant;

public class CustomerDoublyLinkedList {
	private CustomerNode head;
	private CustomerNode next;
	private CustomerNode tail;
	private int size;
	public void addToFront(Customer customer)
	{
		CustomerNode node=new CustomerNode(customer);
		
		if(isEmpty())
		{
			tail=node; 
			
		}
		else
		{
			head.setPrev(node);
			node.setNext(head);
			
		}
		head=node;
		size++;
		
	}
	public void addToTail(Customer customer)
	{	CustomerNode node=new CustomerNode(customer);
		if(tail==null)
		{
			head=node;
		
		}
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail=node;
		size++;
	}
	public CustomerNode removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		CustomerNode removeNode=head;
		if(head.getNext()==null)
		{
			tail=null;
		}
		else {
			head.getNext().setPrev(null);
		}
		head=head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
		
	}
	public CustomerNode removeFromEnd()
	{
		if(isEmpty())
		{   System.out.println("No customers");
			return null;
		}
		
		CustomerNode removeNode=tail;
		if(tail.getPrev()==null) {
			head=null;
		}
		else {
			tail.getPrev().setNext(null);
		}
		tail=tail.getPrev();
		removeNode.setPrev(null);
		size--;
		return removeNode;
		
		
	}
	private boolean isEmpty() {
		return head==null;
	}
	public void print()
	{
		CustomerNode current=head;
		
		while(current!=null)
		{
			System.out.print(current);
			current=current.getNext();
		}
		
	}

}