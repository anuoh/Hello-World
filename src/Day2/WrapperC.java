package Day2;

public class WrapperC {
	public static void main(String[] args) {
		//str->int
		String str ="9";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		//int->str
		int x=65;;
		String y= Integer.toString(x);
		System.out.println(x);
		System.out.println(y);
		
		//arr->str
		char ch[] = {'a' ,'b' , 'c' , 'd'};
		String s1 = String.valueOf(ch);
		System.out.println(s1);
		
		//int->Integer
		int integerobj= Integer.valueOf(10);
		System.out.println("Integer.vaueOf(10)=  "   +integerobj);
		
		//Integer->float
		int i=100;
		float f;
		f=(float)i;
		System.out.println(f);
		
		//int obj->str obj
		int numInt = 123;
		String strObj = String.valueOf(numInt);
		System.out.println(strObj);
		
		//
		
		
  }
}