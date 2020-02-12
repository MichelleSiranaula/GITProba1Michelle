
import java.util.Scanner;

public class AlumnoNagusia {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String matrikulaZbk="";
		String nota1="";
		String nota2="";
		
		System.out.println("-----------IKASLEAREN DATUAK-----------");
		
		do {
			System.out.println("Sartu matrikula zenbakia: ");
			matrikulaZbk=sc.nextLine();
		} while (! Konprobaketak.zbkKonprobatu(matrikulaZbk));
		int matriZbk=Integer.parseInt(matrikulaZbk);
		
		System.out.println("Sartu izena: ");
		String izena=sc.nextLine();
		
		do {
		System.out.println("Sartu lehenengo nota: ");
		nota1=sc.nextLine();
		} while (! Konprobaketak.zbkKonprobatu(matrikulaZbk));
		double not1=Double.parseDouble(nota1);
		
		do {
		System.out.println("Sartu bigarren nota: ");
		nota2=sc.nextLine();
		} while (! Konprobaketak.zbkKonprobatu(matrikulaZbk));
		double not2=Double.parseDouble(nota2);
		
		Alumno ikasle1 = new Alumno(matriZbk,izena);
		
		ikasle1.setNota(not1, not2);
		
		System.out.println(ikasle1.muestraAlumno());
	}

}