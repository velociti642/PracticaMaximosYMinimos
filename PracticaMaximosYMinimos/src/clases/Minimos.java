package clases;

public class Minimos {

	/*
	 * Default constructor
	 * Obtiene dos numeros por parametro
	 */
	private int num1 = 5;
	private int num2 = 8;
	private int num3 = 10;

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum3() {
		return num3;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}


	/**
	 * Muestra por pantalla cual de los dos numeros es el menor
	 * 
	 * @return	el numero mayor
	 */
	private static void MinimoDe2EnterosPositivos (int num1, int num2){
		if(num1 >= 0 && num2 >= 0) {
			if(num1 < num2) {
				System.out.print("El número: "+num1+" es menor que "+num2);
			} else if(num1 > num2){
				System.out.print("El número: "+num2+" es menor que "+num1);
			}else if(num1 == num2) {
				System.out.print("Los dos numeros son iguales");
			}
		} else {
			throw new IllegalArgumentException("Los numeros introducidos no son mayores o iguales a 0");
		}
	}
	
	/**
	 * Muestra por pantalla cual de los tres numeros es el menor
	 * 
	 * @return	el numero mayor
	 */
	private static void MinimoDe3EnterosPositivos (int num1, int num2, int num3){
		if (num1 < 0 || num2 < 0 || num3 < 0) {
	        throw new IllegalArgumentException("Los numeros introducidos no son mayores o iguales a 0");
	    }
			int max = num1;
		    if (num2 < max) {
		        max = num2;
		    }else if (num3 < max) {
		        max = num3;
		    }
		    System.out.print("El número menor es: "+max);
	}
}
