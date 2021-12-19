package com.sai.redirect.service.service;

import org.springframework.stereotype.Service;

@Service
public interface MappingService
{
	public Boolean checkIfExists(String shortURL);
	public String getLongURL(String shortURL);
}
