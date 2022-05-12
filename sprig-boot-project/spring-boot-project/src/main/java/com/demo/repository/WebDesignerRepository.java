
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.WebDesigner;
@Repository
public interface WebDesignerRepository extends JpaRepository<WebDesigner, String> {

}
