package Network;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {
	public static void main(String[] args) {
		BufferedWriter out = null;
		BufferedReader in = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in); 
		
		try {
			socket = new Socket("localhost",9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예: 24 + 42) >> ");
				String ouputMessage = sc.nextLine();
		
				if(ouputMessage.equalsIgnoreCase("bye")) {
					out.write(ouputMessage + "\n");
					out.flush();
					break;
				}
				out.write(ouputMessage + "\n");
				out.flush();
				
				String inputMessage = in.readLine();
				System.out.println("계산 결과: " + inputMessage);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				if(socket != null) {
					socket.close();
				}
				
			}catch(IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}