package basics;

public class boxingandunboxing {
	public static void main(String[] args) {
		// primitive type
		int i = 100;
// primitive type converted to wrapper type
// automatically (auto-boxing)
		//Integer i1 = i;
// boxing using Integer constructor
		//Integer i2 = new Integer(i);
// boxing using type casting.
		Integer i3 = (Integer)i;
		i3 = 500;
		System.out.println("i3: "+ i3);
		System.out.println("i: "+ i);
//unboxing method1
		Integer i4 = Integer.parseInt("100");
		System.out.println("i4:"+ i4);
////unboxing method2
		int i5 = (int)i4;
		System.out.println("i5: "+ i5);
}
}
