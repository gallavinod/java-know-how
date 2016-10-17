package biginteger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BigDecimalDemo {
	
	/*
	 * https://www.hackerrank.com/challenges/java-bigdecimal
	 */

	public static void main(String []args){
		//Input
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String []s=new String[n+2];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		sc.close();

		List <String> descindingList = new ArrayList <String> ();

		for (int i=0; i<n; i++) {
			int low = 0;
			int high = descindingList.size()-1;
			while (low <= high) {
				int mid = (low+high)/2;
				BigDecimal bDI = new BigDecimal(s[i]);
				BigDecimal bDJ = new BigDecimal(descindingList.get(mid));
				int compareValue = bDI.compareTo(bDJ);
				if (compareValue == 1) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			descindingList.add(low, s[i]);
		}

		Iterator <String> iterator = descindingList.iterator();

		if (descindingList.size() == n) {
			int index = 0;
			while (iterator.hasNext()) {
				s[index++] = iterator.next();
			}
		}


		//Output
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}

}
