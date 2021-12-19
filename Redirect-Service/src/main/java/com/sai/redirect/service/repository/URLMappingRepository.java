package com.sai.redirect.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.redirect.service.model.URLMapping;

@Repository
public interface URLMappingRepository extends JpaRepository<URLMapping, Long>
{
	public URLMapping findByShortURL(String shortURL);
}
