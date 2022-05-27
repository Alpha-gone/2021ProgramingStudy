import java.io.*;
import java.util.*;

public class AlphabetHistogram {
	private int[] histoData = new int[26];
	
	public AlphabetHistogram() {
		Arrays.fill(histoData, 0);
	}
	
	public void run() throws IOException {
		String s = readString();
		makeHistogram(s);
		drawHistogram();
	}
	
	private void makeHistogram(String s) {
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				histoData[index]++;
			}
		}
	}
	
	private void drawHistogram() {
		System.out.println("\n히스토그램을 그립니다.");
		
		for(int i = 0; i < histoData.length; i++) {
			System.out.print((char)('A' + i));
			System.out.print("(" + histoData[i] + ")");
			
			for(int j = 0; j < histoData[i]; j++) {
				System.out.print('#');
			}
			System.out.println();
		}
	}
	
	private String readString() throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int nWhile = 1;
		 
		bw.write("알파벳을 입력하세요.\n");
		bw.write("입력이 종료되면, 종결 문자(;)를 입력하고, 엔터를 입력하세요.\n");
		bw.flush();
		
		while(nWhile == 1) {
			String line = br.readLine();
			
			if(line.equals(";")) {
				nWhile = 0;
				continue;
			}
		
			sb.append(line);
		}
		br.close();
		bw.close();		
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		AlphabetHistogram app = new AlphabetHistogram();
		app.run();
	}
}

