import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int idx=0;idx<arr_size;idx++)
    { arr[idx]=in.nextInt();
    }
     int sum_arr[]=new int[3*arr_size];
     increasing_sub_array(arr_size,arr,sum_arr);
    }
    public static void increasing_sub_array(int arr_size,int arr[],int sum_arr[])
    { for(int idx1=0;idx1<=arr_size-1;idx1++)
    { int key=arr[idx1];
     int flag=1;
     for(int idx2=idx1+1;idx2<=arr_size-1;idx2++)
     { if(arr[idx2]>key)
     { for(int idx3=idx1;idx3<=idx2;idx3++)
     { if(arr[idx3]>arr[idx2])
      flag=0;
     }
      if(flag == 1)
        System.out.println(key+","+arr[idx2]);
     }
      flag = 1;
     }
    }
    }
  }