import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      for(int idx=0;idx<=n-1;idx++)
      { arr[idx]=in.nextInt();
      }
      int freq[] = new int[k];
      for(int i=0;i<=k-1;i++)
      { freq[i]=0;
      }
      for(int idx=0;idx<=n-1;idx++)
      { freq[arr[idx]-1]++;
      }
      for(int idx=0;idx<=k-1;idx++)
      { System.out.println((idx+1)+" "+freq[idx]);
      }
    }
}