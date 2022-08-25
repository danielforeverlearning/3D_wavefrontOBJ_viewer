

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WavefrontOBJ_Model {
	
	ArrayList<WavefrontOBJ_Object> myobjects;
	
	public WavefrontOBJ_Model() {
		myobjects = new ArrayList<WavefrontOBJ_Object>();
	}
	
	public int Read_File(String filepathname) {
		try {
               File myObj = new File(filepathname);
               Scanner myReader = new Scanner(myObj);
               while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
               }
               myReader.close();
			   return 0;
        } catch (FileNotFoundException e) {
               System.out.println("WavefrontOBJ_Model:Read_File: FileNotFoundException caught!");
               e.printStackTrace();
			   return -1;
        }
	}//Read_File
	

}//class

