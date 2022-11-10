class manipulation {
public static void main(String args[]) {
	String s1="Anudip Foundation";
	String s2="anudip";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//True
		System.out.println(s1.indexOf("D"));//-1
		System.out.println(s1.indexOf("d"));//3
		
		System.out.println(s1.substring(2));//udip
		System.out.println(s1.substring(2,5));//udi
	
		System.out.println(s1+" NGO");//
		System.out.println(s1.concat(s2));//adding

	System.out.println(s1.contains("dip"));//true
	System.out.println(s1.startsWith("A"));//true
	System.out.println(s1.endsWith("p"));//false
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());

	System.out.print(s1.repeat(3)+" ");
	System.out.println(s2.replace('a','R'));
	}
}
