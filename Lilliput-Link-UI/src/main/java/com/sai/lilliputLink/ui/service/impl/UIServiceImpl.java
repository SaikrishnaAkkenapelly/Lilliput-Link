package com.sai.lilliputLink.ui.service.impl;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sai.lilliputLink.ui.dto.ShortenServiceRequestDTO;
import com.sai.lilliputLink.ui.dto.ShortenServiceResponseDTO;
import com.sai.lilliputLink.ui.service.UIService;

@Component
public class UIServiceImpl implements UIService
{
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public String getShortURL(String LongURL)
	{
		String host = null;
		
		try
		{
			host = InetAddress.getLocalHost().getHostName();
		}
		catch (UnknownHostException e)
		{
			host = "localhost";
			e.printStackTrace();
		}
		
		URI shortenServiceURL = URI.create("http://"+host+":8070/url/shorten");
		
		ShortenServiceRequestDTO requestDTO = new ShortenServiceRequestDTO(LongURL);
		
		return restTemplate.postForObject(shortenServiceURL,requestDTO,ShortenServiceResponseDTO.class).getShortURL();
	}
}
