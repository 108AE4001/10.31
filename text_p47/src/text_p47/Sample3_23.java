package text_p47;

public class Sample3_23 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "һ̖܇";
				
		car1.setCar(number,gasoline);
		car1.setName(str);
		
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	private String name;
	
	public Car()
	{
		num = 0;
		gas =0.0;
		System.out.println("���a��܇��");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"�����������O��"+gas);
	}
	
	public void setName(String nm)
	{
		name =nm;
		System.out.println("��܇���O��"+name);
				
	}
	
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
		System.out.println("܇����"+name);
	}
}