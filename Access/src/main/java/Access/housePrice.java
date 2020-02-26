package Access;

import org.apache.logging.log4j.LogManager;

public class housePrice {
	private static final org.apache.logging.log4j.Logger Logger2 =LogManager.getLogger(Driver.class);
	 
public double totalCost(String s,double area)
{
	double price=0;
	if(s.equals("standard"))
	{
		price=1200*area;
		
	}
	else if(s.equals("above standard"))
	{
		price= 1500*area;
		
	}
	else if(s.equals("high standard"))
	{
		price= 1800*area;
		
	}
	else if(s.equals("high standard and fully automated"))
	{
		price= 2500*area;
		
	}
	
	 Logger2.info(price);
	    Logger2.error("code needs error corrrection");
	    
	    Logger2.fatal("abort can be occured");
	
		return price;

}
}
