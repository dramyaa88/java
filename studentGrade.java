import java.util.*;
public class studentGrade {
	int studMark;
	int studName;
	int i=1;
	char grade;
	
	public void getMarks()
	{
		Scanner sc = new Scanner(System.in);
		while(i<=3)
		{
			System.out.println("Enter the mark of "+i + "person");
			studMark = sc.nextInt();
			if(studMark>50)
			{
				System.out.println("Passed and the grade is ");
				if(studMark>=50 && studMark<=60)
					grade = 'B';
				else if(studMark>60 && studMark<=70)
					grade = 'G';
				else if(studMark>70 && studMark<=80)
					grade = 'E';
				else 
					grade = 'O';
			}
			else
			{
				System.out.println("Fail");
			}
			switch(grade)
			{
			case 'B':
				System.out.println("Better");
				break;
			case 'G':
				System.out.println("Goodr");
				break;
			case 'E':
				System.out.println("Excellent");
				break;
			case 'O':
				System.out.println("Outstanding");
				break;
			}
			i++;
		}
	}
	public static void main(String args[])
	{
		studentGrade c = new studentGrade();
		c.getMarks();
	}
}
