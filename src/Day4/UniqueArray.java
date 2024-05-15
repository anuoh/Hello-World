package Day4;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {25,9,9,10,3,7,9,1,0,5,0,9,8,8};
		
		for (int i=0; i<=a.length-1; i++) 
		{
			if(a[i]!=a[i+1])
		System.out.println(a[i]+ " " );
		}
		System.out.println(a[a.length-1]);	
	}

}
