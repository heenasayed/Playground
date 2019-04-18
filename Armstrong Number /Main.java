import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int c=num;
      int d=0;
      if(num==0)
        System.out.println(num);
      else
      { while(num>0)
      { d++;
       num = num/10;
      }
      }
      num=c;
      int sum=0;
      int pow=1;
      while(num>0)
      { int r=num%10;
       for(int i=1;i<=d;i++)
       { pow=pow*r;
       }
       sum=sum+pow;
       pow=1;
       num=num/10;
      }
      if(sum==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}