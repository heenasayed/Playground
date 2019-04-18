import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++)
      { arr[idx]=in.nextInt();
      }
      zeroes(arr_size,arr);
      for(int idx=0;idx<=arr_size-1;idx++)
      { System.out.print(arr[idx]+" ");
      }
    }
  public static void zeroes(int arr_size,int arr[])
  { int count=0;
   for(int idx=0;idx<=arr_size-1;idx++)
   { if(arr[idx]!=0)
   { int temp=arr[idx];
    arr[idx]=arr[count];
    arr[count]=temp;
    count++;
   }
   }
  }
}