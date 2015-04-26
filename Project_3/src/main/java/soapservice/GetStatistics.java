package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface GetStatistics
{
	@WebMethod
	public String getStatistics(String s);
}
