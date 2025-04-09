package Assignment4;
public class StrBuffer {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Daniel");
		
		System.out.println(b.capacity());
		System.out.println(b.length());
		b.append("daniel");
		System.out.println(b);
		b.insert(6," Sui");
		System.out.println(b);
		b.delete(6, 16);
		System.out.println(b);
		b.setCharAt(0,'P');
		System.out.println(b);
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("ABCD");
		System.out.println(s1);
		s1.trimToSize();
		System.out.println(s1.capacity());
		StringBuffer s2=new StringBuffer("Daniel");
		s2.replace(0, 2,"Pe");
		System.out.println(s2);
		
	}

}
