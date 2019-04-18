import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<= arr_size - 1;idx++)
      { arr[idx]=in.nextInt();
      }
      int value = in.nextInt();
      perfect_couple(arr_size,arr,value);
    }
  public static void perfect_couple(int arr_size,int arr[],int value)
  { 
    for(int idx1=0;idx1 <= arr_size-1;idx1++)
  { for(int idx2=idx1+1;idx2<=arr_size-1;idx2++)
  { int sum = arr[idx1]+arr[idx2];
   if(sum == value)
   { System.out.println(arr[idx1]+","+" "+arr[idx2]);
   }
  }
  }
  }
}