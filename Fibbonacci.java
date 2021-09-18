
public class Fibbonacci {
	public static void main (String args[]) {
		int n1=1,n2=2,n3,count=15,i;
		System.out.print("fibonacci series ");
		System.out.print(n1+" " +n2);
		for (i=1;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
      