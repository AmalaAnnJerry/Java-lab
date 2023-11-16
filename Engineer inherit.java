class Employee
{
  void display ()
  {
    System. out. println("Name of class is employee");
  }
  void calcsalary()
  {
    System. out. println("Salary of employee is 10000 ");
  }
}
class Engineer extends Employee
{
  void calcsalary()
  {
    System. out. println("Salary of employee is 20000") ;
    super. calcsalary();
  }
}
class Prgm
{
  public static void main( String args[])
  {
    Engineer e=new Engineer();
    e. display ();
    e. calcsalary();
  }
}