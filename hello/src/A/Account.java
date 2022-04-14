package A;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	private int age;

	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getBalance() {	return balance; }
	public void setBalance(int balance) {	this.balance = balance; }
	public int getAge() { 	return age;	}
	public void setAge(int age)	{
		if (age < 0)
			this.age = 0;
		else 
			this.age = age;
	}
	
}
