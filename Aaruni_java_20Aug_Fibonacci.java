	class Aaruni_java_20Aug_Fibonacci{
		public static void main(String[] args) {
			int a=0,b=1;
			int temp=0;
			System.out.print(a+" " +b);
			while(temp<89)
			{
		         temp=a+b;
			     a=b;
			     b=temp;
			    System.out.print(" ");
			    System.out.print(temp);
		    }
		}
	}