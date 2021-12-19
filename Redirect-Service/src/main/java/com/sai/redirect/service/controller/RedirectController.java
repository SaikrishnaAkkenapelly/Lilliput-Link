package com.sai.redirect.service.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.redirect.service.dto.ResponseDTO;
import com.sai.redirect.service.service.MappingService;

@RestController
@RequestMapping(path ="/")
public class RedirectController
{
	@Autowired
	private MappingService mappingService;
	
	@GetMapping(path = "/ping")
	public ResponseEntity<ResponseDTO> ping()
	{
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(null,null,"ping successfull"),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{shortURL}")
	public ResponseEntity<ResponseDTO> redirect(@PathVariable String shortURL)
	{
		if(mappingService.checkIfExists(shortURL))
		{
			String longURL = mappingService.getLongURL(shortURL);
			URI uri = URI.create(longURL);
			return ResponseEntity.status(HttpStatus.FOUND).location(uri).build();
		}
		else
		{
			return new ResponseEntity<ResponseDTO>(new ResponseDTO(shortURL,null,"short url not found.."),HttpStatus.NOT_FOUND);
		}
	}
}
