package ejemplos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacionEntera suma=(a,b)->a+b;
		IOperacionEntera resta=(a,b)->a-b;
		IOperacionEntera multi=(a,b)->a*b;
		
		suma.operar(0, 0);
		resta.operar(0, 0);
		multi.operar(0, 0);
		
	}

}
