package impDSandALGO;

public class InserstionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,1,4,2,8,11,34,13,7,6,9,0};
		//int unSortEle = A[];
		int value,hole;
		for ( int i = 1;i < A.length ; i++)
		{
			value = A[i];
			hole = i;
			while( hole > 0 && A[hole-1] > value){
				A[hole]=A[hole-1];
				hole = hole-1;
			}
			A[hole] = value;
		}

	
	int iter = 0;
	while(iter < A.length)
	{
		System.out.print(A[iter]+ " ");
		iter++;
	}
	}

}
