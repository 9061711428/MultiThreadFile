package newcollection;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		    ArrayList<String> groceryList=new ArrayList<String>();
		    groceryList.add("spice-mixture");
		     groceryList.add("cumin");
		     System.out.println(groceryList);
		     groceryList.remove("cumin");
		      groceryList.remove("spice-mixture");
		     System.out.println(groceryList);
	}
}
