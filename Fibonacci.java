
/**
 * Fibonacci Series using Java
 * @author asharda
 *
 */
public class Fibonacci {


	/**
	 * Return the Finonnaci number
	 * @param N
	 * @return int
	 */
	public int fib(int N) {

		if(N==0 ||N==1)
		{
			return N;
		}
		else
		{

			return fib(N-1)+fib(N-2);
		}

	}
	public static void main(String[] args) {

		Fibonacci f=new Fibonacci();
		System.out.println(f.fib(4));
	}

}
