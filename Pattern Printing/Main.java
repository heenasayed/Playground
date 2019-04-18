import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      for(int p=1;p<=row;p++)
      { for(int q=column;q>column-p;q--)
      { System.out.print(q);
      }
       for(int q=1;q<=column-p;q++)
       { System.out.print(row - p + 1);
       }
       System.out.println();
      }
    }
}