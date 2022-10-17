import java.util.Scanner;


public class Compare {
	
	private int x, y;

	
	public int Compare(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public String toString() {
		return "Point ( "+ x + y + ")" ;
	}

	public boolean equals(Object obj) {
	
	}

	public boolean equals(Compare obj) {
		Compare p = (Compare) obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		}
		else {
			return false;
		}

	}



	public static void main(String[] args) {
		int a, b;
		int c, d;
		int run = 1;
		Scanner input = new Scanner(System.in);
		
		while (run == 1) {
			System.out.println("Enter the first number: ");
			a = input.nextInt();
			System.out.println("Enter the second number: ");
			b = input.nextInt();
			System.out.println("Enter the third number: ");
			c = input.nextInt();
			System.out.println("Enter the fourth number: ");
			d = input.nextInt();
			
			Compare Aanswer = new Compare(a, b);
			Compare Banswer = new Compare(c, d);

			System.out.println(a);
			System.out.println(b);
			if (Aanswer.equals(Banswer)) {
				System.out.println("The numbers are equal");
			} else {
				System.out.println("The numbers are not equal");
			}
		}

	}
}
