package sorting;

public class ApplySorting {

	public static void main(String[] args) {
		/*
		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers.
		 */
		int [] list = {34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
		SortingAlgo sortingAlgo = new SortingAlgo();
		int [] ls = sortingAlgo.selectionSort(list);
		System.out.println("Using Selection Sort: ");
		for(int i=0; i< ls.length; i++)
		{
			System.out.println(ls[i]);
		}
		int [] ls2 = sortingAlgo.insertionSort(list);
		System.out.println("Using Insertion Sort: ");
		for(int j=0; j< ls2.length; j++)
		{
			System.out.println(ls2[j]);
		}
		
		int [] ls3 = sortingAlgo.bubbleSort(list);
		System.out.println("Using Bubble Sort: ");
		for(int k=0; k< ls2.length; k++)
		{
			System.out.println(ls3[k]);
		}
		

	}

}
