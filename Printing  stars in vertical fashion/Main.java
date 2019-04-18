import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int i;
    for(i=1;i<=n;i++)
    {   System.out.print("*");
        System.out.print("\n");
    }
  }
}