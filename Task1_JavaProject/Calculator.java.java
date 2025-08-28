import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("****************   Simple Calculator   ****************");
System.out.println("\t 1. Addition.");
System.out.println("\t 2. Subtraction.");
System.out.println("\t 3. Multiplication.");
System.out.println("\t 4. Division.");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
double result;
if(choice>=1 && choice<=4)
{
System.out.println("Enter the first element:");
double value1=sc.nextDouble();
System.out.println("Enter the second element:");
double value2=sc.nextDouble();
switch(choice)
{
case 1:
result=value1+value2;
System.out.println("The Result is (ADD):"+result);
break;
case 2:
result=value1-value2;
System.out.println("The Result is (sub):"+result);
break;
case 3:
result=value1*value2;
System.out.println("The Result is (multi):"+result);
break;
case 4:
if(value2!=0)
{
result=value1/value2;
System.out.println("The Result is (divide):"+result);
}
else
{
System.out.println("Error!! Division by zero");
}
break;
}
}
else
{
System.out.println("Invalid Input!");
}
sc.close();
}
}