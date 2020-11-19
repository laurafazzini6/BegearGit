package it.begear.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scatola<Cereale> scatola1 = new Scatola<Cereale>(new Cereale());
		Scatola<Mozzarella> scatola2 = new Scatola<Mozzarella>(new Mozzarella());
		
		List<Scatola> magazzino = new ArrayList<Scatola>();
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
		System.out.println("Gaetano!");
		System.out.println("Inserisci un tipo di scatola: ");
		System.out.println("C --> Cereali ");
		System.out.println("M --> Mozzarelle ");
		String contenuto = scanner.nextLine();
		if (contenuto.equalsIgnoreCase("c")) {
			Scatola<Cereale> scatola = new Scatola<Cereale>(new Cereale());
			magazzino.add(scatola);}
		else if (contenuto.equalsIgnoreCase("m")) {
			Scatola<Mozzarella> scatola = new Scatola<Mozzarella>(new Mozzarella());
			magazzino.add(scatola);}
		System.out.println("Vuoi inserire un'altra scatola? Y/N");
		String scelta = scanner.nextLine();
		if (scelta.equalsIgnoreCase("N")) flag = false;
		} while (flag);
		
		System.out.println(magazzino);
		System.out.println("Diego");
		
		Macero macero = new Macero();
		macero.maceraScatole(scatola1);
		macero.maceraScatole(scatola2);
		
	}

}