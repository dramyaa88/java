import java.util.*;
public class printEmpDetailsArray {
	int size = 2;
	int empId[] = new int[size];
	int empName[] = new int[size];
	
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
}
