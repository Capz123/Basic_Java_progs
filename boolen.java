import java.util.Arrays;
import java.util.*;

class boolen
{
	boolean swapped = true;
	void bubbleSort(int array[])
	{
		int size = array.length;
		for(int i =0;i<size-1;i++)
		{		
			for(int j=0;j<size-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					System.out.println(array[j]+" "+array[j+1]);
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			
			}
			
		}
	}
	
	public static void main (String args[]) 
	{
		int data[] = {1,2,3,4,6,5};
		boolen b = new boolen();
		b.bubbleSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.print(Arrays.toString(data));
	}
}
