package lString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dmydifferencemain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(); 
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
	}


}
