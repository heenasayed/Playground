import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int f = in.nextInt();
      int sum = f/100+f%10;
      System.out.println(sum);
	}
}