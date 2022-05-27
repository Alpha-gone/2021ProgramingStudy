import java.io.*;
import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, String> dic = new HashMap<String, String>();
		Iterator<String> it;
		Set<String> keys;
		String key, value, eng, kor;
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		keys = dic.keySet();
		it = keys.iterator();
		
		while(it.hasNext()) {
			key = it.next();
			value = dic.get(key);
			bw.write("(" + key + "," + value + ")");
		}
		bw.newLine();
		bw.flush();
		
		for(int i = 0; i < 3; i++) {
			bw.write("찾고 싶은 단어는? ");
			bw.flush();
			eng = br.readLine();
			
			kor = dic.get(eng);
			
			if(kor == null) {
				bw.write(eng + "는 없는 단어 입니다");
			}else {
				bw.write(kor);
			}
			bw.newLine();
			bw.flush();
			bw.close();
		}
	}
}