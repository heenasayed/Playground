import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int ld=n%10;
      while(n>=10)
      { n=n/10;
      }
      int sum = ld+n;
      System.out.println(sum);
	}
}