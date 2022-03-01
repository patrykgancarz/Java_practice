import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Zad 1
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Write a sentence to reverse"); String text =
		 * scanner.nextLine(); System.out.println("Input: \n" + text);
		 * System.out.println("Output"); System.out.println(reverse(text));
		 * scanner.close();
		 */
		
		//Zad 2
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Write a sentence"); String text = scanner.nextLine();
		 * System.out.println("Write a number of the word you want to get"); int nr =
		 * scanner.nextInt(); scanner.nextLine(); System.out.println(trim(text, nr));
		 * scanner.close();
		 */
		
		// Zad 3
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Write a sentence"); String text = scanner.nextLine();
		 * System.out.println("Write a word you are looking for"); String search =
		 * scanner.nextLine(); System.out.println(search(text, search));
		 * scanner.close();
		 */
		
		// Zad 4
		
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("Write a word");
		 * String text = scanner.nextLine(); System.out.println("Write another word");
		 * String text2 = scanner.nextLine();
		 * System.out.println("Are these word anagrams?");
		 * System.out.println(anagrams(text, text2)); scanner.close();
		 */
		
		// Zad 5
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Write a sentence"); String text = scanner.nextLine();
		 * System.out.println("Is this sentence a pangram?");
		 * System.out.println(pangram(text)); scanner.close();
		 */
		
		// Zad 6 DO POPRAWKI
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a decimal number");
		double number = scanner.nextDouble();
		System.out.println(nrReverse(number));
		scanner.close();
		
		System.out.println("HAHAHAHAHAHAH change");
		
	}

	static String reverse(String input){
		
		String output = "";

		String[] words = input.split(" ");

		for (int i = words.length-1; i>=0; i--)
			output = output + words[i]+" ";
		
		return output;
	}
	
	static String trim(String input, int number) {
		
		String[] words = input.split(" ");
		return words[number-1];
		
	}
	
	static int search(String input, String search) {
		int count=0;
		String[] words = input.split(" ");
		for(int i = 0; i <words.length;i++) {
			if(words[i].contains(search)) {	// don't know if it should be all Uppercase (if they look for 'New' they will get only 'New"  not 'new'
				count++;
			}
		}
		return count;
	}
	
	static boolean anagrams(String input1, String input2) {
		
		if(input1.length()==input2.length()) {
			for(int i = 0; i<input2.length(); i++) {
				if(!input1.contains(""+input2.charAt(i))) { // shoud've added toUpperCase (maybe later)
					return false;
				}
			}
			return true;
		}
		else 
			return false;
	}
	
	static boolean pangram(String input) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if(input.length()>=alphabet.length()) {
			for(int i = 0; i<alphabet.length(); i++) {
				if(!input.toUpperCase().contains(""+alphabet.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		else 
			return false;
		
	}
	
	static double nrReverse(double input) { // DO OGARNIÊCIA NA NOWO
		String number = input+"";
		String numberReversed="";
		int comma = number.length() - number.indexOf('.') - 1;
		System.out.println(number.length());
		System.out.println(number.indexOf('.')-1);
		System.out.println(comma);
		for(int i = number.length()-1; i >= 0; i-- ) {
			if(i==comma) {
				numberReversed = numberReversed +".";
				if(number.charAt(i)!='.')
				numberReversed = numberReversed + number.charAt(i);
				System.out.println(numberReversed+" PO WSTAWIENIU , ");
			}
			else if(number.charAt(i)!='.')
				numberReversed = numberReversed + number.charAt(i);
			System.out.println(numberReversed);
		}
		double output = Double.parseDouble(numberReversed);
		return output;
	}
	
}
