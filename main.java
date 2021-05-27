import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace();
	
	}
	public static void replace() {
		
		      File myObj = new File("lorem.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		         String data = myReader.nextLine();
		        
		       Pattern pattern = Pattern.compile("(lorem){1}");
		       Matcher matcher = pattern.matcher(data);
		       int count = 0;
		       while (matcher.find()) {
		           count++;
		       if(count == 27) {
		    	   matcher.replaceAll("kokot");
		       }
		       }
		      System.out.println(data);
		      
		      
		      }
		      
		   
		      myReader.close();
		    
		 
		
		      FileWriter myWriter = new FileWriter("lorem.txt");
		      myWriter.write();
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    
		    }
		  }
	}
}
