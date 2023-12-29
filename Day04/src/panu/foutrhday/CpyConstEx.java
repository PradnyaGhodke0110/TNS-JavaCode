package panu.foutrhday;

public class CpyConstEx 
{
	int id;
	String name;
	
	CpyConstEx(int a,String str)
	{
		id=a;
		name=str;
		
	}
	CpyConstEx(CpyConstEx c1)
	{
		id=c1.id;
		name=c1.name;
	}
	
	public void Display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CpyConstEx  cc=new CpyConstEx(1,"Pradnya");
		CpyConstEx  cc1=new CpyConstEx(cc);
		
		cc.Display();
		cc1.Display();

	}

}
