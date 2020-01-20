package newcollection;
import java.util.*;
public class ReverseListExample {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> stationary=new ArrayList<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			stationary.add(sc.next());//read n number of elements from user
			
		}
		System.out.println(stationary);
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(stationary.get(i)+" ");
			
		}
		
	}

}
