package lString;

public class Operations {
	public void	 concat(String str) {
			String str1=str+str;
			System.out.println(str1);
			}

		public void remove(String str) {
			char s[]=str.toCharArray();
			int n=s.length;
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					s[i]=s[i];
				}
				else {
					s[i]='#';
				}
			}
			for(int i=0;i<n;i++) {
			System.out.println(s[i]);
			
		}
		}
		public void duplicate(String str) {
			char s[]= str.toCharArray();
			int n =s.length;
			for(int i=0;i<n;i++) {
			int j;
				for( j=0;j<i
						;j++) {
					if(s[i]==s[j]) {
						break;
					}
				}
				if (i==j) {
					System.out.println(s[i]);
				
				}
			}
				
		}
		public void upperCase(String s) {
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(i%2==0) {
					ch=Character.toUpperCase(ch);
						}
				else {
					ch=Character.toLowerCase(ch);		
					
				}
				System.out.print(ch);
			}
			
		}

}
