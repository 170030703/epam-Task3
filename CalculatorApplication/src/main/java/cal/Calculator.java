package cal;
import cal.Addition;
import cal.Subtration;
import cal.Multiplication;
import cal.Divide;
import java.util.*;
/*
 * @author Bhargav Reddy id:170030703
 */
public class Calculator {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Calculator Application");
	int val1;
	int val2;
	System.out.println("Enter Two Numbers");
	System.out.println("Enter Value1");
	val1=sc.nextInt();
	System.out.println("Enter Value2");
	val2=sc.nextInt();
	System.out.println(" Select any operation +  -  /  *");
	System.out.println(" 1-Addition");
	System.out.println(" 2-Subtraction");
	System.out.println(" 3-Divide");
	System.out.println(" 4-multiplication");
	int s;
	s=sc.nextInt();
	// creating differnt applications performing calculation 
	if(s==1)
	{
		Addition a=new Addition();
		int result=a.add(val1,val2);
		System.out.println("---performing Addition Operation----");
		System.out.println("result is "+result);
		
	}
	else if(s==2)
	{
		Subtration s1=new Subtration();
		int result2=s1.sub(val1,val2);
		System.out.println("---performing Subtraction Operation---");
		System.out.println("result is "+result2);
	}
	else if(s==3)
	{
		Divide d=new Divide();
		int result3=d.div(val1,val2);
		System.out.println("---performing Division Operation---");
		System.out.println("result is "+result3);
	}
	else if(s==4)
	{
		Multiplication m=new Multiplication();
		int result4=m.mul(val1,val2);
		System.out.println("---performing Multiplication Operation-----");
		System.out.println("result is "+result4);
	}
	
	sc.close();
	
	}
	

}
