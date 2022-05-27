import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		int c;
		
		try {
			in = new FileReader("c:\\windows\\system.ini");
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일 찾기 오류");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("입출력 오류");
			//System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("오류 복구");
		}
	}
}