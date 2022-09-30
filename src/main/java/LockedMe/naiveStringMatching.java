package LockedMe;

import java.util.List;
import java.util.ArrayList;

public class naiveStringMatching {
	
	public static boolean match(String P, String T){
		int n = T.length();
		int m = P.length();
		List<Integer> shifts = new ArrayList<Integer>();
		for (int i = 0; i < n-m+1; i++) {
			boolean hasMatch = true;
			for (int j = 0; j < m; j++) {
				if (P.charAt(j) != T.charAt(i+j)) {
					hasMatch = false;
					break;
				}
			}
			if (hasMatch) {return true;};
		}
		
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
