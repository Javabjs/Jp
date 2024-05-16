import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		System.out.println("enter a no=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=10;j++)
			{
				n=n*i;
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}
			
		
     }

}
