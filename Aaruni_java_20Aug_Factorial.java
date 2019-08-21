class Aaruni_java_20Aug_Factorial{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int fact=1;
		while(a>1)
		{
           fact=fact*a;
           a--;
		}

		System.out.println("factorial of a number is" + fact);
	}
}