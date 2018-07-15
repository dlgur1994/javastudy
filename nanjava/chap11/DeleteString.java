public class DeleteString {
	public static void main(String[] args) {
		String str = "990208-1012752";
		StringBuilder st = new StringBuilder(str);
		st.delete(6, 7);
		System.out.println(st);
	}
}
