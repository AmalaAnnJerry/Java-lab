class Employee
{
  int age,phno, salary;
  String name, address;
  void printsalary()
  {
    System. out. println("Salary of employee:"+salary) ;
  }
}
class Officer extends Employee
{
  String specialization;
}
class Manager extends Employee
{
  String department;
}
class Prgm
{
  public static void main (String args [])
  {
    Officer o=new Officer();
    o.name="Ram";
    o.age= 35;
    o.phno=9876543;
    o.salary=30000;
    o.address="Balaji Road,Haryana";
    o.specialization="Finance";
    System. out. println("Officer details\n");
    System. out. println("Name: "+o.name);
    System. out. println("Age: "+o.age);
    System. out. println("Phno: "+o.phno);
    System. out. println("Salary: "+o.salary);
    System. out. println("Address: "+o.address);
    System. out. println("Specialization: "+o.specialization);
    o. printsalary();
    Manager m= new Manager();
    m.name="Sam";
    m.age= 45;
    m.phno=987656;
    m.salary=60000;
    m.address="Gandhi Road,Jharkhand";
    m.department=" Human Resources";
    System. out. println("\nManager details\n");
    System. out. println("Name: "+m.name);
    System. out. println("Age: "+m.age);
    System. out. println("Phno: "+m.phno);
    System. out. println("Salary: "+m.salary);
    System. out. println("Address: "+m.address);
    System. out. println("Department: "+m.department);
    m. printsalary();
   }
}