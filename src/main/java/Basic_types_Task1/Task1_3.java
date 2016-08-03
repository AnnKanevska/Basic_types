package Basic_types_Task1;

import java.util.Scanner;

public class Task1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the date");
       
        	System.out.print("Last name :");
        	String lname=in.next();
        	System.out.print("First name:");
        	String fname=in.next(); 
        	System.out.print("Third name:");
        	String tname=in.next(); 
        	System.out.print("Group number :");
        	int number=in.nextInt(); 
        	System.out.print("Class time -");
        	System.out.print("hours :");
        	int hours=in.nextInt(); 
        	System.out.print("minutes :");
        	int minutes=in.nextInt(); 
        	System.out.println("ФИО:" + lname +" "+fname+" " + tname);
        	System.out.println("Номер группы:" + number);
        	System.out.println("Время занятий:" + hours +":"+minutes);
        	 
	}
}
