import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=n1%10;
    int n3=(n1%100)/10;
    int n4=n1/100;
    System.out.println(n2+""+n3+""+n4);
    //System.out.println(n3);
    //System.out.println(n4);
  }
}