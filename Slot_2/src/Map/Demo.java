package Map;

public class Demo {
	public static void main(String[] args) {
		Action add=(k,j) ->System.out.println(k+j);
		add.task(4, 5);
		Action sub=(m,n) ->System.out.println(m-n);
		sub.task(2, 10);
		System.out.println(add);
		Action1 add1=(a,b)->a+b;
		System.out.println(add1.task1(10, 20));
		Action1 sub1=(a,b)->{
			return a-b;
		};
		System.out.println(sub1.task1(3,19));
		
	}
}


interface Action{
	void task(int a,int b);
}


interface Action1{
	int task1(int a,int b);
}