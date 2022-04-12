
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0x0fff;  //0b0000111111111111
		int y = 0x0fff0;  //0b1111111111110000
		
		System.out.printf("%x\n", (x & y)); // AND
		System.out.printf("%x\n", (x | y));
		System.out.printf("%x\n", (x ^ y));
		System.out.printf("%x\n", ~x);
		System.out.printf("%x\n", (x << 4));
		System.out.printf("%x\n", (x >> 4));
		System.out.printf("%x\n", (-1 >>> 4));
	}

}
