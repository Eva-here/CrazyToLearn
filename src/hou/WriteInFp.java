package hou;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteInFp {
	public void WriteFp(String txtName,String txtIn){
		BufferedWriter bos=null;
		try {
			String name = txtName+".txt";
			File file=new File(name);
			String[] temp=txtIn.split("[\\r\\n]");
			//把数据写到文件中
			bos=new BufferedWriter(
					new FileWriter(file));
			for (int i = 0; i < temp.length; i++) {
			bos.write(temp[i]);
			if(i%2==1)
			bos.write("\r\n");
			}
			bos.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
