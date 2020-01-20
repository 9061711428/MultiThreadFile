package newcollection;
import java.util.*;
public class LinkedListExample2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		
		
		
		int n1=sc.nextInt();
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=0;i<n1;i++)
		{
			list1.add(sc.next());
		}
		System.out.println("Actual list is"+list);
		list.addAll(list1);
		System.out.print("New list is"+list);

	}

}
