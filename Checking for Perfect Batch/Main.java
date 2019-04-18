import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int idx=0;idx<n;idx++)
    { list[idx]=in.nextInt();
    }
    perfect_batch(list,n);
  }
  public static void perfect_batch(int list[],int n)
  { boolean is_perfect_batch=true;
   int batch_sum=list[0]+list[1]+list[2];
   for(int idx=3;idx<=n-1;idx=idx+3)
   { int curr_batch_sum=list[idx]+list[idx+1]+list[idx+2];
    if(curr_batch_sum!=batch_sum)
    { is_perfect_batch=false;
    }
   }
   if(is_perfect_batch==true)
   { System.out.println("Perfect Batch");
   }
   else
   { System.out.println("Not a Perfect Batch");
   }
  }
}