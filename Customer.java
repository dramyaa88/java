import java.util.*;
public class Customer {
	int custId;
	String custName;
	
	//constructor
	public Customer()
	{
		custId = 0;
		custName = null;
	}
	Customer cust[] = new Customer[2];
	public void arrayOfObjects()
	{
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			cust[i] = new Customer();
			System.out.println("Enetr customer "+i + "details");
			cust[i].custId = sc.nextInt();
			cust[i].custName = sc.next();
		}
	}
	
	public void printDetails()
	{
		for(Customer c : cust)
		{
			System.out.println("custId "+c.custId);
			System.out.println("custName "+c.custName);
		}
	}
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.arrayOfObjects();
		cust.printDetails();
	}
}
