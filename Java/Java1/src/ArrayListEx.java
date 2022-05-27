import java.io.*;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> a = new ArrayList<String>();
		String sInput, sName;
		int longestIndex = 0;
		
		for(int i = 0; i < 4; i++) {
			bw.write("이름을 입력하세요>> ");
			bw.flush();
			sInput = br.readLine();
			a.add(sInput);
		}
		
		for(int i = 0; i < a.size(); i++) {
			sName = a.get(i);
			bw.write(sName + " ");
		}
		bw.flush();
		
		for(int i = 1; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		
		bw.write("\n가장 긴 이름은 : " + a.get(longestIndex));
		bw.flush();
	}
}