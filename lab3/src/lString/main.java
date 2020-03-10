package lString;
import java.util.*;
	
		

		public class main {
		public static void main(String [] args) {
				Scanner scr=new Scanner(System.in);
				String str;
				Operations op=new Operations();
				System.out.println("Please enter the string");
				str=scr.next();
				while (true){
				{
				System.out.println("Please enter the operation you want to execute:");
				System.out.println("1: For concatenation");
				System.out.println("2: for hash method");
				System.out.println("3:for removing duplicates");
				System.out.println("4:for upper case");
				System.out.println("5: Exit");
				int option=scr.nextInt();
				switch (option) {
				case 1:
					op.concat(str);
					break;
				
				case 2:
					op.remove(str);
					break;
				case 3:
					op.duplicate(str);
					break;
				case 4:
					op.upperCase(str);
					break;
				case 5:
					System.exit(0);
					default:
						System.out.println("please enter valid option");
				}
				
					
				}
				
			}

		}

	}


