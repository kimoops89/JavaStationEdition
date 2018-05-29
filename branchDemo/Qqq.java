import java.util.Scanner;
public class Qqq{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = scan.nextInt();
		System.out.println("Enter opcode");
		System.out.println("if Plus then Enter 1");
		System.out.println("if Minus then Enter 2");
		System.out.println("if Multi then Enter 3");
		System.out.println("if Divid then Enter 4");
		System.out.println("if Mudular then Enter 5");
		int opcode = scan.nextInt();
		String code1 = "";
		System.out.println("Enter number2");
		int num2 = scan.nextInt();
		int num3 = 0;

		if(opcode == 1){
			num3 = num1 + num2;
			code1 = "+";
			     
		} else if(opcode == 2){
			num3 = num1 - num2;
			code1 = "-";

		} else if(opcode == 3){
			num3 = num1 * num2;
			code1 = "*";			

		} else if(opcode == 4){
			num3 = num1 / num2;
			code1 = "/";

		} else{
			num3 = num1 % num2;
			code1 = "%";

		}
		System.out.println(num1 + code1 + num2 +"="+ num3);
	}
}