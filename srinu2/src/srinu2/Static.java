package srinu2;

import java.util.Random;

public class Static {
	static int number;
	public static void main(String[] args) {
				Static s1=new Static();
				s1.number=new Random().nextInt();
		
		
				Static s2=new Static();
				s1.number=new Random().nextInt();
				
				Static s3=new Static();
				s1.number=new Random().nextInt();
				
				System.out.println(s1.number);
				System.out.println(s2.number);
				System.out.println(s3.number);
		Static.number=new Random().nextInt();
		Static.number=new Random().nextInt();
		Static.number=new Random().nextInt();
		Static.number=new Random().nextInt();

		System.out.println(Static.number);
		System.out.println(Static.number);
		System.out.println(Static.number);
		System.out.println(Static.number);
	}

}
