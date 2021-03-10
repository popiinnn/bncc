import java.io.*;

public class deleteData
{

public static void main(String[] args){
String line = "";
int lineNo;
try
 {
FileReader fr = new FileReader("Database.txt");
BufferedReader br = new BufferedReader(fr);
for(lineNo=1;lineNo<3;lineNo++)
{
	while (lineNo == 1 || lineNo == 2){
	PrintWriter pw=new PrintWriter(new FileOutputStream("Database.txt",true));
	pw.append("");
	}
}
br.readLine();
}
catch (IOException e)
{
e.printStackTrace();
}
System.out.println("Line: " + line);
}
}
