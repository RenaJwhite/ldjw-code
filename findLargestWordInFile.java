import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by ljohnson-white on 4/27/18.
 */
public class findLargestWordInFile {

	public static String transposeBack(final String theString) {

		String reversedWord;
		String result = "";

    	for(int i = theString.length() - 1; i >= 0; i--){
		result = result + theString.charAt(i);
		}

		reversedWord=result;

    	return (reversedWord);
	}


	public static void main(String [ ] args) throws FileNotFoundException {

			String longest_word = "";
			String current;

			String sourcePath="/src/test/java/com/quick/rest/";
			String relPath=System.getProperty("user.dir") + sourcePath;


			Scanner sc = new Scanner(new File(relPath+"/findLargestWord.txt"));

			while (sc.hasNext()) {
				current = sc.next();
				if (current.length() > longest_word.length()) {
					longest_word = current;
				}
			}

			System.out.println("\nThe largest word is: "+longest_word+"\n");

			String reversedWord=transposeBack(longest_word);

			System.out.println("\nThe reversed Word is: "+reversedWord+"\n");
	}

}
