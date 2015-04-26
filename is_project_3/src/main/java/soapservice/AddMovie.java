package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AddMovie
{
	@WebMethod
	public String addMovie(String xml);
}