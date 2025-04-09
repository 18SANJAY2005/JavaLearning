package NestedClass;

public interface NestedInterface {
           interface Test<k,v>{
        	   int a=10;
           }
           public static void main(String[] args) {
			System.out.println(Demo.test.e);
			NestedInterface.Test<Integer,String> t1;
		}
}
