import java.util.Random;

public class Main {
	
	private static String[] culoare= {"verde","galben","galben","verde","albastru","verde","verde","galben","albastru"};
	
	public static void main(String args[]) {
		
		for(int i =0;i<10;i++) {
			Masina m = MasinaFactory.getMasina(getRandomCuloare());
		}
	}
	
	 public static String getRandomCuloare()
	    {
	        Random r = new Random();
	  
	        // Will return an integer between [0,2)
	        int randInt = r.nextInt(culoare.length);
	  
	        // return the player stored at index 'randInt'
	        return culoare[randInt];
	    }
}
