public class ChangeStringOrder {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		StringBuilder st = new StringBuilder(str);
		System.out.println(st.reverse());
	}
}
