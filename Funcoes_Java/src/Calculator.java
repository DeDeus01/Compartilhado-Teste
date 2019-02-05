public class Calculator{

	public double numero1;
	public double numero2;

	public Calculator (double numero1, double numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;
	}


	publi double getNumero1(){
		return numero1;
	}

	public double getNumero2(){
		return numero2;
	}

	public double add(){
		return numero1 + numero2;
	}

	public double sub(){
		return numero1 - numero2;
	}
}