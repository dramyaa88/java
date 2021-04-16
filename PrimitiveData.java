/**This program helps to understand the default values of primitive datatypes 
 * @author ramyaa.dhanasekaran
 * @date 1-4-21
 * */
 
public class PrimitiveData {
	//declaring data members
	//instance variable
	boolean flag;
	char gender;
	int empId;
	float salary;
	long phoneNo;
	double avgSalary;
	short datas;
	byte data;
	static int count;
	public static void main(String[] args) {
		
		//local variable 
		int mydata = 8;
		PrimitiveData a = new PrimitiveData();
		System.out.println("Flag (boolean)"+  a.flag);
		System.out.println("gender (character)"+a.gender);
		System.out.println("Emp id (integer)"+a.empId);
		System.out.println("salary (float)"+a.salary);
		System.out.println("phoneNo (long)"+a.phoneNo);
		System.out.println("average salary (double)"+a.avgSalary);
		System.out.println("datas (short)"+a.datas);
		System.out.println("data (byte)"+a.data);
		System.out.println("staticVariable count " +count);
		System.out.println("local variable " +mydata);
	}
}
