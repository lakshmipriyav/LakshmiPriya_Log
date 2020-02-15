package Access;
import java.lang.*;
public class Driver {
public double simpleIntrest(double p,int t,double r)
{
	return ((p*t*r)/100);
}
public double compoundIntrest(double p,int t,double r)
{
	//return (p*(Math.pow((100+r)/100),(double)t))-p;
	double v=p*(Math.pow(((100+r)/100),(double)t));
	return v-p;
}
}
