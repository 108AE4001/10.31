package text_p17;

public class Sample3_8 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234,25.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("�{���Ʒ܇�r��֪");
		System.out.println("܇̖��"+number+"����������"+gasoline);
	}

}
class Car
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("�{��܇̖");
		return num;
	}
	
	double getGas()
	{
		System.out.println("�{��������");
		return gas;
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"����������"+gas);
	}
}