package com.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.ApplyEntity;
@Repository
public interface ApplyEntityRepository extends JpaRepository<ApplyEntity, String> {
	
	@Query("select e from ApplyEntity e where e.job =?1")
	List<ApplyEntity> readCand( String job);
}
