
public class Harmonic {
	public static void main(String[] args) {
		double harmo = 0;
		
		for(int i=1 ;i<=6; i++){
			double j=1/i;
			System.out.println(j);
			harmo=harmo+j;
		}
		System.out.println(harmo);
		System.out.println((double)1/2);
	}
}
