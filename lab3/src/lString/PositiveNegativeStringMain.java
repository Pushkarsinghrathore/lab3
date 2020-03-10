package lString;

import java.util.Scanner;

public class PositiveNegativeStringMain {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String to be CHECKED- ");
			String check=sc.next();
			PositiveNegativeString PNS=new PositiveNegativeString();
			PNS.setCheck(check);
			System.out.println(PNS.positiveNegativeStrings(check));

			sc.close();
		}


	}

