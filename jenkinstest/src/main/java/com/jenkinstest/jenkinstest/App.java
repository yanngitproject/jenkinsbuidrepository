package com.jenkinstest.jenkinstest;


public class App implements Calculatrice {

	public static void main(String[] args) {
		App app = new App();

		if (validateArg(args)) {

			int a = 0, b = 0;

			try {
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);

			} catch (Exception e) {
				System.out.println("invalid integer argument  between entries :  " + args[0] + " or " + args[1]);
				System.exit(0);
			}

			System.out.println(a + " ET " + b);
			System.out.println(
					"ADD = " + app.add(a, b) + "\n" + "SUB = " + app.sub(a, b) + "\n" + "DIV = " + app.div(a, b));
		} else {
			System.exit(0);
		}

	}

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		return a - b;
	}

	@Override
	public int div(int a, int b) {

		int c = 0;

		try {
			c = a / b;
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		}

		return c;

	}

	private static boolean validateArg(String[] args) {
		if (args.length != 2) {
			System.out.println("invalid number of arguments");
			return false;
		}

		return true;
	}

}
