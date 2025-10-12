package tests;

///Adda_proyecto1/src/ficheros/PI1Ej1DatosEntrada.txt

import funciones.Txt_reader;
import funciones.Ejercicio1;
import funciones.Ejercicio2;
import funciones.Ejercicio3;
import funciones.Ejercicio4;



public class test {
	public static void main (String[] args) {
		
		System.out.println("lectura de ficheros:");
		System.out.println("ejercicio 1: " + Txt_reader.readerStr("src/ficheros/PI1Ej1DatosEntrada.txt"));
		System.out.println("ejercicio 2: " + Txt_reader.readerStr("src/ficheros/PI1Ej2DatosEntrada.txt"));
		System.out.println("ejercicio 3: " + Txt_reader.readerStr("src/ficheros/PI1Ej3DatosEntrada1A.txt"));
		System.out.println("ejercicio 4: " + Txt_reader.readerStr("src/ficheros/PI1Ej4DatosEntrada.txt"));
		
		System.out.println("\nPruebas de los tests del proyecto1:");
		System.out.println("····································································································································");
		System.out.println("Pruebas de los tests del Ejercicio1:\n");
		System.out.println(Ejercicio1.Iterativo(32,55));
		System.out.println(Ejercicio1.RecursivaF(15,140));
		System.out.println("····································································································································");
		System.out.println("Pruebas de los tests del Ejercicio2:\n");
		System.out.println(Ejercicio2.Iterativo(93, 24));
		System.out.println(Ejercicio2.NotacionFuncional(250,43));
		System.out.println(Ejercicio2.RecursivaNF(331,473));
		System.out.println(Ejercicio2.RecursivaF(210,56));
		System.out.println("····································································································································");
		System.out.println("Pruebas de los tests del Ejercicio3:\n");
		System.out.println(Ejercicio3.Iterativa("src/ficheros/PI1Ej3DatosEntrada1A.txt","src/ficheros/PI1Ej3DatosEntrada1B.txt"));
		System.out.println(Ejercicio3.Recursiva("src/ficheros/PI1Ej3DatosEntrada1A.txt","src/ficheros/PI1Ej3DatosEntrada1B.txt"));
		System.out.println(Ejercicio3.Iterativa("src/ficheros/PI1Ej3DatosEntrada3A.txt","src/ficheros/PI1Ej3DatosEntrada3B.txt"));
		System.out.println("····································································································································");
		System.out.println("Pruebas de los tests del Ejercicio4:\n");
		System.out.println(Ejercicio4.RecursivoSM(10,6));
		System.out.println(Ejercicio4.RecursivoCM(9,11));
		System.out.println(Ejercicio4.IterativoI(16,7));
		System.out.println("····································································································································");		

		
	}
}
