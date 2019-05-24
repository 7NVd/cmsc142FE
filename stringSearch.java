
public class stringSearch {
	
	private String pat;
	private String text;
	private int ctr;
	
	public stringSearch(String text, String pattern) {
		this.text = text;
		this.pat = pattern;
	}
	
	public void bruteForce() {
		ctr = 0;
		for(int i=0;i<=text.length()-pat.length();i++) {
			for(int j=0;j<pat.length();j++) {
				ctr++;
				if(pat.charAt(j)!=text.charAt(i+j))
					break;
				if(j==pat.length()-1) {
					System.out.println("Found at "+i);
					System.out.println(ctr+" comparisons");
					return;
				}
			}
		}
		System.out.println("No match");
		System.out.println(ctr+" comparisons");
	}
	
	public void KMP() {
		ctr = 0;
	}
	
	public void boyerMoore() {
		ctr = 0;
		
	}
}
