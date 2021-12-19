package com.sai.redirect.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.sai.redirect.service.model.URLMapping;
import com.sai.redirect.service.repository.URLMappingRepository;
import com.sai.redirect.service.service.MappingService;

@Component
public class MappingServiceImpl implements MappingService
{
	@Autowired
	URLMappingRepository mappingRepository;
	
	@Override
	public Boolean checkIfExists(String shortURL)
	{
		URLMapping mapping = new URLMapping();
		
		mapping.setShortURL(shortURL);
		
		return mappingRepository.exists(Example.of(mapping));
	}
	
	@Override
	public String getLongURL(String shortURL)
	{
		return mappingRepository.findByShortURL(shortURL).getLongURL();
	}
}
