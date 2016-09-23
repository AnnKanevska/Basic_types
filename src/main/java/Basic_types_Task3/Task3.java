package basic_types_Task3;

import java.util.Scanner;

import basic_types_Task2.Task2;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean buf=true;
		do{
			System.out.println('\t'+"МЕНЮ");
			System.out.println("1 - Oбъем цилиндра ");
			System.out.println("2 - Объем полого цилиндра");
			System.out.println("3 - Площадь боковой поверхности цилиндра");
			System.out.println("4 - Объем шара ");
			System.out.println("5 - Площадь поверхности шара  ");
			System.out.println("6 - Объем и площадьповерхности параллелепипеда");
			System.out.println("7 - Объем и площадьповерхности правильного тетраэдра  ");
			System.out.println("другой символ - Выход  ");
			System.out.print("Введите выбранное действие:");
			String choice=in.next();
			switch(choice) {
		    case "1":{
		System.out.println("Найдем объем цилиндра ");
		System.out.print("радиус = ");
		double radius1=in.nextDouble();
		System.out.print("высота = ");
		double h=in.nextDouble();
		System.out.println("V = "+cylinderVolume (h,radius1));
		break;}
		    case "2":{
		    	int count=0; 
				System.out.println("Найдем объем полого цилиндра  ");
				do{
					System.out.print(" внешний радиус=");
					double radiusout=in.nextDouble();
					System.out.print("внутренний радиус=");
					double radiusin=in.nextDouble();
					System.out.print("высота = ");
					double h1=in.nextDouble();
					if(radiusout>radiusin){
					count=1;
					System.out.println("V = "+hollowCylinderVolume (h1,radiusout,radiusin));
				   }
				else System.out.println("Внешний радиус не может быть меньше внутренненго. Попробуйте еще раз.");
				}while(count==0);
				System.out.println();
		            break;}
		    case "3":{
		    	
		System.out.println("Найдем площадь боковой поверхности цилиндра ");
		System.out.print("радиус = ");
		double r1=in.nextDouble();
		System.out.print("высота = ");
		double h2=in.nextDouble();
		System.out.println("S = "+surfaceArea (h2,r1));
		 break;}
		    case "4":{
		System.out.println("Найдем объем шара ");
		System.out.print("радиус = ");
		double r2=in.nextDouble();
		System.out.println("V = "+sphereVolume(r2));
		 break;}
		    case "5":{
		System.out.println("Найдем площадь поверхности шара ");
		System.out.print("радиус = ");
		double r3=in.nextDouble();
		System.out.println("S = "+sphereSurfaceArea(r3));
		 break;}
		    case "6":{
		System.out.println("Найдем объем и площадьповерхности параллелепипеда");
		System.out.print("длина =");
		double length=in.nextDouble();
		System.out.print("ширина =");
		double width=in.nextDouble();
		System.out.print("высота =");
		double height=in.nextDouble();
		System.out.println("V = "+parallelepipedVolume(length,width,height));
		System.out.println("S = "+parallelepipedSurfaceArea (length,width,height));
		 break;}
		    case "7":{
		System.out.println("Найдем объем и площадьповерхности правильного тетраэдра");
		System.out.print("длина ребра=");
		double a=in.nextDouble();
		System.out.println("V = "+tetrahedronVolume(a));
		System.out.println("S = "+tetrahedronSurfaceArea (a));
		 break;}
		    default:{
			    System.out.println("---------------------------END-------------------");
			    buf=false;
			    break;}
			   
			}
		} while(buf==true);
	}
	//объем цилиндра
	public static double cylinderVolume (double h, double r){
		double cylindervolume= basic_types_Task2.Task2.circlearea(r)*h;
		return cylindervolume;
	}
	//объем полого цилиндра
	public static double hollowCylinderVolume (double h, double rout, double rin){
		double cylindervolume= basic_types_Task2.Task2.ringarea(rout,rin)*h;
		return cylindervolume;
	}
	//площадь боковой поверхности цилиндра
	public static double surfaceArea (double h, double r){
		double cylindervolume= basic_types_Task2.Task2.circumference(r)*h;
		return cylindervolume;
	}
	//объем шара
	public static double sphereVolume ( double r){
		double spherearea= basic_types_Task2.Task2.circlearea(r)*(4.0/3.0)*r;
		return spherearea;
	}
	//площадь поверхности шара
	public static double sphereSurfaceArea(double r){
		double sphereSurfaceArea= basic_types_Task2.Task2.circlearea(r)*4.0;
		return sphereSurfaceArea;
	}
	//объем прямоуольного параллелепипеда
	public static double parallelepipedVolume ( double a,double b,double c){
		double parallelepipedVolume= basic_types_Task2.Task2.rectanglearea(a,b)*c;
		return parallelepipedVolume;
	}
	//площадь параллелепипеда
	public static double parallelepipedSurfaceArea ( double a,double b,double c){
		double parallelepipedArea= basic_types_Task2.Task2.rectangleperimeter(a,b)*c+2*basic_types_Task2.Task2.rectanglearea(a,b);
		return parallelepipedArea;
	}
	//объем тераэдра
	public static double tetrahedronVolume(double a){
		double tetrahedronVolume= Math.pow(a,3)*(Math.sqrt(2.0)/12);
		return tetrahedronVolume;
	}
	//площадь тераэдра
	public static double tetrahedronSurfaceArea(double a){
		double tetrahedronSurfaceArea= a*a*Math.sqrt(3.0);
		return tetrahedronSurfaceArea;
	}
	
}
