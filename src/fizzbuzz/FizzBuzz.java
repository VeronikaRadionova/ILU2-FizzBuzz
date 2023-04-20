package fizzbuzz;

public class FizzBuzz {
	private static final int[] numSpeciaux = {3, 5};
	private static final String[] traduction = {"FIZZ", "BUZZ"};
	
	public String fizzbuzz(int n) {
		StringBuilder fb = new StringBuilder();
		for (int i = 0; i< numSpeciaux.length; i++) {
			if (n%numSpeciaux[i] == 0) {
				fb.append(traduction[i]);
			}
		}
		return fb.toString();
	}
}
