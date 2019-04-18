import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int choose = in.nextInt();
      switch(choose)
      { case 1: int side = in.nextInt();
                int area_sq = side*side;
                System.out.println(area_sq);
         break;
       case 2: int length = in.nextInt();
               int breadth = in.nextInt();
              int area_rec = length*breadth;
              System.out.println(area_rec);
           break;
       case 3: int base = in.nextInt();
               int height = in.nextInt();
               int area_tri = base*height/2;
               System.out.println(area_tri);
          break;
       case 4: int radius =in.nextInt();
              double area_circle = 3.14*radius*radius;
              System.out.println(area_circle);
           break;
      }
    }
}