import java.util.Arrays;
import java.util.*;

class BubbleSort
{
	void bubbleSort(int array[])
	{
		int size = array.length;
		for(int i =0;i<size-1;i++)
		{		
			boolean swapped = true;
			System.out.println(swapped+"Hel");
			for(int j=0;j<size-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = false;
				}
			
			}
			if (swapped == true)
			{
				System.out.println(swapped);
				break;
			}
			
		}
	}
	
	public static void main (String args[]) 
	{
		int data[] = {-2,45,0,11,-9};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.print(Arrays.toString(data));
	}
}
