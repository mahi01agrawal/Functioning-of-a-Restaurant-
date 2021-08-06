package pizzaRestaurant;

import java.util.Comparator;

public class DeliveryPartner {
 String name;
 int rating;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void setRating(int rating) {
	this.rating = rating;
}
public int getRating()
{ return rating;
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(rating);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DeliveryPartner other = (DeliveryPartner) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
		return false;
	return true;
}

@Override
public String toString() {
	return "DeliveryPartner [name=" + name + ", rating=" + rating + "]";
}
public DeliveryPartner(String name, int rating) {
	super();
	this.name = name;
	this.rating = rating;
}

public DeliveryPartner(String name)
{
	this.name=name;
	}
 public DeliveryPartner(int rating)
 {
	 this.rating=rating;
 }
}