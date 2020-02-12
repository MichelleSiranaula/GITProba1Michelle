

public class Alumno {
	private int matrikulaZbk;
	private String izena;
	private double nota1;
	private double nota2;	
	
	public Alumno(int matrikulaZbk, String izena) {
		this.matrikulaZbk=matrikulaZbk;
		this.izena=izena;
	}
	
	public void setNota(double nota1, double nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	
	public double getBatazbestekoa() {
		double bb=(this.nota1+this.nota2)/2;
		return bb;
	}

	
	//hay que darle al toString
	public String muestraAlumno() {  
		return "Alumno [matrikulaZbk=" + this.matrikulaZbk + ", izena=" + this.izena + ", Batazbestekoa="
				+ getBatazbestekoa() + "]";
	}
	
	public void kk() {
		System.out.println("Matrikula zenbakia: "+this.matrikulaZbk);
		System.out.println("Izena: "+this.izena);
		System.out.println("Noten batazbestekoa: "+this.getBatazbestekoa());
	}
	
	
}

