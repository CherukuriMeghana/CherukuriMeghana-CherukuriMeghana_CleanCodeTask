import java.util.*;
import java.math.*;
class SimpleInterest
{
	double amount,rate,time;
	SimpleInterest(double p,double r,double t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculate()
	{
		System.out.printf("\nSimple Interest:"+(amount*rate*time)/100+"\n Final amount:"+(amount+(amount*rate*time)/100));
	}
}
class CompoundInterest
{
	double amount,rate,time,count=0;
	CompoundInterest(double p,double r,double t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculateS()
	{
		System.out.printf("\nCompound Interest:"+(amount * (Math.pow((1 + rate / 100), time))-amount)+"\n Final amount:"+amount * (Math.pow((1 + rate / 100), time)));
	}
}
public class InterestS
{
	static
	{
		double p,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter amount\n");
		p=sc.nextDouble();
		System.out.printf("enter rate of interest\n");
		r=sc.nextDouble();
		System.out.printf("enter time\n");
		t=sc.nextDouble();
		SimpleInterest si=new SimpleInterest(p,r,t);
		si.calculate();
		CompoundInterest ci=new CompoundInterest(p,r,t);
		ci.calculateS();
	}
	//upto java 6 we can run the program directly by using static block.
	//But in later versions we should use main method otherwise it raises an exception at run time.
	public static void main(String arg[])
	{
		
	}
}
