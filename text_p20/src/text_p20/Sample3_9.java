package text_p20;

public class Sample3_9 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10.0;
		
		car1.show();
	}

}
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}