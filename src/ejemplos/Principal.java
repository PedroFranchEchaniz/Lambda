package ejemplos;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacionEntera suma=(a,b)->a+b;
		IOperacionEntera resta=(a,b)->a-b;
		IOperacionEntera multi=(a,b)->a*b;

		
		suma.operar(0, 0);
		resta.operar(0, 0);
		multi.operar(0, 0);
		
		Function <Integer /*Parametro de entrada*/,  Integer/*Parametro de salida*/> operacion = a -> a*2;
		operacion.apply(3);
		
		BiFunction <Integer, Integer, Integer> suma2=(a, b)->a+b;
		System.out.println(suma2.apply(2, 3));
		

				
		System.out.println(suma.operar(1, 2));
		System.out.println(resta.operar(2, 1));
		System.out.println(multi.operar(2, 1));
	}

}
