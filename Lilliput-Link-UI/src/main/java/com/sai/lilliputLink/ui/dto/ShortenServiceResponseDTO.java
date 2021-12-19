package com.sai.lilliputLink.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShortenServiceResponseDTO
{
	public String shortURL;
	public String longURL;
	public String message;
}
