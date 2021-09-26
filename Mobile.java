package javaday4;

public class Mobile {
	Sim s;
	public void insertSim(Sim s)
	{
		if(this.s==null)
		{
		this.s=s;
		System.out.println("sim inseted successfully ");
		
	}
		else
		{
			System.out.println("sim is already inserted..");
		}
		
}
	public void removeSim(Sim s)
	{
		if(this.s!=null)
		{
		this.s=null;
		System.out.println("sim remove successfully ");
		
	}
		else
		{
			System.out.println("sim is already remove.");
		}
			
		
	}
}
