package collections;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr={3,2,11,4,6,7};
		int[] arr1= {1,2,8,4,9,7};
		Set<Integer>uniqueNumbers=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
		    uniqueNumbers.add(arr[i]);
		}
		Set<Integer>uniqueNumbers2=new TreeSet<Integer>();
		for(int j=0;j<arr.length;j++) {
		    uniqueNumbers2.add(arr1[j]);
		}
//		Arrays.sort(arr);
//		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
