package myString;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    String sent1 = "Welcome to our program";
		    String sent2 = "Welcome to our program";
		    String sent3 = "Madam, I'm Adam";
		    String sent4 = "I with you going to university";
		    String sent5 = "Hello. Are you sure about the operation? if you sure press ok.";
		    String sent6 = "Hello. Are you sure about the operation? if you sure press ok.";
		    System.out.println(MyString.reverseString(sent1));
		    System.out.println(MyString.reverseLetters(sent2));
		    System.out.println(MyString.isPalindrome(sent3));
		    System.out.println(MyString.shortHanded(sent4));
		    System.out.println(MyString.numberOfSentence(sent5));
		    System.out.println(MyString.numberOfWords(sent6));



	}

}
