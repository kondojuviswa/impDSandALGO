package impDSandALGO;

public class MergeSort {
	
	void mergeSort(int[] A)
	{
		if(A.length < 2){
			return;
		}
		int lenA = A.length;
		int mid = 0;
		mid =  lenA/2;
		int[] left ;
		int[] right ;
		left = new int[mid];
		right = new int[lenA - mid];
		
		for(int i = 0; i < mid ; i++)
		{
			left[i] = A[i];
		}
		for(int i = mid ; i < lenA ; i++)
		{
			right[i-mid] = A[i];
		}
	/*	System.out.print("Left Array : ");
		for(int i = 0; i < left.length ; i++)
		{
			System.out.print(left[i] + " ");
		}
		System.out.print("\nRight Array : ");
		for(int i = 0; i < right.length ; i++)
		{
			System.out.print(right[i] + " ");
		}*/
		mergeSort(left);
		mergeSort(right);
		merge(left,right,A);
	}
	void merge(int[] left,int[] right,int[] A)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0,j = 0,k = 0;//for iterating over left,right and A arrays respectively
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j]){
				A[k] = left[i];
				i++;
			}
			else
			{
				A[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < leftSize)
		{
			A[k] = left[i];
			k++;
			i++;
		}
		while( j < rightSize)
		{
			A[k] = right[j];
			k++;
			j++;
		}
	}
	void printArray(int[] A)
	{
		for(int i = 0;i < A.length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4,1,6,8,9,4,5};
		
		MergeSort ms = new MergeSort();
		System.out.print("Unsorted Array:");
		ms.printArray(A);
		ms.mergeSort(A);
		System.out.print("Sorted Array:");
		ms.printArray(A);

	}

}
