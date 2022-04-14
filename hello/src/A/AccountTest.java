package A;
public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom"); 
		obj.setBalance(100000);
		obj.setAge(10);
		System.out.println("이름은 " + obj.getName() + "이고 통장잔고는 " + obj.getBalance() + "원 이고 나이는 " + obj.getAge() + "살 입니다.");

}

}