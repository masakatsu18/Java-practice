
public class Chapter06 {
	public static void main(String[] args) {
		int a = 2;
		int c;
		c = a+5;
		System.out.println(c);
		//インクリメント//
		int b;
		b = 5;
		b++;
		System.out.println(b);
		//代入演算子//

		int d;
		d = 4;
		d *= 5;
		System.out.println(d);

		int e = 50;
		boolean f;
		f = e == 50;
		System.out.println(e);

		boolean bool = (e == 50);
        System.out.println(bool);

        bool = (e < 50) && (e % 10 == 0);
        System.out.println(bool);


	}
}
