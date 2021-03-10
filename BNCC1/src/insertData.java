import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class insertData{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Berikut Kode Karyawan: ");
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		String randomAlph = "";
		String randomInt = "";
		String jK="";
		Random rand = new Random();
		char[] alph = new char[2];
		for(int i=0; i < 2;i++) {
			alph[i] = characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i=0; i < alph.length; i++) {
			randomAlph += alph[i];
		}
		int[] angka = new int[4];
		for(int i=0; i<4;i++)
		{
			angka[i]=rand.nextInt(4);
		}
		for(int i=0; i < 4; i++) {
			randomInt += angka[i];
		}
		randomString = randomAlph+"-"+randomInt;
		System.out.println(randomString);
		System.out.println("Input Nama Karyawan (>=3): ");
		String nama=scan.nextLine();
		while(nama.length()<3)
		{
			System.out.println("Input Salah. Coba lagi.");
			
		}
		System.out.println(nama);
		System.out.println("Input Jenis Kelamin: (Laki-Laki / Perempuan)");
		String jk=scan.nextLine();
		String jk1="Laki-Laki";
		String jk2="Perempuan";
		boolean statusjk=false;
		if(jk.equals(jk1)||jk.equals(jk2))
		{
			System.out.println(jk);
		}
		else {
			System.out.println("Input Salah. Coba lagi.");
			statusjk=true;
		}
		System.out.println("Input Jabatan: (Manager / Supervisor / Admin)");
		String jbt=scan.nextLine();
		String jbt1="Manager";
		String jbt2="Supervisor";
		String jbt3="Admin";
		boolean statusjbt=false;
		if(jbt.equals(jbt1)|| jbt.equals(jbt2) || jbt.equals(jbt3))
		{
			System.out.println(jbt);
			
		}
		else 
		{
			System.out.println("Input Salah. Coba lagi.");
			statusjbt=true;
		}
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("Database.txt"));
			String s="";
			
			while( (s=br.readLine()) !=null)
			{
				if(!s.contains(randomString) && !s.contains(nama))
				{
					if(statusjk==false && statusjbt==false) {
						System.out.println("Berhasil menambahkan karyawan dengan id "+randomString);
						File f= new File("Database.txt");
						PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
						if(jbt.equals(jbt1)) {
							pw.append(randomString+","+nama+","+jk+","+jbt+"\n");
						}
						else if(jbt.equals(jbt2)) {
							pw.append(randomString+","+nama+","+jk+","+jbt+"\n");
						}
						else if(jbt.equals(jbt3)) {
							pw.append(randomString+","+nama+","+jk+","+jbt+"\n");
						}
						
						pw.close();
						}
					else {
						System.out.println("Data Sudah Terdapat.");
						
				}
				
				}
			}
		}
		catch(Exception e) {};
	}
	
}

	


