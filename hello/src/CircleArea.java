import java.util.*;
public class CircleArea {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ�: ");
		radius = input.nextDouble();
		area = 3.141592 * radius * radius;
		
		System.out.println(area);
		System.out.printf("%6.2f",area);
	
	}

}
