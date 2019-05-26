
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
	private static int[] failureFunction(char[] p) {
		int[] fail = new int[p.length];
		int i = 1;
		int j = 0;
		while(i<p.length){
			if(p[i]==p[j]){
				fail[i]=j+1;
				i++;
				j++;
			}else if(j>0) {
				j = fail[j-1];
			}else {
				fail[i] = 0;
				i++;
			}		
		}
		return fail;
	}
	public void KMP() {
		char[] t = str.toCharArray();
		int[] fail = failureFunction(p);// generates the failure function
		int i = 0;
		int j = 0;
		int comp = 0;
		while(i<t.length) {
			if(t[i]==p[j]) {
				comp++;
				if(j== p.length -1) {
					System.out.println("Match found at "+i+"! Total no of comparisons are: "+ comp);			
					return;
				}else {
					i++;
					j++;		
				}
			}else {
				comp++;
				if(j>0) {
					j = fail[j-1];
				}else {
					i++;
				}
			}
		}
		return;
	}
	
	public void boyerMoore() {
		ctr = 0;
		
	}
}
