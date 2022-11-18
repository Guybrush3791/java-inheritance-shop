package generation.italy.shop;

import java.util.Scanner;

public class Main {

	static Scanner sc = null;
	static int countProdotti = 0;
	static Prodotto[] prodotti = null;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		prodotti = new Prodotto[10];
		
		printTestProducts();
		
		boolean exit = false;
		while(!exit) {
			
			System.out.println("1 - visualizza catalogo");
			System.out.println("2 - inserisci nuovo prodotto");
			
			String userChoise = sc.nextLine();
			
			if (userChoise.equals("1")) {
				
				printProducts();
			}
			if (userChoise.equals("2")) {
				
				insertNewProduct();
			}
		}
		
		sc.close();
	}
	
	static void printProducts() {
		
		System.out.println("Lista prodotti: " + countProdotti);
		System.out.println("-------------------");
		for (int x=0;x<countProdotti;x++) {
			
			Prodotto p = prodotti[x];
			System.out.println(p);
			System.out.println("-------------------");
		}
	}
	
	static void insertNewProduct() {
		
		System.out.println("Prodotti disponibili:");
		System.out.println("1 - Smartphone");
		System.out.println("2 - Televisore");
		System.out.println("3 - Cuffie");
		
		String userChoise = sc.nextLine();
		
		System.out.print("codice: ");
		String codiceStr = sc.nextLine();
		int codice = Integer.parseInt(codiceStr);
		
		System.out.print("nome: ");
		String nome = sc.nextLine();
		
		System.out.print("marca: ");
		String marca = sc.nextLine();
		
		System.out.print("prezzo: ");
		String prezzoStr = sc.nextLine();
		int prezzo = Integer.parseInt(prezzoStr);
		
		System.out.print("iva: ");
		String ivaStr = sc.nextLine();
		int iva = Integer.parseInt(ivaStr);
		
		if (userChoise.equals("1")) {
			
			System.out.print("IMEI: ");
			String imei = sc.nextLine();
			
			System.out.print("memoria: ");
			String memoriaStr = sc.nextLine();
			int memoria = Integer.parseInt(memoriaStr);
			
			Smartphone s = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);
			prodotti[countProdotti++] = s;
		}
		if (userChoise.equals("2")) {
			
			System.out.print("altezza: ");
			String altezzaStr = sc.nextLine();
			int altezza = Integer.parseInt(altezzaStr);
			
			System.out.print("larghezza: ");
			String larghezzaStr = sc.nextLine();
			int larghezza = Integer.parseInt(larghezzaStr);
			
			System.out.print("smart: ");
			String smartStr = sc.nextLine();
			boolean smart = smartStr.equals("yes");
			
			Televisore t = new Televisore(codice, nome, marca, prezzo, iva, altezza, larghezza, smart);
			prodotti[countProdotti++] = t;
		}
		if (userChoise.equals("3")) {
			
			System.out.print("colore: ");
			String colore = sc.nextLine();
			
			System.out.print("wireless: ");
			String wirelessStr = sc.nextLine();
			boolean wireless = wirelessStr.equals("yes");
			
			Cuffie c = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);
			prodotti[countProdotti++] = c;
		}
	}
	
	static void printTestProducts() {
		
		Prodotto p = new Prodotto(23434, "monitor", "lg", 40032, 22);
		System.out.println(p);
		
		System.out.println("---------------------------");
		
		Smartphone s = new Smartphone(23142, "Galaxy", "Samsung", 
									  120045, 22, "2342342342", 128);
		System.out.println(s);
		System.out.println("---------------------------");
		
		Televisore t = new Televisore(23423, "magic tv", "hp", 44565, 22, 20, 45, true);
		System.out.println(t);
		System.out.println("---------------------------");
		
		Cuffie c = new Cuffie(23444, "wh-1000", "sony", 34045, 22, "nere", true);
		System.out.println(c);
		System.out.println("--------------------------");
	}
}










