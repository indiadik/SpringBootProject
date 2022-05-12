package com.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.PostEntity;


public interface PostEntityRepository extends JpaRepository<PostEntity, String> {

	
}
