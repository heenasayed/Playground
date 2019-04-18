import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=greatest_of_2_number(n1,n2);
      System.out.print(greatest_of_2_number(result,n3));
	}
  public static int greatest_of_2_number(int num1,int num2)
  { int max_number = 0;
   if(num1>num2)
   {max_number=num1;
   }
   else
   {max_number=num2;
   }
   return max_number;
  }
}