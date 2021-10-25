package com.digitel;

public class testCaracter {

	public testCaracter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exampleString = "El SIM introducido no existe en el inventario del Centro de Atenciï¿½n o no fue despachado al Agente Autorizado que realiza la Venta. PRUEBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

        int stringLength = exampleString.length();
        if (exampleString.length()  >= 200) {
			System.out.println("es mayor");
			String ex = exampleString.substring(0, 200);
			System.out.println("el nuevo valor es "+ex.length());
		}

        System.out.println("String length: " + stringLength);

	}

}
