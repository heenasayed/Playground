import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx <= arr_size-1;idx++)
      { arr[idx]=in.nextInt();
      }
      subsets_of_size_3(arr_size,arr);
    }
  public static void subsets_of_size_3(int arr_size,int arr[])
  { for(int idx1=0;idx1 <= arr_size-2;idx1++)
  { for(int idx2=idx1+1;idx2 <=arr_size-1;idx2++)
  { for(int idx3=idx2+1;idx3 <= arr_size-1;idx3++)
  { System.out.print("("+arr[idx1]+","+" "+arr[idx2]+","+" "+arr[idx3]+")"+" ");
  }
  }
   System.out.println();
  }
  }
}