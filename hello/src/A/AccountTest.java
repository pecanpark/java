package A;
public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom"); 
		obj.setBalance(100000);
		obj.setAge(10);
		System.out.println("�̸��� " + obj.getName() + "�̰� �����ܰ�� " + obj.getBalance() + "�� �̰� ���̴� " + obj.getAge() + "�� �Դϴ�.");

}

}