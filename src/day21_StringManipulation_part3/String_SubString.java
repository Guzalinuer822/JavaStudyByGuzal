package day21_StringManipulation_part3;

public class String_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k="";
		int h=m1(k.length());
		h+=3 + ++h;
		
		System.out.println(h);

//		String username="mike";
//		String password="12|3";
		
//		String sentence="Java String Manipulation is fun!";
//		
//		System.out.println(sentence.substring(2));
//		System.out.println(sentence.substring(5, 11));
//		
//		System.out.println(sentence.length());
//		System.out.println(sentence.substring(5, sentence.length()-5));
//		
//		// 
//		String chars="{{}}";
//		
//		String word="Automation";
//		
//		String result=chars.substring(0, 2) + word + chars.substring(2);
//		
//		System.out.println(result);
//		
//		
//		// 
//		String str=" 342 ";
//		
//		System.out.println("|" + str.trim()+ "|");
//		int total=0;
//		String letters="abcdesfg";
//		total+=letters.substring(1, 2).length();
//		total+=letters.substring(6, 6).length();
//		total+=letters.substring(5, 6).length();
//		System.out.println(total);
//		
//		String b="rumble";
//		b+=b.concat("4").substring(3, b.length()-1);
//		System.out.println(b);
//		
//		String s=" hello  world";
//		String trimm=s.trim();
//		System.out.println(trimm.length());
//		
////	//	String h="Cybertek Students";
////		
////		int x=h.indexOf("t",8);
////		System.out.println(h.substring(3, x));
//		
		
		
		
		
		
	}
	public static int m1(int i) {return ++i;}
}
