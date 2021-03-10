import java.io.FileNotFoundException;
import java.util.*;
public class Menu {
	boolean exit;
	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu();
		menu.runMenu();
	}
	public void runMenu() throws FileNotFoundException {
		printHeader();
		while(!exit){
			printMenu();
			int pilihan = getInput();
			lakukan(pilihan);
		}
	}
	public void printHeader() {
		System.out.println("+-----------------------------------------+");
		System.out.println("|Selamat Datang di Manajemen Data Karyawan|");
		System.out.println("+-----------------------------------------+");
	}
	public void printMenu() {
		System.out.println("Apa yang ingin dilakukan?");
		System.out.println("(1)Insert Data Karyawan");
		System.out.println("(2)View Data Karyawan");
		System.out.println("(3)Update Data Karyawan");
		System.out.println("(4)Delete Data Karyawan");
		System.out.println("(5)Keluar");
		
	}
	public int getInput() {
		Scanner scan = new Scanner(System.in);
		int pilihan = -1;
		while(pilihan < 0 || pilihan >4) {
			try {
				System.out.print("\nMasukkan Pilihan Anda: ");
				pilihan = Integer.parseInt((scan.nextLine()));
			}
			catch(NumberFormatException e) {
				System.out.println("Pilihan Invalid.");
			}
		}
		return pilihan;
	}
	public void lakukan(int pilihan) throws FileNotFoundException {
		switch(pilihan) {
		case 1:
			insertData.main(null);
			break;
		case 2:
			viewData.main(null);
			break;
		case 3:
			updateData.main(null);
		case 4:
			deleteData.main(null);
			break;
		case 5:
			exit = true;
			System.out.println("Terima Kasih Telah Menggunakan Aplikasi Ini");
			break;
		default:
			System.out.println("Error.");
		}
	}
	
}
