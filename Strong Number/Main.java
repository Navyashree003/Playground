import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int i,sum=0,fact,rem;
      while(temp>0)
      {
        fact=1;
        i=1;rem=temp%10;
        while(i<=rem)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        temp=temp/10;
      }
      if(n==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
      