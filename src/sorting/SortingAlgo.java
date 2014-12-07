package sorting;

public class SortingAlgo {
	int[]list = new int[50]; 
	

	public  SortingAlgo() {
		// TODO Auto-generated constructor stub
		
		
	}
		
		//Selection Sort
		public int[] selectionSort(int[] list){
			
			this.list = list;
			
			int i,j,temp;
			
			
			for(i = 0; i< list.length ; i++ )
			{   
				for( j = i+1 ; j < list.length; j++)
				{  
					if(list[i]>list[j])
					{
					temp = list[j];
					list[j] = list[i];
					list[i] = temp ;
					}
				}
			}
			return list;
		}
		
		//Insertion Sort
		public int [] insertionSort (int [] list){
		      this.list = list;
			 int temp,cursor;
			 
			 for(int i = 1;i< list.length; i++)
			 { 
				 cursor = i;
			   for (int j = i-1; j>=0;j--)
					{
				      if(list[j]>list[cursor]){
						temp = list[j];
						list[j] = list[cursor];
						list[cursor] = temp;
				      }
				      cursor--;
			        }
			 }
			 return list;
		}
		
		//Bubble Sort
		public int [] bubbleSort(int [] list){
			for(int i=0 ; i<list.length-1;i++)
			{   
				for(int j= 0; j<list.length-1; j++)
				{
				    int track = j+1;
					if(list[j]>list[track])
					{
						int temp = list[j];
						list[j] = list[track];
						list[track] = temp;
					}
					track++;
				}
			}
			return list;
		
		}
		
		//Merge Sort
		public int[] mergeSort(int [] array){
			
			
			return array;
		}
		
}
