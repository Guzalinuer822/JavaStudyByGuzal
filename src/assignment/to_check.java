package assignment;

public class to_check {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 4, 3, 4 };

		// TODO: write your code below

		boolean isUnique = false;

		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {

				if (i != j) {
					if (nums[i] != nums[j]) {
						isUnique = true;
					} else {
						isUnique = false;
						break;
					}

				}
			}

			if (isUnique) {
				System.out.println(nums[i]);
			}

		}
	}
}