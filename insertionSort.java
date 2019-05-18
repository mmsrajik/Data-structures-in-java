import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class insertionSort {
	
	public static void sort(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			int value=array[i];
			int j=i;
			while(j>0 && array[j-1]>value)
			{
				array[j]=array[j-1];
				j=j-1;
		
		    }
			array[j]=value;
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
