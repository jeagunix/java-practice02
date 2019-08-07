package prob04;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] originalChar = str.toCharArray();
		char[] reverseChar = new char[str.length()];

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseChar[str.length()-1-i] = originalChar[i];
		}

		return reverseChar;
	}

	public static void printCharArray(char[] array) {
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}