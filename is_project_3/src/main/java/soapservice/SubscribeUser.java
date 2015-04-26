package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SubscribeUser
{ 	
	@WebMethod
	public String addUser(String userData);
}