public class Item {
	  
	  //Here I initialized a string and a double which will be used in an object
	  private String order;
	  private Double price;
	  
	  //This create an object that has a string for the order name and an int for the price 
	  public Item(String order, Double price) {
	    this.order = order;
	    this.price = price;
	  }

	  //This is a get method that returns the price of a Item object
	  public Double getPrice() {
	    return this.price;
	  }
	  
	  //Here is a to string method that returns that name of the order and the price with a colon in the middle
	  @Override
	  public String toString() {
	    return order + ": " + price;
	  }
	  
	}
