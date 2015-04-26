package soapservice;

import javax.jws.WebService;

@WebService(endpointInterface = "soapservice.AddMovie", serviceName = "AddMovie")
public class AddMovieImpl implements AddMovie
{
	public String addMovie(String xml)
	{
		return xml;
	}
}