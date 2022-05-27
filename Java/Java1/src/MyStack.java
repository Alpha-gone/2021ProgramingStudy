import java.io.*;
import lib.*;

public class MyStack {
	public static void main(String[] args) throws IOException  {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		GStack<String> stringStack = new GStack<String>();
		GStack<Integer> intStack = new GStack<Integer>();
		int stackSize;
		
		stringStack.push("seoul");
		stringStack.push("Busan");
		stringStack.push("LA");
		
		stackSize = stringStack.size();
		
		for(int i = 0; i < stackSize; i++) {
			bw.write(stringStack.pop() + "\n");
		}
		
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		stackSize = intStack.size();
		
		for(int i = 0; i < stackSize; i++) {
			bw.write(Integer.toString(intStack.pop()) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}