import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){
		System.out.println("�󸶿���?");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1+ "�� �Դϴ�.");
		System.out.println("� �帱���?");
		int num2 = scan.nextInt();
		int num3 = num1*num2;
		System.out.println("�� �ݾ��� "+ num3 +"�� �Դϴ�.");
		System.out.println("��ο�. ����ּ���.");
		System.out.println("�� �ۼ�Ʈ DC �ұ��?");
		int num4 = scan.nextInt();
		System.out.println(num4 + "�ۼ�Ʈ��");
		String result = "";
		int num5 = num3-(num3*num4/100);
		if(num4>=10){
			result = "�� �Ⱦƿ�";
		} else{
			result = num5 + "�� �Դϴ�.";
		}

		System.out.print(result);
	}
}