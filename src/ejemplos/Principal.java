package ejemplos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacionEntera suma=(a,b)->a+b;
		IOperacionEntera resta=(a,b)->a-b;
		IOperacionEntera multi=(a,b)->a*b;
				
		System.out.println(suma.operar(1, 2));
		System.out.println(resta.operar(2, 1));
		System.out.println(multi.operar(2, 1));
	}

}
