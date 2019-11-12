package day23_stringManipulation_lab_RandomClass;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc hi hohihi";
		System.out.println(countHi(str));

	}

	public static int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}

		return count;
	}

}
