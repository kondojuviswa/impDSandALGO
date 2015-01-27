package impDSandALGO;
// Author: Viswanadha Pratap Kondoju 
//
public class Fibonacci {
	private static int size = 2000000;
    private static int trials = 2000000;
    private static int phase = 0;
    private static long startTime, endTime, elapsedTime;
    
         //Implementation of Fibonacci number calculation using iteration 
        long fibIteration(long n)
        {
        	int f0 = 0,f1 = 1 ,result = 0;
        	for(int i=2;i<=n;i++)
        	{
        		result = f0+f1;
        		f0 = f1;
        		f1 = result;
        	}
        	return result;
        }
        // Implementation of Fibonacci number calculation using recursion
		long fibtraditional(long n)
		{
			//System.out.print(n);
			if(n<=1){
				return n;
			}
			else
				return (fibtraditional(n-1)%997 + fibtraditional(n-2)*997)%997;
			
		}
		 // Implementation of Fibonacci number calculation using recursion with memoization
		//long fibtraditional(long n)
		//{
			//System.out.print(n);
		//	if(n<=1){
		//		return n;
		//	}
		//	if
		//	else
		//		return fibtraditional(n-1) + fibtraditional(n-2);
			
		//}

		long fibDAC(long n)
		{
			int [][] Result = {{0,0},{0,0}};//holds the values Fib[n] and Fib[n-1]
			int[][] C = {{1,0},{0,1}}, D = {{1,1},{1,0}};
			int[][] E = {{1,0},{0,0}}; // padded 0s for{{1},{0}}
			MatrixMultiplication m = new MatrixMultiplication();
			while(n>1)
			{
			C = m.matrixmultiplication(C, D);
			n--;
			}
			Result = m.matrixmultiplication(C, E);
			return Result[0][0] ; //Required Fibonacci number calculated using Divide and Conquer
		    //return 0;
		}
		 public static void timer()
		    {
		        if(phase == 0) {
			    startTime = System.currentTimeMillis();
			    phase = 1;
			} else {
			    endTime = System.currentTimeMillis();
		            elapsedTime = endTime-startTime;
		            System.out.println("Time: " + elapsedTime + " msec.");
		            memory();
		            phase = 0;
		        }
		    }

		    public static void memory() {
		        long memAvailable = Runtime.getRuntime().totalMemory();
		        long memUsed = memAvailable - Runtime.getRuntime().freeMemory();
		        System.out.println("Memory: " + memUsed/1000000 + " MB / " + memAvailable/1000000 + " MB.");
		    }
		



		/**
		 * @param args
		 */
		public static void main(String[] args) {
					// TODO Auto-generated method stub
			Fibonacci ft = new Fibonacci();
			
			
			//call to fibDAC
			/*System.out.println("Fib(1234567890) % 997 using DAC is:");
			timer();
			System.out.println(ft.fibDAC(1234567890)%997);
			timer();
			
			//Call to fibIteration
			System.out.println("Fib(1234567890)%997 using traditional iteration is:");
			timer();
			System.out.println(ft.fibIteration(1234567890)%997);
			timer(); */
			
			//Call to fibtraditional using recursion
			System.out.println("Fib(1234567890)%997 using traditional recusive method :");
			timer();
			System.out.println(ft.fibtraditional(1234)%997);
			timer();

		}

	}


