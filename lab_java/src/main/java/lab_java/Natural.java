package lab_java;

public class Natural {
	static int sum(int p,int q,int r)
	{
		int a,b,c;
		a = ((p/q))*(2*q+(p/q-1)*q)/2;
		b = ((p/q))*(2*r+(p/q-1)*r)/2;
		c = ((p/(q*r)))*(2*(q*r)+(p/(q*r)-1)*(q*r))/2;
		return a+b-c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=14;
		int q=3;
		int r=5;
		System.out.println(sum(p,q,r));

	}

}
