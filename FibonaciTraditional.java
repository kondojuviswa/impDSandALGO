/**
 * 
 */
package impDSandALGO;

/**
 * @author My PC
 *
 */
public class FibonaciTraditional {
	int fibtraditional(int n)
	{
		//System.out.print(n);
		if(n<=1){
			return n;
		}
		else
			return fibtraditional(n-1) + fibtraditional(n-2);
		
	}
	int fibDAC(int n)
	{
		int [][] Result = {{0},{0}};//holds the values Fib[n] and Fib[n-1]
		int[][] C = {{1,0},{0,1}}, D = {{1,1},{1,0}};
		int[][] E = {{1,0},{0,0}};
		MatrixMultiplication m = new MatrixMultiplication();
		while(n>1)
		{
		C = m.matrixmultiplication(C, D);
		n--;
		}
		Result = m.matrixmultiplication(C, E);
		return Result[0][0]; //Required Fibonacci number calculated using Divide and Conquer
	    //return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		FibonaciTraditional ft = new FibonaciTraditional();
		System.out.println(ft.fibtraditional(50));
		//System.out.println(ft.fibDAC(7));
		

	}

}
