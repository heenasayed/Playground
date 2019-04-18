//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setprice(int price)
  { this.price = price;
  }
   public int getprice()
   { return price; 
   }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  { this.product = product;
  }
  public String getproduct()
  { return product;
  }
  public void setQuantity(int quantity)
  { this.quantity=quantity;
  }
  public int getQuantity()
  { return quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  public int result(int p,int q)
  { int result = q*p;
  return result;
  }
}
class Main
{
  public static void main(String[] args)
  {
    //write the logic here
   Scanner in = new Scanner(System.in);
    String product = in.nextLine();
    int price = in.nextInt();
    int quantity = in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    i.setprice(price);
    c.setQuantity(quantity);
    int q = c.getQuantity();
    int p = i.getprice();
    Bill obj = new Bill();
    int r = obj.result(p,q);
    System.out.println("Total Price is : "+r);
  }
}