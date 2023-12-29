package panu.foutrhday;

public class ParamConstEx
{
	int breadth;
	int height;
	int Square;
	
	ParamConstEx(int a1,int b1)
	{
		this.breadth=a1;
		this.height=b1;
	}
	public void Display()
	{
		Square=breadth*height;
		
		System.out.println(Square);
	}
	public static void main(String args[])
	{
		ParamConstEx pm=new ParamConstEx(10,20);
		pm.Display();
	}

}
