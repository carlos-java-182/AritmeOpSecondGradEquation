package opAritméticos;

import java.util.Scanner;

public class OpAritméticos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, resultado1, resultado2;
		
		System.out.println("Digite el número A");
		a=entrada.nextDouble();
		System.out.println("Digite el número B");
		b=entrada.nextDouble();
		System.out.println("Digite el número C");
		c=entrada.nextDouble();
		
		resultado1 = (-b + (Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
		resultado2 = (-b - (Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
		
		System.out.println("La raíz 1 es: " + resultado1);
		System.out.println("La raíz 2 es: " + resultado2);
	}

}
