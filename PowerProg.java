/**
 * 
 */
package impDSandALGO;

/**
 * @author My PC
 *
 */
public class PowerProg {
	int power(int x , int n ){
		int s = 0;
		if(n == 1){
			return x;
		}
		else
			s = power(x,n/2);
		if(n%2 != 0){
			return s*s*x;
		}
		else
		    return s*s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerProg pp =  new PowerProg();
		System.out.println("The 4 Power 25 value is:" + Integer.toString(pp.power(25,4)));
		System.out.println("The 3 Power 25 value is:" + Integer.toString(pp.power(25,3)));
		System.out.println("The 9 Power 25 value is:" + Integer.toString(pp.power(25,9)));

	}

}
