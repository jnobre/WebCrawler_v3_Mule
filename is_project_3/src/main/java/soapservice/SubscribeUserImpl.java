package soapservice;

import javax.jws.WebService;

@WebService(endpointInterface = "soapservice.SubscribeUser", serviceName = "SubscribeUser")
public class SubscribeUserImpl implements SubscribeUser
{
	public String addUser(String userData)
	{
		return userData;
	}
}