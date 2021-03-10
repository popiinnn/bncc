import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class updateData {

		public static void main(String ar[])
	    {
	        updateData uf=new updateData();
	        uf.update();       
	    }
	    public void update()
	    {
	    
	        System.out.println("Masukan ID karyawan yang ingin diupdate:");
	        Scanner sc=new Scanner(System.in);
	        String id_to_change=sc.nextLine();
	        String to_change_column_names[]={"Nama:","Jenis Kelamin:","Jabatan:"};
	        int yes_no[]=new int[3];
	        String to_update[]=new String[3];

	        System.out.println("Masukkan 0 atau 1 untuk memilih kolom yang ingin diupdate (0: Tidak/1: Iya)");
	        for(int i=0;i<3;i++)
	        {
	            System.out.println(to_change_column_names[i]+"");
	            int temp=sc.nextInt();
	            yes_no[i]=temp;
	        }

	        System.out.println("__________________________________________________________________________________");
	        System.out.println("Masukan Data Pengganti");
	        for(int i=0;i<3;i++)
	        {
	            System.out.println(to_change_column_names[i]+"");
	            if(yes_no[i]==1)
	            {
	                Scanner sc1=new Scanner(System.in);
	                String temp_val=sc1.nextLine();
	                to_update[i]=temp_val;   
	                System.out.println();
	            }
	            else
	            {
	                System.out.println("Tidak Bisa Diubah");
	            }
	        }

	        StringBuffer sb=new StringBuffer();
	        try
	        {
	            BufferedReader br=new BufferedReader(new FileReader("Database.txt"));
	            String s="";
	            while((s=br.readLine())!=null)
	            {
	                String data[]=new String[6];
	                data=s.split(",");
	                if(id_to_change==data[0])
	                {
	                    String row=data[0]+",";
	                    for(int i=0;i<3;i++)
	                    {
	                        if(yes_no[i]==1)
	                        {
	                            row=row+to_update[i]+",";
	                        }
	                        else
	                        {
	                            row=row+data[i+1]+",";
	                        }

	                    }
	                    sb.append(row);
	                    sb.append("\n");
	                }
	                else
	                {
	                    sb.append(s);
	                    sb.append("\n");
	                }
	            }
	        
	        File f=new File("Database.txt");
	        PrintWriter pw=new PrintWriter(new FileOutputStream(f,false));
	        pw.print(sb.toString());
	        pw.close();
	        }
	        catch(Exception e)
	        {

	        }
	    }

	}

