package repl_HomeWork;

public class PhraseOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// make three sets of words to choose from, add your own!
		String[] wordListOne = {"24/7", "multiTier", "30,000 foot",
				"B-to-B", "win-win","front-end"
		};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added",
				"oriented", "centric", "distributed"
		};
		
		String[] wordListThree = {"process", "tipping-point", "solution",
				"strategy", "mission","space"
		};
		
		// find out how many words are in each list.
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " "
		+ wordListThree[rand3];
		
		// point out the phrase
		System.out.println("What we need is a " + phrase);

	}

}
