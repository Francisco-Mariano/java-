
public abstract class Programa {

	public static void main(String[] args) {

		String original = "  !  abcde FJHIJ ABC abc DEFG     !";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim().toUpperCase();
		String s04 = original.substring(3, 3) + original.substring(11).trim();
		String s05 = original.substring(2, 10);
		String s06 = original.replace("a", "WW");
		String s07 = original.replace("abc", "PUTA MERDA");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String s = "Francisco Mariano Carvalho";
		String[] vetor = s.split(" ");
		System.out.println("s01: " + s01);
		System.out.println("s02: " + s02);
		System.out.println("s03: " + s03);
		System.out.println("s04: " + s04);
		System.out.println("s05: " + s05);
		System.out.println("s06: " + s06);
		System.out.println("s07: " + s07);
		System.out.println("i :" + i);
		System.out.println("j :" + j);

		System.out.printf("%n");

		System.out.printf("%n" + vetor[0]);
		System.out.printf("%n" + vetor[1]);
		System.out.printf("%n" + vetor[2]);

	}

}
