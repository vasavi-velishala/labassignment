package lab_java;

public class Cube {
	public static int Sumofseries(int n) {
		
	
	int sum=0;
	for(int i=1;i<=n;i++)
sum+=i*i*i;
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		System.out.println(Sumofseries(n));
		
	}

}
