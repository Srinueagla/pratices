package srinu2;

public class Static1 {
	int number;
	static{
		System.out.println("Static block");
	}
	
	{
		System.out.println("NoN Static block");
	}
	
	public Static1() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		new Static1();
		
		}
	

}
