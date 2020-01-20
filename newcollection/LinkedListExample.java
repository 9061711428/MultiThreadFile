package newcollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("competition");
		list.add("Be positive");
		list.add("Happy day");
		Iterator<String> itr=list.iterator();//Iterator interface for iterate the elements in the list
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}
}
