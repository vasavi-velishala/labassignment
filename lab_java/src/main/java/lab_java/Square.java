package lab_java;

public class Square {
	static int Square_Diff(int n) {
		int a,b,c;
		a=(n*(n+1)*(2*n+1))/6;
		b=(n*(n+1))/2;
		b=b*b;
		c=Math.abs(a-b);
		return c;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(Square_Diff(n));

	}

}
