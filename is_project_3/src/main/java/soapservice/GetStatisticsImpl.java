package soapservice;

import javax.jws.WebService;

@WebService(endpointInterface = "soapservice.GetStatistics", serviceName = "GetStatistics")
public class GetStatisticsImpl implements GetStatistics
{
	public String getStatistics(String s)
	{
		return s;
	}
}