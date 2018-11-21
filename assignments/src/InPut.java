import java.io.*;
//Sample Code for accepting code as char, string and integer
class InPut {

	public static void main(String[] args) throws Exception {

		System.out.print("Enter Char:");
		String s = InPut.readln();
		System.out.println(s);
		System.out.println("Enter Int:");
		String s1 = InPut.readln();
		int iVal;
		iVal = Integer.valueOf(s1);
		iVal++;
		System.out.println("Integer Value entered" + iVal);

		System.out.println("Enter string:");
		String s2 = InPut.readln();
		System.out.println(s2);

	}

	public static String readln() {
		String rep = "";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			rep = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rep;
	}

}