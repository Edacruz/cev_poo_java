public class Caneta{
	// atributos 
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// métodos 
	void status(){
		System.out.println("Uma caneta "+this.cor);
		System.out.print("Está tampada? ");
		if(this.tampada == true){
			System.out.println("sim.");
		}
		else{
			System.out.println("não.");
		}
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga+"\n");
	}
	void rabiscar(){
		if (this.tampada == true){
			System.out.println("ERROR! não é possível rabiscar com a caneta tampada.");
		}
		else{
			System.out.println("Estou a rabiscar");
		}
	}
	void tampar(){
		this.tampada = true;
	}
	void destampar(){
		this.tampada = false;
	}
}
