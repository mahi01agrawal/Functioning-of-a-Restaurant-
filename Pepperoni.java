package pizzaRestaurant;

public class Pepperoni extends Meat implements payment{
	public static final int calories = 250;
	public static final String description = "Fresh and spicy pepperoni";

	public Pepperoni() {
		super(description,  calories);
	}

	@Override
	
	public void onlinePay(double p1,double p2,double p3,double r,int w) {

		if(area(r)>113.04)
		 {
			System.out.println(" You have selected Pepperoni meat Large size pizza"); 
			System.out.println("The price of your large pizza is "+p3+" per pizza");
			System.out.println("So total price of pizza is "+(p3*w));
			System.out.println("Accepts Online payment!!!");
		 }
		  
			 if(area(r)<=113.04 && area(r)>50.24)
			 {
				 System.out.println("You have selected Pepperoni meat Medium size pizza");
				 System.out.println("The price of pizza is "+p2+" per pizza");
				 System.out.println("So total price of pizza is "+(p2*w));
				 System.out.println("Accepts Online payment!!!");
			 }
			 else {
				 if(area(r)<=50.24)
				 {  System.out.println("You have selected Pepperoni meat Medium size pizza"); 
				    System.out.println("The price of pizza is "+p1+" per pizza");
					System.out.println("So total price of pizza is "+p1*w);
					System.out.println("Accepts Online payment!!!");
					}
			 }
		
	}
	
	@Override
	public void cashonPay(double p1,double p2,double p3,int w,double r) {
		
		
			if(area(r)>113.04)
			 {
				System.out.println("You have selected Pepperoni meat Large size pizza"); 
				System.out.println("The price of your large pizza is "+p3+" per pizza");
				System.out.println("So total price of pizza is "+(p3*w));
				
			 }
			  
				 if(area(r)<=113.04 && area(r)>50.24)
				 {
					 System.out.println("You have selected Pepperoni meat Medium size pizza");
					 System.out.println("The price of pizza is "+p2+" per pizza");
					 System.out.println("So total price of pizza is "+(p2*w));
					
				 }
				 else {
					 if(area(r)<=50.24)
					 {  System.out.println("You have selected Pepperoni meat Medium size pizza"); 
					    System.out.println("The price of pizza is "+p1+" per pizza");
						System.out.println("So total price of pizza is "+p1*w);
						
						}
				 } 
					System.out.println("Accepts CashOn home delivery payment!!!");
	}
}