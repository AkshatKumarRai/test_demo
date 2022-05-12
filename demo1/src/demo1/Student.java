package demo1;

public class Student {
	
	public static void main(String[] args) {
		String str1="akshat";
		String str2="";
		int size=str1.length();
		
		
		for(int i=size-1;i>-1;--i)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println("original string:" +str1);
		System.out.println("reverse string:" +str2);
		
	}

}
