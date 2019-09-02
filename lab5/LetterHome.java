//LetterHome.java
//Aaron Hom
//awhom
//lab5
//Writes a letter to parents based on number input
//ERROR 1: There is a semicolon in front of "else" that ends the statement abruptly and should not be there (line 71).
//ERROR 2: There is another semicolon in front of "(m==2)" that ends the statement abruptly and should not be there (line 90).
//ERROR 3: On line 30, "sentenceCode >= MAX_CODE" should actually be "sentenceCode > MAX_CODE" because MAX_CODE = 5, but 5 is also used as a sentenceCode, so if 5 >= 5, it would return an error
import java.util.Scanner;
import java.io.File;

class LetterHome{

    static final int MAX_CODE = 5;

    public static void main(String[] args) throws Exception{
	Scanner in = new Scanner(new File(args[0]));
	String phrase;
	int sentenceCode, modifierCode;

	// print heading
	System.out.println("Dear Mom and Dad:\n");

	// print encoded sentences
	while( in.hasNext() ){

	    // read a pair of sentence and modifier codes
	    sentenceCode = in.nextInt();
	    modifierCode = in.nextInt();

	    // make sure the sentenceCode is within range
	    if( (sentenceCode < 1) || (sentenceCode >  MAX_CODE) ) {
		System.out.println(sentenceCode + " is not a valid sentence code");
		continue;
	    }

	    // print the appropriate sentence with modifier
	    if( sentenceCode == 1 ){
		if( modifierCode == 1 ){
		    phrase = "great";
		}else if( modifierCode == 2 ){
		    phrase = "ok";
		}else{
		    phrase = "ERROR";
		}
		System.out.println("My classes are going " + phrase + ".");

	    }else if( sentenceCode == 2 ){
		phrase = weatherModifier(modifierCode);
		System.out.println("The weather here has been " + phrase + ".");

	    }else if( sentenceCode == 3 ){
		if( modifierCode == 1 ){
		    phrase = "after the quarter ends";
		}else if( modifierCode == 2 ){
		    phrase = "in a few weeks";
		}else if( modifierCode == 3 ){
		    phrase = "next weekend";
		}else{
		    phrase = "ERROR";
		}
		System.out.println("I plan to come home for a visit " + phrase + ".");

	    }else if( sentenceCode == 4 ){
		System.out.println("Do you think you could send me $" + modifierCode + "?");
		System.out.println("I have to buy another book for one of my classes.");

	    }else if( sentenceCode == 5 ){
		if( modifierCode == 1 ){
		    phrase = "cookies";
		}else if( modifierCode == 2 ){
		    phrase = "stuff";
		}else if( modifierCode == 3 ){
		    phrase = "money";
		}else{
		    phrase = "ERROR";
		}
		System.out.println("Thanks for the " + phrase + " you sent.");
	    }
	}
    }


    // weatherModifier()
    // returns the correct word for a weather sentence
    static String weatherModifier(int m) {
	String word=null;

	// select weather modifier
	if(m == 1)
	    word = "great";
	if(m == 2)
	word = "foggy";
	if(m == 3)
	    word = "hot";
	if(m == 4)
	    word = "cold";
	if(m == 5)
	    word = "variable";
	if( m<1 || m>5)
	    word = "ERROR";

	return word;
    }
 }
