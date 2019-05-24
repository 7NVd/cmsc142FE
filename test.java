public class test {

	public static void main(String[] args) {
		
		String text = "hello world";
		String pattern = "ld";
		
		stringSearch holder = new stringSearch(text,pattern);
		
		holder.bruteForce();
		
	}

}
