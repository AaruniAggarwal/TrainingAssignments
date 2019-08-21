class Aaruni_java_20Aug_Tables{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int result=1;
		for(int i=0;i<=b;i++){
           result= a*i;
           System.out.print(a + "*" + i + "=" + result+ "\n");
		}
	}
}