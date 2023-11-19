import java.util.*;
class Student
{
	int rollNumber;
	double mathMarks,phyMarks,chemMarks;
	String name;

void getRequiredDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter details:\n");
	System.out.println("Name:");
	name=sc.next();
	System.out.println("Rollno:");
	rollNumber=sc.nextInt();
	System.out.println("MathMarks:");
	mathMarks=sc.nextDouble();
	System.out.println("PhyMarks:");
	phyMarks=sc.nextDouble();
	System.out.println("ChemMarks:");
	chemMarks=sc.nextDouble();
}

void displayAverage()
{
	double avg;
	avg=(double)(mathMarks+phyMarks+chemMarks)/3;
	System.out.println("Average marks: "+avg);
}
}

class Implement
{
public static void main(String args[])
{
	Student S=new Student();
	S.getRequiredDetails();
	S.displayAverage();
}
}


