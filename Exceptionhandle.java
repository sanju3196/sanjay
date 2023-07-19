package exception;

public class Exceptionhandle {
	public static void main(String[] args) {
		System.out.println("welcome");
		int a = 10;
		int b = 5;
		int c = 0;
		String name = null;@Table(name = "mark_sheet")
	
		try {
			System.out.println(a/c);
		} catch (Exception e) {
			System.out.println("thavaru");
			// TODO: handle exception
		} 
		System.out.println(a*b);
		System.out.println("thank you");
		System.out.println(name);
		
		}
	}

}
