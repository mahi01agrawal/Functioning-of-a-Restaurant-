package pizzaRestaurant;

public class CustomerNode {
	private Customer customer;
	private CustomerNode next;
	private CustomerNode prev;
	public CustomerNode(Customer customer)
	{
		
		this.customer=customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerNode getNext() {
		return next;
	}
	public void setNext(CustomerNode next) {
		this.next = next;
	}
	

	public CustomerNode getPrev() {
		return prev;
	}
	public void setPrev(CustomerNode prev) {
		this.prev = prev;
	}
	public String toString()
	{
		return customer.toString();
	}
}