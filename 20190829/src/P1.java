import java.util.Scanner;

abstract class Car{
	
	private String made;
	private String modelName;
	protected int speed;
	protected int price;
	
	abstract public void speedUp();

	abstract public void speedDown();
}
class myCar extends Car{
	
	int Gasoline = 0;
	
	public void speedUp() 
	{
		speed = speed + 10;
		Gasoline = Gasoline - 5;
		System.out.println("Speed : " + speed + "km  Gasoline : " + Gasoline + "L");
	}

	public void speedDown() 
	{
		speed = speed - 10;
		System.out.println("Speed : " + speed + "km  Gasoline : " + Gasoline + "L");
	}

}
class truck extends Car{
	
	int LPG = 0;
	
	public void speedUp() 
	{
		speed = speed + 10;
		LPG = LPG - 10;
		System.out.println("Speed : " + speed + "km  LPG : " + LPG + "L");
	}

	public void speedDown() 
	{
		speed = speed - 10;
		System.out.println("Speed : " + speed + "km  LPG : " + LPG + "L");
	}
}

public class P1 {

	public static void main(String[] args) {
		myCar mc = new myCar();
		truck tr = new truck();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("A truck or a myCar?\n1.truck  2.myCar  3.EXIT");
			int choice = sc.nextInt();
			if(choice == 1)
			{	
				System.out.println("Status : " + tr.LPG + "L");
				System.out.println("Would you like to fill up the LPG?\n1.yes  2.no ");
				choice = sc.nextInt();
				
				
				if(choice == 1)
				{
					System.out.println("How many liters would you like?");
					tr.LPG = sc.nextInt();
				}
				else
				{
					if(tr.LPG == 0)
					{
						System.out.println("Fill up the LPG, please.");
						continue; //처음부터 돌아가는게 맘에 안들어요
					}
					else
					{
						System.out.println("Ok");
					}
				}
				while(true)
				{
					System.out.println("1.SpeedUp  2.SpeedDown  3.EXIT");
					int num = sc.nextInt();
					
					if(num == 1)
					{
						tr.speedUp();
					}
					else if(num == 2)
					{
						tr.speedDown();
					}
					else
					{
						System.out.println("‡‡‡ Stop Driving ‡‡‡");
						break;
					}
				}
			}
			else if(choice == 2)
			{
				System.out.println("Status : " + mc.Gasoline + "L");
				System.out.println("Would you like to fill up the Gasoline?\n1.yes  2.no ");
				choice = sc.nextInt();
				
				if(choice == 1)
				{
					System.out.println("How many liters would you like?");
					mc.Gasoline = sc.nextInt();
				}
				else
				{
					if(mc.Gasoline == 0)
					{
						System.out.println("Fill up the Gasoline, please.");
						continue; //?
					}
					else
					{
						System.out.println("Ok");
					}
				}
				while(true)
				{
					System.out.println("1.SpeedUp  2.SpeedDown  3.EXIT");
					int num = sc.nextInt();
					
					if(num == 1)
					{
						mc.speedUp();
					}
					else if(num == 2)
					{
						mc.speedDown();
					}
					else
					{
						System.out.println("‡‡‡ Stop Driving ‡‡‡");
						break;
					}
				}
			}
			else
			{
				System.out.println("The End");
				break;
			}
		}
	}
}
