import java.io.*;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it;
		int nNum, nSum = 0;
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);

		it = v.iterator(); // 사용할 때 마다 재선언 필요 Next 초기화
		
		while(it.hasNext()) {
			nNum = it.next();
			nSum += nNum;
			bw.write(Integer.toString(nNum) + "\n");
		}
		bw.write("벡터에 있는 정수의 합 : " + Integer.toString(nSum));
		bw.flush();
	}
}