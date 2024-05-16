import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		System.out.println("enter a no=");
		Scanner sc = new Scanner (System.in);
		 int n=sc.nextInt();
		 int a;
		for(int i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(n+"*"+i+"="+i*n);
		}
	}

}
