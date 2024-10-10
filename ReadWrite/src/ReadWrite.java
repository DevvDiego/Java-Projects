import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
//import java.util.*; 

public class ReadWrite {
    public static void main(String[] args){

        read();
        write();

    }

    public static void read(){
        try{
            FileReader fr = new FileReader("asdasd.txt");
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
            fr.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void write(){
		String str = "ABC"; 
		try { 

			FileWriter fw 
				= new FileWriter("asdasd.txt", true); 


			for (int i = 0; i < str.length(); i++) 
				fw.write(str.charAt(i)); 

			System.out.println("Escrito"); 

			fw.close(); 
		} 
		catch (IOException e) { 
			e.getMessage(); 
		} 
    }


}