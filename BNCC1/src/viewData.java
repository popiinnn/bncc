import java.io.*;
import java.util.*;

public class viewData {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader file = new FileReader("Database.txt");
		int countM=0,countS=0,countA=0;
		Scanner scan=new Scanner(file);
		while(scan.hasNextLine()) {
			if(scan.nextLine().contains("Manager")) {
			countM++;
			}
			else if(scan.nextLine().contains("Supervisor")) {
				countS++;
			}
			else if(scan.nextLine().contains("Admin")) {
				countA++;
			}
		}
		while(scan.hasNextLine()) {
			if(scan.nextLine().contains("Manager")) { 
				for(int i=0;i<countM && countM>=4;i++)
				{
					System.out.println(scan.nextLine()+", 8800000");
				}
				System.out.println(scan.nextLine()+", 8000000");
			}
			else if(scan.nextLine().contains("Supervisor")) { 
				for(int i=0;i<countS && countS>=4;i++)
				{
					System.out.println(scan.nextLine()+", 6450000");
				}
				System.out.println(scan.nextLine()+", 6000000");
			}
			else if(scan.nextLine().contains("Admin")) { 
				for(int i=0;i<countA && countA>=4;i++)
				{
					System.out.println(scan.nextLine()+", 4200000");
				}
				System.out.println(scan.nextLine()+", 4000000");
			}
		}
	}

}
