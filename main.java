package pizzaRestaurant;

import java.lang.reflect.Array;
import java.util.*;

class SortbyRating implements Comparator<DeliveryPartner>
{
    public int compare(DeliveryPartner a, DeliveryPartner b) {
    	return a.rating - b.rating;
    }


}
class SameRatingException extends RuntimeException {
	  
	  SameRatingException(String msg)
	  {
	    super(msg);
	  }

	  
	}
public class main {

	public static void add(List<Employee>emp,String f,String l,int id)
	{
		emp.add(new Employee(f,l,id));
	}
	public static void display(List<Employee>emp)
	{
		emp.forEach(Employee ->System.out.println(Employee));
	}
	public static void remove(List<Employee>emp,String f,String l,int id)
	{
		emp.remove(new Employee(f,l,id));
	}
	public static void push(Stack<DeliveryPartner> dp,String f,int r)
	{   DeliveryPartner d= new DeliveryPartner(f,r);
		dp.push(d);

	}
	public static void push1(Stack<DeliveryPartner> dp,int r)
	{   
		DeliveryPartner d1=new DeliveryPartner(r);
		dp.push(d1);
	}
	public static void display(Stack<DeliveryPartner> dp)
	{
		DeliveryPartner[] delArray = dp.toArray(new DeliveryPartner[dp.size()]);
      for (DeliveryPartner del: delArray) {
          System.out.println(del);
      }
		
	}
	public static void display1(Stack<DeliveryPartner> dp)
	{
		DeliveryPartner[] delArray1 = dp.toArray(new DeliveryPartner[dp.size()]);
      
   Arrays.sort(delArray1,new SortbyRating());
   try {
	 
	      
        
 	   if(delArray1[delArray1.length-1]==delArray1[delArray1.length-2])
 	   {
 		   throw new SameRatingException("Two Or more delivery partner cannot have same rating");
 	   }
    }
    
    
    
   catch(SameRatingException e)
   {  
 	   System.out.println(e);
   }
     
    
      for (DeliveryPartner del1: delArray1) {
          System.out.println(del1);
      }
   System.out.println();
   System.out.println("Delivery Partner Of the month goes to:");
  
  System.out.println(delArray1[delArray1.length-1]);
 }
    
	public static void addCustFront(CustomerDoublyLinkedList customer,String f,String l,int id) {
		customer.addToFront(new Customer(f,l,id));
	}
	public static void addCustLast(CustomerDoublyLinkedList customer,String f,String l,int id)
	{
		customer.addToTail(new Customer(f,l,id));
	}
	public static void removefromfront(CustomerDoublyLinkedList customer)
	{
		customer.removeFromFront();
	}
	public static void removeFromLast(CustomerDoublyLinkedList customer)
	{
		customer.removeFromEnd();
	}
	public static void display(CustomerDoublyLinkedList customer)
	{
		customer.print();
	}
	
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		List<Employee>emp=new ArrayList();
		Stack<DeliveryPartner> dp=new Stack<>();
		CustomerDoublyLinkedList customer=new CustomerDoublyLinkedList();
		String f;
		String l;
		int id;
		int r;
		System.out.println("Welcome To Our Pizza Restaurant");
		int m=0,menu;
		while(m!=5){
			System.out.println("\n\nWhat you want to navigate into\n1)Enter 1 for Employee\n2)Enter 2 for Delivery Partner\n3)Enter 3 for Customer\n4)Enter 4 for Ingredients\n5)Enter 5 to Exit ");
			System.out.println("Enter Your Choice:");
			m=sc.nextInt();
			switch(m)
			{
			case 1:
				System.out.println("You Have Entered Inside The Employee Section!!!");
				menu=0;
				while(menu!=4) {
				System.out.println("\n\n1)Enter 1 to add Employee\n2)Enter 2 to display Employee \n3)Enter 3 to remove Employee\n4)Enter 4 to Exit");
				System.out.println("Enter Your Choice:");
				menu=sc.nextInt();
				
				switch(menu)
				{
				
				case 1:
				{
					System.out.println("Enter the Employee first name");
					f=sc.next();
					System.out.println("Enter the Employee last name ");
					l=sc.next();
					System.out.println("Enter the Employee id");
					id=sc.nextInt();
					add(emp,f,l,id);
					break;
				}
				case 2: {
				
					display(emp);
					break;
				}
				case 3:
				{
					System.out.println("Enter the Employee first name you want to remove");
					f=sc.next();
					System.out.println("Enter the Employee last name you want to remove ");
					l=sc.next();
					System.out.println("Enter the Employee id you want to remove");
					id=sc.nextInt();
					remove(emp,f,l,id);
					System.out.println("The Employee has been removed");
					break;
				}
				case 4:
				{
					break;
				}
				default:
				{
					System.out.println("Enter right choice!!!");
				}
				}
			
				}
			
				
				System.out.println("You have Exited from Employee Section");
				break;
			 
			case 2:
				f=null;
				r=0;
				DeliveryPartner d= new DeliveryPartner(f,r);
				System.out.println("You Have Entered Inside The Delivery Partner Section!!!");
				menu=0;
				while(menu!=4) {
				System.out.println("\n1)Enter 1 to Add Delivery Partner\n2)Enter 2 to Display Delivery Partner\n3)Enter 3 to Get The Delivery Partner Of the Month\n4)Enter 4 to Exit");
				System.out.println("Enter Your Choice:");
				menu=sc.nextInt();
				int count =0;
				if(menu==1)
				{count++;}
				switch(menu)
				{
				
	
				case 1:
				{    
				
					System.out.println("Enter the Delivery Partner name");
					f=sc.next();
					d.setName(f);
					System.out.println("Enter the Delivery Partner rating");
					r=sc.nextInt();
					d.setRating(r);
					push(dp,f,r);
					
				   
					break;
				}
				
			
				case 2:
				{    
					display(dp);
					break;
				}
				case 3:
				{
						display1(dp);
					break;
				}
				case 4:
				{
					break;
				}
				 default:
				 {
					 System.out.println("Enter the right choice!!!");
				 }
				}
				} 
				System.out.println("You have Exited from Delivery Partner");
				break;
			case 3:
				System.out.println("You Have Entered Inside The Customer Section!!!");
				menu=0;
				while(menu!=6)
				{
				System.out.println("\n\n1)Enter 1 to addFromFront \n2)Enter 2 to addFromLast\n3)Enter 3 to removeFromFront\n4)Enter 4 to remove FromLast\n5)Enter 5 to Display The Customer\n6)Enter 6 to Exit");
				System.out.println("Enter Your Choice:");
				menu=sc.nextInt();
				switch(menu)
				{
				case 1:
				{
					System.out.println("Enter the first name of customer");
					f=sc.next();
					System.out.println("Enter the last name of customer");
					l=sc.next();
					System.out.println("Enter the customer id");
					id=sc.nextInt();
					addCustFront(customer,f,l,id);
					break;
				}
				case 2:
				{ 	
					System.out.println("Enter the first name of customer");
					f=sc.next();
					System.out.println("Enter the last name of customer");
					l=sc.next();
					System.out.println("Enter the customer id");
					id=sc.nextInt();
					addCustLast(customer,f,l,id);
					break;
				}
				case 3:
				{   
					removefromfront(customer);
					break;
				}
				case 4:
				  {
					  removeFromLast(customer);
					  break;
				  }
				case 5:
				{
					display(customer);
					break;
				}
				case 6:
					break;
				
				default:
				{
					System.out.println("Enter right choice!!!");
				}
				}
				}
				System.out.println("You have exited from Customer Section!!!");
				break;
		case 4:
		    System.out.println("You Have Entered Inside The Ingredient Section!!!");
		    menu=0;
			while(menu!=4) {
			System.out.println("\n1)Enter 1 for Cheese Pizza\n2)Enter 2 for Veg Pizza\n3Enter 3 for Non-Veg Pizza\n4)Exit");
			System.out.println("Enter Your Choice:");
			menu=sc.nextInt();
			switch(menu)
			{
			case 1:
			{	System.out.println("You have Entered inside the Cheese Pizza");
				Ingredient ig=new Ingredient();
				Cheese ch=new Cheese("l", 0);
				double p1=220;
				double p2=270;
				double p3=320;
				
				System.out.println("SmallCheese Mozzarella per pizza price is "+p1);
				System.out.println("MediumCheese Mozzarella per pizza price is "+p2);
				System.out.println("LargeCheese Mozzarella per pizza price is "+p3);
				ch.area1();
				ch.type();
				Mozzarella m1=new Mozzarella();
				double r1=ch.r;
				int w=m1.NumberOfPizza();
				System.out.println("\nMode of payment:\n1)Enter 1 for HomeDelivery\n2)Enter 2 for Online Payment:\n");
				int mo=sc.nextInt();
				if(mo==1)
				{
				m1.cashonPay(p1,p2,p3,w,r1);
				}
				else {
					if(mo==2)
					{
					m1.onlinePay(p1,p2,p3,r1,w);
					}
					else {
						System.out.println("Enter either 1 or 2");
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("You have entered into Veg Pizza");
				System.out.println("1)Enter 1 for Olive Pizza\n2)Enter 2 for Pepper Pizza ");
				int choice=sc.nextInt();
				if(choice ==1){
					Ingredient ig=new Ingredient();
					Vegetable vg =new Vegetable("l",0);
					double p1=200;
					double p2=250;
					double p3=300;
					
					System.out.println("SmallVeg Olive per pizza price is "+p1);
					System.out.println("MediumVeg Olive per pizza price is "+p2);
					System.out.println("LargeVeg Olive per pizza price is "+p3);
					vg.area1();
					vg.type();
					Olive o1=new Olive("l", 0);
					double r1=vg.r;
					int w=o1.NumberOfPizza();
					System.out.println("\nMode of payment:\n1)Enter 1 for HomeDelivery\n2)Enter 2 for Online Payment:\n");
					int mo=sc.nextInt();
					if(mo==1)
					{
					o1.cashonPay(p1,p2,p3,w,r1);
					}
					else {
						if(mo==2)
						{
						o1.onlinePay(p1,p2,p3,r1,w);
						}
						else {
							System.out.println("Enter either 1 or 2");
						}
					}
					
				}
				else {
					if(choice==2)
					{
						Ingredient ig=new Ingredient();
						Vegetable vg=new Vegetable("l", 0);
						double p1=230;
						double p2=280;
						double p3=330;
						
						System.out.println("SmallVeg Pepper per pizza price is "+p1);
						System.out.println("MediumVeg Pepper per pizza price is "+p2);
						System.out.println("LargeVeg Pepper per pizza price is "+p3);
						vg.area1();
						vg.type();
						Pepper pep=new Pepper("l", 0);
						double r1=vg.r;
						int w=pep.NumberOfPizza();
						System.out.println("\nMode of payment:\n1)Enter 1 for HomeDelivery\n2)Enter 2 for Online Payment:\n");
						int mo=sc.nextInt();
						if(mo==1)
						{
						pep.cashonPay(p1,p2,p3,w,r1);
						}
						else {
							if(mo==2)
							{
							pep.onlinePay(p1,p2,p3,r1,w);
							}
							else {
								System.out.println("Enter either 1 or 2");
							}
						}
					}
				}
				
				break;
				
			}
			case 3:
			{	System.out.println("You have entered into Non-Veg Pizza");
			    System.out.println("1)Enter 1 for Pepperoni Pizza\n2)Enter 2 for Sausage Pizza ");
			    int choice=sc.nextInt();
			    if(choice ==1){
					Ingredient ig=new Ingredient();
					Meat mt =new Meat("l",0);
					double p1=280;
					double p2=330;
					double p3=380;
					
					System.out.println("SmallNon-Veg Pepperoni per pizza price is "+p1);
					System.out.println("MediumNon-Veg Pepperoni per pizza price is "+p2);
					System.out.println("LargeNon-Veg Pepperoni per pizza price is "+p3);
					mt.area1();
					mt.type();
					Pepperoni pp=new Pepperoni();
					double r1=mt.r;
					int w=pp.NumberOfPizza();
					System.out.println("\nMode of payment:\n1)Enter 1 for HomeDelivery\n2)Enter 2 for Online Payment:\n");
					int mo=sc.nextInt();
					if(mo==1)
					{
					pp.cashonPay(p1,p2,p3,w,r1);
					}
					else {
						if(mo==2)
						{
						pp.onlinePay(p1,p2,p3,r1,w);
						}
						else {
							System.out.println("Enter either 1 or 2");
						}
					}
					
				}
				else {
					if(choice==2)
					{
						Ingredient ig=new Ingredient();
					    Meat mt =new Meat("l",0);
					    double p1=260;
					    double p2=310;
					    double p3=360;
					
					    System.out.println("SmallNon-Veg Sausage per pizza price is "+p1);
					    System.out.println("MediumNon-Veg Sausage per pizza price is "+p2);
					    System.out.println("LargeNon-Veg Sausage per pizza price is "+p3);
					    mt.area1();
					    mt.type();
						Sausage s1=new Sausage();
						double r1=mt.r;
						int w=s1.NumberOfPizza();
						System.out.println("\nMode of payment:\n1)Enter 1 for HomeDelivery\n2)Enter 2 for Online Payment:\n");
						int mo=sc.nextInt();
						if(mo==1)
						{
						s1.cashonPay(p1,p2,p3,w,r1);
						}
						else {
							if(mo==2)
							{
							s1.onlinePay(p1,p2,p3,r1,w);
							}
							else {
								System.out.println("Enter either 1 or 2");
							}
						}
					}
				}
						
				break;
			}
			case 4:
			{
				
				break;
			}
			default:
			{
				System.out.println("Enter right choice!!!");
			}
			}
			}
			System.out.println("You Have exited from Ingredient Section!!!");
			break;
       
		case 5:
		{    new radio();
			break;
		}
		default:
			System.out.println("Enter the right choice!!!");
			
		  
			}
					
			}
		System.out.println("You have Exited From our site!!!");
		System.out.println("Thanks for your time!!!");
		}
	}