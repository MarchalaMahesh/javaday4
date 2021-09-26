package javaday4;

import java.util.Scanner;

public class MobileDriver {
	public static void main(String[] args)
	{
		 Mobile m = new Mobile();
		 boolean flag = false;
		 Scanner scan = new Scanner(System.in);
		 
		 while(!flag)
		 {
			 System.out.println("enter the option below ..");
			 System.out.println("1.insert sim");
			 System.out.println("2.remove");
			 System.out.println("3.exit");
			 
			 int input = scan.nextInt();
			   if(input==1)
			   {
				   m.insertSim(new Sim());
			   }
			   else if(input==2)
			   {
				   m.removeSim(new Sim());
			   }
			   else if(input==3)
			   {
				   flag=true;
			   }
			   else
			   {
				   System.out.println("invalid");
			   }
			  
			   
		 }
		 
}
}