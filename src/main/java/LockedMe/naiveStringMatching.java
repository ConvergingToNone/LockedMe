package LockedMe;

import java.util.List;
import java.util.ArrayList;

public class naiveStringMatching {
	
	public static List<Integer> match(String P, String T){
		int n = T.length();
		int m = P.length();
		List<Integer> shifts = new ArrayList<>();
		for (int i = 0; i < n-m+1; i++) {
			boolean hasMatch = true;
			for (int j = 0; j < m; j++) {
				if (P.charAt(j) != T.charAt(i+j)) {
					hasMatch = false;
					break;
				}
			}
			if (hasMatch) shifts.add(i);
		}
		
		return shifts;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "my booty is great";
		String b = "boo";
		String allOccurences = match(b, a).toString();
		System.out.println("all occurences of 'boo' in 'my booty is great' is: " + allOccurences);
		
	}

}
