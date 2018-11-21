package assignments;

public class assignment18 {

	public static void main(String[] args) {
		String s=args[0];
		for(int i=1;i<args.length;i++)
			s=s+args[i];
		for(int i=s.length()-1;i>=0;i--)
			System.out.println(s.charAt(i));

	}

}
