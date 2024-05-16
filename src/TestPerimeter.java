class Perimeter{
	void peri(double r)
	{
		double pr=2*3.14*r;
		System.out.println("perimeter of the circle="+pr);
	}
	void peri(int L,int B)
	{
		int pr1=2*(L+B);
		System.out.println("perimeter of the rectangle="+pr1);
	}
	void peri(int a)
	{
		int pr2=4*a;
		System.out.println("perimeter of the sq="+pr2);
	}
}
public class TestPerimeter {

	public static void main (String[]args){
		// TODO Auto-generated constructor stub
		Perimeter ob = new Perimeter();
		ob.peri(4.5);
		ob.peri(5,6);
		ob.peri(6);
	}

}
