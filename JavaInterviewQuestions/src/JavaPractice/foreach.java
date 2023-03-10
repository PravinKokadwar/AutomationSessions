package JavaPractice;

public class foreach {

	public static void main(String[] args) {

		char[] vowels = {'a','e','i','o','u'};
		
		/*
		 * for(int i=0;i<vowels.length;++i) {
		 * 
		 * System.out.println(vowels[i]); }
		 */
		
		for(char vowel:vowels) {
			
			System.out.println(vowel);
		}
	}

}
