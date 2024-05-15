package Day4;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {50,100,40,20,60};
int max= a[0];
for (int i=1; i<=a.length-1; i++)
{
	if(a[i]>max)
	{
	max=a[i];
	}
System.out.println("Max= "  +max);
    }
 }
}