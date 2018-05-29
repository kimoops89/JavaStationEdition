import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Number 1");
		double num1 = scan.nextDouble();
		System.out.println("Enter Number 2");
		double num2 = scan.nextDouble();
		double num3 = num1 + num2;
		double num4 = num1 - num2;
		double num5 = num1 * num2;
		double num6 = num1 / num2;
		double num7 = num1 % num2;
		System.out.println(num1 + "+" +num2 +"=" + num3);
		System.out.println(num1 + "-" +num2 +"=" + num4);
		System.out.println(num1 + "*" +num2 +"=" + num5);
		System.out.println(num1 + "/" +num2 +"=" + num6);
		System.out.println(num1 + "%" +num2 +"=" + num7);
	}
}