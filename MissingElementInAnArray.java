package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,7,6,8};
		Set<Integer>uniqueNumbers=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++) {
		    uniqueNumbers.add(num[i]);
		}
		System.out.println(uniqueNumbers);
		List<Integer>allnum=new ArrayList<Integer>(uniqueNumbers);
		for(int i=1;i<=allnum.size();i++) {
		    if(i!=allnum.get(i-1)) {
		        System.out.println(i);
		        break;
		    }
		}
		    }
		

	}

