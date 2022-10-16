package etc; 

public class CalculatorForMainApp {
	private int i;
	private int j;

	CalculatorForMainApp calculator = new CalculatorForMainApp();

	public int add(int i, int j) {
		this.i = i;
		this.j = j;

		return i + j;
	}

	public int sub(int i, int j) {
		this.i = i;
		this.j = j;

		return i - j;
	}


	public int mul(int i, int j) {
		this.i = i;
		this.j = j;

		return i * j;
	}

	public int div(int i, int j) {
		this.i = i;
		this.j = j;

		return i / j;
	}



}

