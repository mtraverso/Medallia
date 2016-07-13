package com.mt.medallia;

public class Tests {
	public static void main(String[] args) {
		System.out.println(reverse("Hola"));
		System.out.println(reverseRecursively("Hola como"));
	}
	
	public static String reverse(String str){
		StringBuilder builder = new StringBuilder();
		for(int i = str.length()-1; i>=0; i--){
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}
	
	public static String reverseRecursively(String str) {
		if(str.length()== 0){
			return "";
		}
		
		Character c = str.charAt(str.length()-1);  
		  
		  
		  String newString = str.substring(0,str.length()-1);
		  
		  return c.toString()+reverseRecursively(newString);
		}
	
	
	
	
	public static Integer stoi (String number){
		if(number.matches("[a-zA-Z]")){
			return null;
		}
		Integer num = new Integer(0);
		boolean isNegative = number.charAt(0) == '-'? true:false;
		for(char s :number.toCharArray()){
			 if((int) s >= 48 && (int) s <= 57){
				 num = num*10;
				 num = num + ((int)s - 48);
			 }
		}
		if(isNegative){
			num *= -1;
		}
		return num;
	}
	
}
