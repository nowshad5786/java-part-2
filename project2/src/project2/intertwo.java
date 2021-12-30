package project2;

public class intertwo {
	public static void main(String args[])
	{
		Car a = new Car();
		a.canCarry(4);
		a.tuneUpCost();
	}

}
interface IVehicle
{
	public double tuneUpCost();
	public boolean cnaCarry(int numPass);
}
class Car implements IVehicle
{
	@Override
	public double tuneUpCost() {
		return 3000;
	}
	
	@Override
	public boolean canCarry(int numPass)
	{
		boolean status = true;
		if(numPass>5) {
			status = false;
		}
		return status;
	}
}
