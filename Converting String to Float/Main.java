import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s=in.nextLine();
    int length=s.length();
    double aftDec=0;
    double befDec=0;
    int temp=0;
    for(int i=0;i<length;i++)
    { if(s.charAt(i)=='.')
      temp=1;
    }
    if(temp==1)
    { for(int i=length-1;s.charAt(i)!='.'&&i>0;i--)
    { aftDec=aftDec/10+(s.charAt(i)-'0');
    }
     aftDec=aftDec/10;
     for(int i=0;s.charAt(i)!='.';i++)
     {befDec=befDec*10+(s.charAt(i)-'0');
     }
    }
    else
    { for(int i=0;i<length;i++)
    { befDec=befDec*10+(s.charAt(i)-'0');
    }
    }
    double sum=(aftDec+befDec);
    System.out.printf("%.6f",sum);
  }
}