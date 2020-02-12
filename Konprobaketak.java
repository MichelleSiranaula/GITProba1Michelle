
public class Konprobaketak {
	public static boolean zbkKonprobatu(String zbk) {
		boolean datuaOngi=true;
		
		try {
			int zenbakia=Integer.parseInt(zbk);
			if (zenbakia<0) {
				System.out.println("Zenbakia positiboa izan behar da!");
				datuaOngi=false;
			}

		} catch (NumberFormatException e){
			System.out.println("Zenbaki oso bat izan behar da!");
			datuaOngi=false;
		}
		return datuaOngi;
	}
	
	public static boolean doubleKonprobatu(String zbk) {
		boolean datuaOngi=true;
		
		try {
			double zenbakia=Double.parseDouble(zbk);
			if (zenbakia<0 || zenbakia>10) {
				System.out.println("Zenbakia 0 eta 10 tartean egon behar da!");
				datuaOngi=false;
			}
		} catch (NumberFormatException e){
			System.out.println("Hamartar bat izan behar da!");
			datuaOngi=false;
		}
		return datuaOngi;
	}
}
