package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.php;
@Repository
public interface phpRepository extends JpaRepository<php, String> {

}
