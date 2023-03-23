package ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacionEntera suma=(a,b)->a+b;
		IOperacionEntera resta=(a,b)->a-b;
		IOperacionEntera multi=(a,b)->a*b;

		Imprimir nombre=(c,d)->System.out.println("mi nombre es " +c +" " +d);;
		
		suma.operar(0, 0);
		resta.operar(0, 0);
		multi.operar(0, 0);
		
		nombre.nombreCompleto("Pedro", "Franch");
		
		Empleado e1 = new Empleado("Pedro", "Franch");
		Empleado e2 = new Empleado("Manuel", "Molina");
		Empleado e3 = new Empleado("Ana", "Garcia");
		List <Empleado> listaempleados = new ArrayList <>();
		listaempleados.add(e1);
		listaempleados.add(e2);
		listaempleados.add(e3);
		
		listaempleados.sort((t1,t2)->e1.getApellido().toLowerCase().compareTo(e2.getApellido().toLowerCase()));
		Function <Integer /*Parametro de entrada*/,  Integer/*Parametro de salida*/> operacion = a -> a*2;
		operacion.apply(3);
		
		BiFunction <Integer, Integer, Integer> suma2=(a, b)->a+b;
		System.out.println(suma2.apply(2, 3));
		

				
		System.out.println(suma.operar(1, 2));
		System.out.println(resta.operar(2, 1));
		System.out.println(multi.operar(2, 1));
		
		
	}

}
