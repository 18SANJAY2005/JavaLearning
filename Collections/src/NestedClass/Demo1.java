package NestedClass;

import NestedClass.Demo.Sample;

public class Demo1 {
        public static void main(String[] args) {
			System.out.println(Sample.a);
			System.out.println(Demo.Sample.a);
			Demo.Sample s = new Demo.Sample();
			System.out.println(s.b);
			System.out.println(Demo.test.e);
			Demo d1 = new Demo();
			Demo.test t1 = d1.new test();
			System.out.println(t1.d);
		}
}
