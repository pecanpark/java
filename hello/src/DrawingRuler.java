import java.util.Scanner;

public class DrawingRuler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " ......... ";
		String s2 = s1 + "|" + s1;
		String s3 = s2 + "|" + s2;
		//int age = 30;
		int age;
		Scanner input = new Scanner(System.in);
		 System.out.print("���̸� �Է��Ͻÿ�: ");
		 age = input.nextInt();
		System.out.println("�����̸� " + age + "���� �˴ϴ�. ");
	}

}
