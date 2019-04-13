package hackerrank.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
//			in = new FileInputStream("..\\java_school\\tema3\\src\\iostream\\in.txt");
			in = new FileInputStream("in.txt");
			out = new FileOutputStream("..\\java_school\\tema3\\src\\iostream\\out.txt");
			int val;
			
			while((val=in.read())!=-1) {
				out.write(val);
			}
		}catch(IOException e){
			System.out.println(e.getStackTrace());
		}
		finally{
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}
	}

}
