package lString;

import java.util.Arrays;

public class PositiveNegativeString { 
private String check;
	
	
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	
	public boolean positiveNegativeStrings(String check) {
		int n = check.length();  
	    char c[] = new char [n];   
	    for (int i = 0; i < n; i++) {  
	        c[i] = check.charAt(i);  
	    }   
	    Arrays.sort(c);  
	    for (int i = 0; i < n; i++)  
	        if (c[i] != check.charAt(i))   
	            return false;  
	            
	    return true; 
	}

}
