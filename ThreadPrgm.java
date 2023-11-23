class Odd extends Thread
{
public void run()
{
for(int i=1;i<=100;i++)
{
if(i%2!=0)
{
System.out.println("Odd no"+"-"+i+"\n");
}
}
System.out.println("Exiting thread from A");
}
}
class Even extends Thread
{
public void run()
{
for(int i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println("Even no"+"-"+i+"\n");
}
}
System.out.println("Exiting thread from B");
}
}
class ThreadPrgm
{
public static void main(String args[])
{
Odd o=new Odd();
o.start();
Even e=new Even();
e.start();
}
}
