public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum;
		Math obj = new Math();
		sum = obj.add(2, 3); // 인수 보내는 쪽에서
		System.out.println("2와 3의 합은 " + sum);
		sum = obj.add(7, 8);
		System.out.println("7와 8의 합은 " + sum);
	}

}
