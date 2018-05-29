import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = scanner.nextInt();
		System.out.println("Enter opcode");
		String code1 = scanner.next();
		System.out.println("Enter number2");
		int num2 = scanner.nextInt();
		int num3 = 0;
		String result = "";
		switch(code1){
			case "+": num3 = num1 + num2;break;
			case "-": num3 = num1 - num2;break;
			case "*": num3 = num1 * num2;break;
			case "/": num3 = num1 / num2;break;
			case "%": num3 = num1 % num2;break;
			default: result = "잘못된 연산자 입력" ;break;
		} 
		if(!result.equals("잘못된 연산자 입력")){
			result = num1 + code1 + num2 + "=" + num3;
		}
			System.out.print(result);
		}
		
	}