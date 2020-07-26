import java.util.*;
class HouseConstruction
{
	int standard,areac;
	HouseConstruction(int std,int area)
	{
		standard=std;
		areac=area;
	}
	void calculateCost()
	{
		if(standard==1)
			System.out.printf("Construction Cost: "+areac*12000);
		else if(standard==2)
			System.out.printf("Construction Cost: "+areac*15000);
		else if(standard==3)
			System.out.printf("Construction Cost:"+areac*18000);
		else
			System.out.printf("Construction Cost:"+areac*25000);
	}
}
public class Construction 
{
	static
		{
		Scanner sc=new Scanner(System.in);
		int standard,area;
		System.out.printf("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home\n");
		standard=sc.nextInt();
		System.out.printf("Enter total area of the house in sq.ft\n");
		area=sc.nextInt();
		HouseConstruction ob1=new HouseConstruction(standard,area);
		ob1.calculateCost();
		}
	
	//upto java 6 we can run the program directly by using static block.
	//But in later versions we should use main method otherwise it raises an exception at run time.
	public static void main(String arg[])
	{
	}
}
