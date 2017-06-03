package interview.com;

public class FetchSelectedWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char i;
		char input = 'D';
		for (i = 'A'; i <= 'Z'; i++) {
			if (input == i) {
				System.out.println("UpperCase");
				switch (input) {
				case 'A':
					System.out.println("A");
				case 'E':
					System.out.println("E");
				case 'I':
					System.out.println("I");
				case 'O':
					System.out.println("O");
				case 'U':
					System.out.println("Vowel");
					break;
				default:
					System.out.println("Not a Vowel");
					break;
				}
				for (i = 'a'; i <= 'z'; i++) {
					if (input == i) {
						System.out.println("Lower Case");
						switch (input) {
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
							System.out.println("Vowel");
							break;
						default:
							System.out.println("Not A Vowel");
							break;
						}
					}
				}
			}
		}

	}

}
