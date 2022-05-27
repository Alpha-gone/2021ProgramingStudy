import lib.*;

public class ObjectPropertyEx {
	public static void main(String[] args) {
//		Point p = new Point(2, 3);
//		
//		System.out.println(p.getClass().getName());
//		System.out.println(p.hashCode());
//		System.out.println(p.toString());
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) {
			System.out.println("a==b");
		}
		
		if(a.equals(b)) {
			System.out.println("a us equlas to b");
		}
		
		if(a.equals(c)) {
			System.out.println("a us equlas to c");
		}
	}
}
