package JavaBasic;

public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1 = "Kalidas is the shakespeare of the INDIA";
		String var2 = "Kolkata is the Manchester of East India";
		String policyno = "The policy No. is ACP9999011";
		
		String var3 = "the";
		String var4 = "KOLKATA";
		
		boolean f1 = var1.contentEquals(var3);
		boolean f2 = var2.contains(var4);
		
		System.out.println(f1  + " AND " + f2);
		
		System.out.println("Last Index of the var3 in var1 -> " + var1.indexOf(var3));
		
		String[] policysplit = policyno.split(" ");
		
		for (String s : policysplit) {
			
			System.out.println(s);
		}
		
		String s1 = policysplit[4];
		System.out.println("Policy No. after split is -> " + s1);
		

	}

}
