package collections;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int first=0;
		int second=0;
		Set<Integer>uniqueNumbers=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
		    uniqueNumbers.add(arr[i]);
		if(arr[i]>first)
		{
			second=first;
			first=arr[i];
		}
		else if(arr[i]>second)
		{
		second=arr[i];
		}
		}
		System.out.println("Second largest:"+second);
	}

}
