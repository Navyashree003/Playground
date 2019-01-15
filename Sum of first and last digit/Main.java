import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=n%10;
      int first;
      first=n;
      while(first>=10)
      {
        first=first/10;
      }
      int sum=n1+first;
      System.out.println(sum);
	}
}