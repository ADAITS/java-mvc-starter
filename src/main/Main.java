package main;

import bbdd.Conexion;
import view.MainWindows;

public class Main {

	public static void main(String[] args) {
		Conexion.conectar();
		
		new MainWindows();
	}

}
