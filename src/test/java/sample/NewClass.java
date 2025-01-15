package sample;

public class NewClass {
	public static void main(String[] args) {
		TestClass test= TestClass.instance();
		TestClass test4= TestClass.instance();
		System.out.println(System.identityHashCode(test4));
         System.out.println(System.identityHashCode(test));
	}

}
