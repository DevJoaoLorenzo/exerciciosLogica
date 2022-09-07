package application;

import java.util.Locale;
import java.util.Scanner;
	//Entra com as medidas de dois triangulos e mostrar a area desses, também mostrar qual tem a area maior
public class ex009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1,x2,x3,y1,y2,y3;
		double areaX, areaY;
		
		System.out.println("Entre com as medidas do triângulo X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		System.out.println("Entre com as medidas do triângulo Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();;
		y3 = sc.nextDouble();
		
		areaX = area(x1,x2,x3);
		areaY = area(y1,y2,y3);
		
		System.out.println("Area do triângulo X: " + areaX);
		System.out.println("Area do triângulo Y: " + areaY);
		if(areaX>areaY)
			System.out.println("Maior area: X");
		else
			System.out.println("Maior area: Y");
		sc.close();

	}
	
	public static double area (double a, double b, double c) {
		double p = (a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	

}
