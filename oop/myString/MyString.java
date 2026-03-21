package myString;

public class MyString {
	
   private MyString() {
	   
   }
   
   public static String reverseString(String sent) {
	   String[] wordStrings=sent.split(" ");
	   String resultString="";
	   for(int i=(wordStrings.length)-1;i>=0;i--) {
		   resultString+=wordStrings[i]+" ";

	   }
	   return resultString;   
   }
   
   
   public static String reverseLetters(String sent) {
	   char[] letters=sent.toCharArray();
	   String resultString="";
	   for(int i=letters.length-1;i>=0;i--) {
		   resultString+=letters[i];
	   }
	   return resultString;
	   
   }
   
   public static String cleanString  (String sent) {
	   String resulString=sent.replaceAll(" ", "");
	   resulString=sent.replaceAll(".,/?@#$%^&*", "");
	   resulString=sent.replaceAll("[~`!.()\\\\[\\\\]{}]", "");
	   resulString=sent.toLowerCase();
	   return resulString;
  
   }
   
   public static boolean isPalindrome(String sent) {
	   String clean=cleanString(sent);
	   String reverseString=reverseLetters(sent);
	   if(clean.equals(reverseString))
		   return true;
	   else {
		return false;
	}
   }
   
   public static String shortHanded(String sent) {
	   String[] wordStrings=sent.split(" ");
	   for(int i=0;i<wordStrings.length;i++) {
		   if(wordStrings[i].equals("and"))
			   wordStrings[i]="&";
		   else if(wordStrings[i].equals("to"))
			   wordStrings[i]="2";
		   else if(wordStrings[i].equals("you"))
			   wordStrings[i]="U";
		   else if(wordStrings[i].equals("for"))
			   wordStrings[i]="4";
		   
		   if(wordStrings[i].length()>1)
			   wordStrings[i]=wordStrings[i].replaceAll("[aeouiAEOUI]", "");
	   
	   }
	   String resultString="";
	   for(int i=0;i<wordStrings.length;i++) {
		   resultString+=wordStrings[i];
	   }
	   return resultString;
	   
   }
   
   
   public static int numberOfSentence(String sent) {
	   String[] sentenceStrings=sent.split("[.,?]");
	   return sentenceStrings.length;
	   
   }
   
   public static int  numberOfWords(String sent) {
	   String[] wordStrings=sent.split("[ ]");
	   int numberOfWords=wordStrings.length;
	   for(int i=0;i<wordStrings.length;i++) {
		   if(wordStrings[i].length()<3)
			   numberOfWords--;
		   else if(wordStrings[i].charAt(2)=='.')
			   numberOfWords--;
	   }
	   return numberOfWords;
	   
	
  }
   
   
   

}
