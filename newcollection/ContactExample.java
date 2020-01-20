package newcollection;
import java.util.ArrayList;
import java.util.Scanner;

class Contact 
{
	private String name;
	private double phoneNumber;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPhn(double phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public String getName()
	{
		return name;
	}
	public double getphn()
	{
		return phoneNumber;
	}
}


public class ContactExample 
{
	public static void main(String args[])
	{
		Contact obj=new Contact();
		obj.setName("ammmu");
		obj.setPhn(123456);
		Contact obj1=new Contact();
		obj1.setName("abu");
		obj1.setPhn(90876);
		ArrayList<Contact> contact=new ArrayList<Contact>();
		contact.add(obj);
		contact.add(obj1);
		System.out.println(contact.get(0).getName()+" "+contact.get(0).getphn());
		System.out.println(contact.get(1).getName()+" "+contact.get(1).getphn());
		//read n number of elements from user
			
		}

}

