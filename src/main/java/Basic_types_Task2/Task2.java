package basic_types_Task2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean buf=true; int temp;
		do{
		System.out.println('\t'+"МЕНЮ");
		System.out.println("1 - длина окружности ");
		System.out.println("2 - площадь окружности ");
		System.out.println("3 - площадь кольца ");
		System.out.println("4 - периметр  треугольника  ");
		System.out.println("5 - площадь треугольника  ");
		System.out.println("6 - периметр прямоугольника ");
		System.out.println("7 - площадь  прямоугольника  ");
		System.out.println("другой символ - Выход  ");
		System.out.print("Введите выбранное действие:");
		String choice=in.next();
		switch(choice) {
	    case "1":{ 
	    	System.out.print("Найдем длину окружности с радиусом =");
			double radius1=in.nextDouble();
			System.out.println("L = "+circumference (radius1));
			break;}
		case "2":{ 
			System.out.print("Найдем площадь окружности с радиусом =");
			double radius2=in.nextDouble();
			System.out.println("S = "+circlearea (radius2));
			break;}
		case "3": {
			int count=0; 
			System.out.println("Найдем площадь кольца ");
			do{
				System.out.print(" внешний радиус=");
				double radiusout=in.nextDouble();
				System.out.print("внутренний радиус=");
				double radiusin=in.nextDouble();
				if(radiusout>radiusin){
				count=1;
				System.out.print("S = "+ ringarea (radiusout, radiusin));
			   }
			else System.out.println("Внешний радиус не может быть меньше внутренненго. Попробуйте еще раз.");
			}while(count==0);
			System.out.println();
			break;}
		case "4": {
			System.out.println("Найдем периметр треугольника:");
			System.out.print("Сторона 1 =");
			double side1=in.nextDouble();
			System.out.print("Сторона 2 =");
			double side2=in.nextDouble();
			System.out.print("Сторона 3 =");
			double side3=in.nextDouble();
			System.out.println("P = "+triangleperimeter(side1,side2,side3));
			break;}
		case "5": {
			System.out.println("Найдем площадь треугольника:");
			System.out.print("Сторона 1 =");
			double side1=in.nextDouble();
			System.out.print("Сторона 2 =");
			double side2=in.nextDouble();
			System.out.print("Сторона 3 =");
			double side3=in.nextDouble();
			System.out.println("S = "+trianglearea (side1,side2,side3));
		    break;}
		case "6": {
			System.out.println("Найдем периметр прямоугольника:");
			System.out.print("длина =");
			double length=in.nextDouble();
			System.out.print("ширина =");
			double width=in.nextDouble();
			System.out.println("P = "+rectangleperimeter(length,width));
			break;}
		case "7": {
			System.out.println("Найдем площадь прямоугольника:");
			System.out.print("длина =");
			double length=in.nextDouble();
			System.out.print("ширина =");
			double width=in.nextDouble();
			System.out.println("S = "+rectanglearea (length,width));
			break;}
		default:{
		    System.out.println("1-Завершить программу?");
		    System.out.println("else-Назад в меню");
		    temp=in.nextInt();
		    if (temp==1){buf=false; }
		    break;}
		   
		}
	} while(buf==true);
}

//----------------------------------------------------------------------------------------	
	public static double circumference(double radius){
		double circumference = 2*Math.PI*radius;
		return circumference;
	}
	public static double circlearea (double radius){
		double circlearea =Math.PI*radius*radius;
		return circlearea;
	}
	public static double ringarea (double radiusout, double radiusin ){
		double ringarea =circlearea(radiusout)-circlearea(radiusin) ;
		return ringarea;
	}
	public static double triangleperimeter (double side1, double side2, double side3 ){
		double perimeter =side1+side2+side3 ;
		return perimeter;
	}
	public static double trianglearea (double side1, double side2, double side3 ){
		double p=triangleperimeter(side1, side2, side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	
	public static double rectangleperimeter (double side1, double side2){
		double p=(side1+side2)*2;
		return p;
		}
	public static double rectanglearea (double side1, double side2){
		double s=(side1 * side2);
		return s;
		}
	}