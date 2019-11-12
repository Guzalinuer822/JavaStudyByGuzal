package day23_stringManipulation_lab_RandomClass;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "catdog";
		System.out.println(catDog(str));
	}

	public static boolean catDog(String str) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count1++;
			}

			if (str.substring(i, i + 3).equals("dog")) {
				count2++;
			}
		}

		if (count1 == count2) {
			return true;
		} else {
			return false;
		}
	}
}
