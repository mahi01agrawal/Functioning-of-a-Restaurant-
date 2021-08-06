package pizzaRestaurant;

public class Meat extends Ingredient implements shape {
	
	//Constructor that passes values from child class to super class
	public Meat(String description, int calories) {
		super(description, calories);
	}

	@Override
	 public void area1()
	 {
		System.out.println("Enter the radius of Pizza(Enter between 3 to 9 inches)");
		System.out.println("\nSet,\nradius > 6 for large pizza\nradius <=6 but >4 for medium pizza\nradius <=4 for small pizza");
		r=sc.nextDouble();
		if(r>3&&r<9) {
		System.out.println("Area of the pizza is: "+area(r));
		}
		else {
			System.out.println("Please re-enter:");
			area1();
		}
	 }
	 public void type()
	 {
		 if(area(r)>113.04)
		 {
			System.out.println("Large size pizza"); 
		 }
		  
			 if(area(r)<=113.04 && area(r)>50.24)
			 {
				 System.out.println("Medium pizza");
			 }
			 else {
				 if(area(r)<=50.24)
				 { System.out.println("Small pizza");  }
			 }
				 
	 }
}