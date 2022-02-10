package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int i=0;
		List<Integer>list=new ArrayList<Integer>();
		list.add(arr[i]);
		Set<Integer> set1 = new TreeSet<Integer>();
	    Set<Integer> set2= new TreeSet<Integer>();
	    for(Integer inte:arr)
	    	if(!set1.add(inte))
	    	{
	    		set2.add(inte);
                    
                    }
	    System.out.println("Duplicate integers in given list is/are " + set2);            
	}
}
