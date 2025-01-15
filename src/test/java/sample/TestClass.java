package sample;

public class TestClass {
	
public static TestClass te=null;
		//private TestClass() {}
			public void method(){
			{
				te=null;
			}
		}
		public  static TestClass instance() {
		
			if(te==null) {
				te=new TestClass();
			}
		
			return te;
		}
		public static void main(String[] args) {
				TestClass test=instance();
				TestClass test1=instance();
				TestClass test2=instance();
		        TestClass test3=instance();
				TestClass test4=instance();
				System.out.println(System.identityHashCode(test4));
				System.out.println(System.identityHashCode(test3));
				System.out.println(System.identityHashCode(test2));
				System.out.println(System.identityHashCode(test1));
				System.out.println(System.identityHashCode(test));
}}