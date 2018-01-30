
public class RegExFinder {

	public static void main(String[] args) {
   String neeraj = "this is a test method.01--t.*s -- This means anything between t and s.+"
   		+ " 02--t[abcdefg]s ---This means anything among a ,b,c, d, e, f, g between t and s but only one charater" +
"03--t[abcdefg]*s ---This means anything among a ,b,c, d, e, f, g between t and s and in any numbers";
	
	System.out.println(neeraj.replaceAll("(\\w)(\\s+)([\\.,])", "$1$3"));
	
	
	
	
	}

}
