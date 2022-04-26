import java.util.HashMap;

public class MasinaFactory {

	private static HashMap <String, Masina> hm 
				=new HashMap<String,Masina>();
	
	public static Masina getMasina(String culoare) {
		Masina p = null;
		if(hm.containsKey(culoare)) {
			p=hm.get(culoare);
		System.out.println("S-a preluat masina de culoare "+culoare);
		}
		else {
			switch(culoare) {
			case "verde":
				p=new Masina("verde");
                System.out.println("Masina verde Created");
				break;
			case "galben":
				p= new Masina("galben");
                System.out.println("Masina galben Created");
				break;
			case "albastru":
				p=new Masina("albastru");
                System.out.println("Masina albastru Created");

				break;
			default:
				System.out.println("Masina nu e pe stoc");
			}
			hm.put(culoare, p);	
		}
		
		return p;
	}
}
