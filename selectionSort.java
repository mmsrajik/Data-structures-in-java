import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class selectionSort {
	
	public static void sort(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int minindex=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[minindex]>array[j])
				{
					minindex=j;
				}
			}
			int temp=array[i];
			array[i]=array[minindex];
			array[minindex]=temp;
			
		}
	}

	public static void main(String args[])
	{
      int array[]=new int[] {90,34,40,56,20,70};
      sort(array);
      for(int i=0;i<array.length;i++)
      {
    	  System.out.println(array[i]);
      }
	}
}
