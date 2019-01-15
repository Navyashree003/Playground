import java.util.Scanner;
class Main{
  public static  void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int num=n;
    int count=0;
    int n1,n2,n3,n4;
    while(n!=0)
    {
      n/=10;
      count=count+1;
    }
    if(count==2)
    {
      n1=num%10;
      System.out.println(n1);
    }
    else
    {
      n2=num/100;
      n3=n2%100;
      n4=n3/10;
      System.out.println(n4);
    }
  }
}