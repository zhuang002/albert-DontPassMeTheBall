import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i=1;i<=n-3;i++) {
			for (int j=i+1;j<=n-2;j++) {
				for (int k=j+1;k<=n-1;k++) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}

}
