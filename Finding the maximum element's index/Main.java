import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    int max_idx;
    for(int idx=0;idx<n;idx++)
    { list[idx]=in.nextInt();
    }
    if(list[0]>list[1])
    { max_idx=0;
    }
    else
    { max_idx=1;
    }
    for(int idx=2;idx<=n-1;idx++)
    { if(list[max_idx]<list[idx])
    { max_idx=idx;
    }
    }
    System.out.println(max_idx);
  }
}