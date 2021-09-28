package Java_Algorithms;


public class CountSpecificCharacter {
	
	public static void main(String[] args) {
		
	//finding count of specific character 
		String s = "United States Of America";
		int totalCount = 1;
		char storage;
		
		for(int i=0; i<s.length(); i++) {
			storage=s.charAt(i);
			if(storage == 'e') {
				totalCount++;
			}
		}
		System.out.println("total count of charckter <e>  = " + totalCount);
		
		
		
		//reverse String
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
			
		}
		System.out.println(s);
		System.out.println(reverse);
		
		
		
		//find out which number of from 1 to 30 contains 3
		for(int i=1; i<=30; i++) {
			if(String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}
		
		
		//Split programming language java is not fully object oriented
		String str = "programming language java is not fully object oriented";
		System.out.println(str);
		String[] ss = str.split(" ");
		for(int i=0; i<ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		
		String s1 = new String("java");
		String s2 = new String("JAVA");
		System.out.println(s1==s2);  //FALSE
		System.out.println(s1=s2);  //JAVA
		
		
		String e1 = new String("java");
		String e2 = new String("JAVA");
		s2.intern();
		System.out.println(e1=e2);  //FALSE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
