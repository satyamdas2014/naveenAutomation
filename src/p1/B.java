package p1;

public class B {
	public static void main(String[] args) {
		String str = "Learn with Krishna Sandeep";
		String[] sp = str.split(" ");
		for(int i=0; i<sp.length; i++) {
			String s = sp[i];
			System.out.print(s.charAt(0));
		}
	}

}

