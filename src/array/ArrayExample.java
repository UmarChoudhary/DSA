package array;

public class ArrayExample {
	public static void main(String[] args) {
//		int [] A = new int [10];  //Array of Integer
		
		int A [] = {1, 34, 56, 67, 78};
		System.out.println("Size of an Array: "+A.length);
		
//		for (int i=0; i<A.length; i++)
		for (int x:A)
		{
			System.out.println(x);  // <- Loop Print of Array
		}
//		System.out.println(A[2]);
//		System.out.println(A[4]);

	}

}
