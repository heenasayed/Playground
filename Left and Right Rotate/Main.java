import java.util.Scanner;
class Main 
{
  public static void left_rotate_even_elem(int arr_size,int arr[],int no_of_rotation)
    {
    	//Try your code here
    int first_even_elem_idx=1;
    int last_even_elem_idx;
    if(arr_size%2==0)
    { last_even_elem_idx=arr_size-1;
    }
    else
    { last_even_elem_idx=arr_size-2;
    }
    for(int r=1;r<=no_of_rotation;r++)
    { int temp=arr[first_even_elem_idx];
     for(int idx=3;idx<arr_size;idx=idx+2)
     { arr[idx-2]=arr[idx];
     }
     arr[last_even_elem_idx]=temp;
    }
  	}
  public static void right_rotate_odd_elem(int arr_size,int arr[],int no_of_rotation)
  { int first_odd_elem_idx=0;
   int last_odd_elem_idx;
   if(arr_size%2==1)
   { last_odd_elem_idx=arr_size-1;
   }
   else
   { last_odd_elem_idx=arr_size-2;
   }
   for(int r=1;r<=no_of_rotation;r++)
   { int temp=arr[last_odd_elem_idx];
    for(int idx=(last_odd_elem_idx-2);idx>=0;idx=idx-2)
    { arr[idx+2]=arr[idx];
    }
    arr[first_odd_elem_idx]=temp;
   }
  }
  public static void main(String args[])
  { Scanner in = new Scanner(System.in);
   int arr_size=in.nextInt();
   int arr[]=new int[arr_size];
   for(int idx=0;idx<=(arr_size-1);idx++)
   { arr[idx]=in.nextInt();
   }
   int no_of_rotation=in.nextInt();
   left_rotate_even_elem(arr_size,arr,no_of_rotation);
   right_rotate_odd_elem(arr_size,arr,no_of_rotation);
   for(int idx=0;idx<=(arr_size-1);idx++)
   { System.out.print(arr[idx]+" ");
   }
  }
}