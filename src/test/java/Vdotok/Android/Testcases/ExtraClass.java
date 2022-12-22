package Vdotok.Android.Testcases;

public class ExtraClass {

	public static void main(String[]args){
		String str = "levell", reverseSTR ="";

		int strLength = str.length();
		for (int i = (strLength - 1); i>=0; --i) {
			reverseSTR = reverseSTR + str.charAt(i);

		}
	    if (str.toLowerCase().equals(reverseSTR.toLowerCase())) {

			System.out.println(str + "is a Palindrome String.");
		}

		else {
		      System.out.println(str + "is not a Palindrome String.");
		    }



	/*  public static void main(String[] args) {

		    String str = "Radar", reverseStr = "";

		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		  */

}
}
