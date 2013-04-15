import java.io.*;

public class HighScore  {

	public static File myFile=new File("deneme.txt");

	HighScore(int skor , String username) throws IOException{
		printFile(skor , username);
	}
	private static void printFile(int skor , String username) throws IOException {
       
        FileWriter fwriter=new FileWriter(myFile,true);
        try
        {
            BufferedWriter bw=new BufferedWriter(fwriter);
            bw.write(username+"\t"+skor+"\n");
            bw.close();
        }
        catch(IOException ex)
        {
            System.out.println("Yazarken oluþan hata = "+ex.toString());
        }  
}


}