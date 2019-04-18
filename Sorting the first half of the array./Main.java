import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int idx=0;idx<n;idx++)
    { list[idx]=in.nextInt();
    }
    insertion_sort(n,list);
  }
  public static void insertion_sort(int n,int list[])
  { for(int idx1=1;idx1<n/2;idx1++)
  { int key=list[idx1];
   int idx2=idx1-1;
   while((idx2>=0)&&(list[idx2]>key))
   { list[idx2+1]=list[idx2];
    idx2--;
   }
   list[idx2+1]=key;
  }
   for(int i=0;i<n;i++)
   { System.out.print(list[i]+" ");
   }
  }
}