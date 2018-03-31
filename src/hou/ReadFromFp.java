package hou;


import java.io.File;
import java.io.FileInputStream;

public class ReadFromFp {
	public String ReadFp(String txtName){
		String str = "";
		try {
			String name = txtName+".txt";
			File file=new File(name);
			 FileInputStream in=new FileInputStream(file);  
		        // size  为字串的长度 ，这里一次性读完  
		        int size=in.available();  
		        byte[] buffer=new byte[size];  
		        in.read(buffer);  
		        in.close();  
		        str=new String(buffer);  
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return str;
	}
}