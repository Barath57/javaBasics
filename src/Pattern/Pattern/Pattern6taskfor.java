package Pattern.Pattern;

public class Pattern6taskfor {
	public static void main(String[] args) {
		int n=5;
		int mid=n/2;
		for(int i=0;i<n;i++) {	
			for(int j=0;j<n;j++) {
				if((i==j && i<=mid)||(i==mid && j>=mid)) {
				System.out.print("* ");
				}
				else if(i>mid && j==mid+2-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

