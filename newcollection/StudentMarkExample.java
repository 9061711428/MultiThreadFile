package newcollection;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class StudentMarkExample {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> studentlist=new ArrayList<Integer>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		studentlist.add(sc.nextInt());//read n number of elements from user
		
	}
	System.out.println("actual list is"+studentlist);
	ArrayList<Integer> duplicatestudentlist=(ArrayList<Integer>)studentlist.clone();//copy the previous list to new ArrayList
	Collections.sort(duplicatestudentlist);
	System.out.println("sorted list is"+duplicatestudentlist);
	
}
}
