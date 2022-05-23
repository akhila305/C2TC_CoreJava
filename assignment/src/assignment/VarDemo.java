package assignment;

public class VarDemo
{
	public int max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args) {
		VarDemo obj=new VarDemo();
		int a=obj.max(20,30);
				System.out.println("The number is"+a);
		
		

	}

}
