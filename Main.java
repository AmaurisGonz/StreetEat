//Here I import Scanner to get user input, Arraylist to store data, and Math to round doubles
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

	  //Displays lists with numbers to the left so that the customer can input values
	  public static void displayList(ArrayList<Item> items) {
		  for(int i = 0; i < items.size();i++) {
			  
	        int j = i + 1;
	        System.out.println("[" + j + "]" + items.get(i));
	        
	      }
	  }

	  //This adds the persons input as an order into a cart list
	  public static void takeOrder(ArrayList<Item> items, ArrayList<Item> cart, int y) {
	    if(y > 0 && y <= items.size()) {
	    	
	      cart.add(items.get(y - 1));
	      
	    } else if(y == items.size() + 1) {
	    
	    } else {
	    	
	      System.out.println("\nThe input value is invalid");
	      
	    }
	  }

	  //Add the values from a cart to the total 
	  public static double getTotal(ArrayList<Item> cart, Double t) {
	    for(int i = 0; i < cart.size();i++) {
	    	
	      Item a = cart.get(i);
	      System.out.println(a);
	      
	      t += a.getPrice();
	      
	    }
	    
	    return t;
	    
	  }

	  //Prints the receipt
	  public static void printReceipt(ArrayList<Item> e, ArrayList<Item> s, ArrayList<Item> b, ArrayList<Item> d, ArrayList<Item> c, Double t) {
	    t = 0.00;
	    
	    System.out.println("\n------------------------");
	    
	    if(e.size() != 0) {
	    	
	      t = getTotal(e,t);
	      
	    }
	    
	    if(s.size() != 0) {
	    	
	      t = getTotal(s,t);
	      
	    }
	    
	    if(b.size() != 0) {
	    	
	      t = getTotal(b,t);
	      
	    }
	    
	    if(d.size() != 0) {
	    	
	      t = getTotal(d,t);
	      
	    }
	    
	    if(c.size() != 0) {
	    	
	      t = getTotal(c,t);
	      
	    }
	    
	    t = t*100;
	    t = (double) Math.round(t);
	    t = t/100;
	    
	    System.out.println("------------------------" + "\nTotal : " + t + "\n------------------------");
	    
	  }
	  
	  public static void main(String[] args) {
		
		//Here I initialize the different types of arraylists for the menu types 
	    ArrayList<Item> entrees = new ArrayList<Item>();
	    Item pizza = new Item("Pizza", 0.99);
	    entrees.add(pizza);
	    Item burger = new Item("Burger", 3.99);
	    entrees.add(burger);
	    Item bagel = new Item("Bagel", 3.49);
	    entrees.add(bagel);
	    Item gCheese = new Item("Grilled Cheese", 1.99);
	    entrees.add(gCheese);

	    ArrayList<Item> entreeCart = new ArrayList<Item>();
	    
	    ArrayList<Item> sides = new ArrayList<Item>();
	    Item fries = new Item("Fries", 0.49);
	    sides.add(fries);
	    Item oRings = new Item("Onion Rings", 0.49);
	    sides.add(oRings);
	    Item mSticks = new Item("Mozzarella Sticks", 0.99);
	    sides.add(mSticks);

	    ArrayList<Item> sideCart = new ArrayList<Item>();

	    ArrayList<Item> bevs = new ArrayList<Item>();
	    Item water = new Item("Water", 0.49);
	    bevs.add(water);
	    Item coke = new Item("Coke", 0.99);
	    bevs.add(coke);
	    Item fruitP = new Item("Fruit Punch", 0.99);
	    bevs.add(fruitP);
	    Item lemonade = new Item("Lemonade", 0.49);
	    bevs.add(lemonade);

	    ArrayList<Item> bevCart = new ArrayList<Item>();
	    
	    ArrayList<Item> desserts = new ArrayList<Item>();
	    Item cone = new Item("Ice Cream Cone", 1.49);
	    desserts.add(cone);
	    Item cookie = new Item("Cookie", 0.49);
	    desserts.add(cookie);
	    Item cappuccino = new Item("Cappuccino", 2.49);
	    desserts.add(cappuccino);

	    ArrayList<Item> dessertCart = new ArrayList<Item>();
	    
	    ArrayList<Item> condiments = new ArrayList<Item>();
	    Item ketchup = new Item("Ketchup", 0.00);
	    condiments.add(ketchup);
	    Item mustard = new Item("Mustard", 0.00);
	    condiments.add(mustard);
	    
	    ArrayList<Item> conCart = new ArrayList<Item>();
	    
	    //Here I inport the scanner and start asking promting the user to input data
	    Scanner input = new Scanner(System.in);

	    System.out.println("Hello, Welcome to StreetEat!" + "\n" + "\nMay I please get a name for your order?");

	    String name = input.nextLine();

	    System.out.println("\nHi " + name + "\n" + "\nWould you like to: " + "\n[1]Order Food" + "\n[2]View Receipt & Total" + "\n[3]Finalize Order" + "\n[4]Cancel Order");
	    
	    //I initialize the variable that will start the main loop and the variable that will represent the total price of the order
	    boolean takingOrder = true;
	    Double total = 0.00;
	    
	    while(takingOrder) {
	      
	      int cmd = Integer.valueOf(input.nextLine());
	      
	      //This is the main if else statement and it has a few more if else statements inside of it that helps promt the user for data and then interperet the users data
	      if(cmd == 1){
	        
	        System.out.println("\nWhich food type would like to order?" + "\n[1]Entrees" + "\n[2]Sides" + "\n[3]Beverages" + "\n[4]Desserts" + "\n[5]Condiments" + "\n[6]Go Back");
	        
	        int fType = Integer.valueOf(input.nextLine());
	        
	        if(fType == 1) {
	          
	          System.out.println("\nEntrees: ");
	          displayList(entrees);
	          System.out.println("[5]Go Back");

	          int order = Integer.valueOf(input.nextLine());
	          takeOrder(entrees,entreeCart,order);
	          
	        } else if(fType == 2) {

	          System.out.println("\nSides: ");
	          displayList(sides);
	          System.out.println("[4]Go Back");

	          int order = Integer.valueOf(input.nextLine());
	          takeOrder(sides,sideCart,order);
	          
	        } else if(fType == 3) {
	          
	          System.out.println("\nBeverages: ");
	          displayList(bevs);
	          System.out.println("[5]Go Back");

	          int order = Integer.valueOf(input.nextLine());
	          takeOrder(bevs,bevCart,order);
	          
	        } else if(fType == 4) {

	          System.out.println("\nDesserts: ");
	          displayList(desserts);
	          System.out.println("[4]Go Back");

	          int order = Integer.valueOf(input.nextLine());
	          takeOrder(desserts,dessertCart,order);
	          
	        } else if(fType == 5) {

	          System.out.println("\nCondiments: ");
	          displayList(condiments);
	          System.out.println("[3]Go Back");

	          int order = Integer.valueOf(input.nextLine());
	          takeOrder(condiments,conCart,order);
	          
	        } else if(fType == 6) {
	        	
	        } else {
	        	
	          System.out.println("\nThe input value is invalid");
		        
	        }

	        System.out.println("\nWould you like to: " + "\n[1]Order Food" + "\n[2]View Receipt & Total" + "\n[3]Finalize Order" + "\n[4]Cancel Order");
	        
	      } else if(cmd == 2) {
	        
	        System.out.println("\nHere is your current receipt and total: ");
	        
	        printReceipt(entreeCart,sideCart,bevCart,dessertCart,conCart,total);
	        
	        System.out.println("\nWould you like to: " + "\n[1]Order Food" + "\n[2]View Receipt & Total" + "\n[3]Finalize Order" + "\n[4]Cancel Order");
	        
	      } else if(cmd == 3) {
	        
	        System.out.println("\nHere is your final receipt and total: ");
	        printReceipt(entreeCart,sideCart,bevCart,dessertCart,conCart,total);
	        
	        System.out.println("\nHave a great day " + name + "!");
	        
	        //Ends the loop
	        takingOrder = false;
	        
	      } else if(cmd == 4) {
	        
	        System.out.println("\nOrder Canceled" + "\nHave a great day " + name + "!");
	        
	        //Ends the loop
	        takingOrder = false;
	        
	      } else {
	    	  
	    	System.out.println("\nThe input value is invalid");
		    System.out.println("\nWould you like to: " + "\n[1]Order Food" + "\n[2]View Receipt & Total" + "\n[3]Finalize Order" + "\n[4]Cancel Order");
		        
	      }
	      
	    }
	    
	    //Closes the scanner that I use throughout the program 
	    input.close();
	    
	  }
	}
