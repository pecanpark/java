import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, max;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		
		x = input.nextInt();
		
		System.out.print("�ι�° ����: ");
		
		y = input.nextInt();
		
		if (x > y)
			max = x;
		else
			max = y;
		System.out.println("ū ���� " + max);
	}

}