import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(combination(n-1, 3));
	}

	private static int combination(int n, int m) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i=0;i<m;i++) {
			result *= n;
			n--;
		}
		int a=m;
		for (int i=0;i<m;i++) {
			result /= a;
			a--;
		}
		return result;
	}

}
