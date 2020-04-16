
public class Aula02{
	public static void main(String[]args){
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.rabiscar();
		c1.status();
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.ponta = 0.8f;
		c2.tampada = true;
		c2.modelo = "bic";
		c2.carga = 100;
		System.out.println("status da segunda caneta: ");
		c2.status();
		
	}
}
