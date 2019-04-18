import java.util.Scanner;
class Main
{ public static void main(String args[])
{ Scanner in = new Scanner(System.in);
 int base = in.nextInt();
 int exponent=in.nextInt();
 System.out.print(pow(base,exponent));
}
 public static int pow(int base,int exponent)
 { int pow=1;
  while(exponent>=1)
  { pow=pow*base;
   exponent--;
  }
  return pow;
 }
}