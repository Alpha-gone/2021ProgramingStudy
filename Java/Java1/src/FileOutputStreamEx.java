import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte[] b = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout =  new FileOutputStream("C:\\Temp\\test.out");
			
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("C:\\Temp\\test.out을 저장하였습니다.");
	}
}