abstract class Bank {
  protected abstract void interest();
}
class HDFC extends Bank{
  public void interest(){
  System.out.println("With 3%");
  }
}
class SBI extends Bank{
  public void interest(){
  System.out.println("With 2%");
  }
}
class Customer{
  public static void main (String[]args){
  Bank bank=new HDFC();
    bank.interest();
	Bank bank1 =new SBI();
	bank1.interest();
  }
}
