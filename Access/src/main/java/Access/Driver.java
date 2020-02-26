package Access;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

public class Driver {
	private static final org.apache.logging.log4j.Logger Logger1 =LogManager.getLogger(Driver.class);
	 
	//private static logger LOGGER =LogManager.getLogger(Driver.class);
	//private static Logger LOGGER=(Logger) LogManager.getLogger(Driver.class);
	double sintrest,cintrest;
public double simpleIntrest(double p,int t,double r)
{
	
	sintrest= ((p*t*r)/100);
	 Logger1.info(sintrest);
	    Logger1.error("code needs error corrrection");
	    
	    Logger1.fatal("abort can be occured");
	    //LOGGER.
	return sintrest;
}
public double compoundIntrest(double p,int t,double r)
{
	
	double v=p*(Math.pow(((100+r)/100),(double)t));
	cintrest= v-p;
	 Logger1.info(cintrest);
	    Logger1.error("code needs error corrrection");
	    
	    Logger1.fatal("abort can be occured");
	return cintrest;
}
}
