abstract class Shape
{
  abstract void NumberOfSides();
}
class Rectangle extends Shape
{
  void NumberOfSides()
  {
    System. out. println("No of sides in a rectangle is 4");
  }
}
class Triangle extends Shape
{
  void NumberOfSides()
  {
    System. out. println("No of sides in a triangle is 3");
  }
}
class Hexagon extends Shape
{
  void NumberOfSides()
  {
    System. out. println("No of sides in a hexagon is 6");
  }
}
class Test
{
  public static void main(String args[]) 
  {
    Rectangle r=new Rectangle ();
    Triangle t=new Triangle();
    Hexagon h=new Hexagon ();
    r. NumberOfSides();
    t. NumberOfSides();
    h. NumberOfSides();
  }
}
    
    
