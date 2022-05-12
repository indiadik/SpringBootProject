package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.demo.entity.WebDevelopment;
@Repository
public interface WebDevlopmentRepository extends JpaRepository<WebDevelopment,String>{

	

}
