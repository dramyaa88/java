import java.util.*;
public class Employee {
	
	int size = 2;
	int empId[] = new int[size];
	int empName[] = new int[size];
//	int empId;
//	String empName;
	
	public void getEmpDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		for(int i=0;i<size;i++)
		{
			empId[i] = sc.nextInt();
			empName[i] = sc.next();
		}
	}
	//public method
//	public void enterEmpDetails()
//	{
//		empId = 100;
//		empName = "Ramyaa";
//	}
//	public void printEmpDetails()
//	{
//		System.out.println("Emp id "+empId);
//		System.out.println("empName "+empName);
//	}
	public static void main(String[] args) {
		//accessing the non static methods
		Employee obj = new Employee();
//		obj.enterEmpDetails();
		obj.getEmpDetails();
	}

}
