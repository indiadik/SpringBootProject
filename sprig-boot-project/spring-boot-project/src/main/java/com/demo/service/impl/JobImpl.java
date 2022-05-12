package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.entity.ApplyEntity;
import com.demo.entity.Education;
import com.demo.entity.PostEntity;
import com.demo.entity.WebDesigner;
import com.demo.entity.WebDevelopment;
import com.demo.entity.php;
import com.demo.model.ApplyBean;
import com.demo.model.PostBean;
import com.demo.repository.ApplyEntityRepository;
import com.demo.repository.EducationRepository;
import com.demo.repository.PostEntityRepository;
import com.demo.repository.WebDesignerRepository;
import com.demo.repository.WebDevlopmentRepository;
import com.demo.repository.phpRepository;
import com.demo.service.IJob;
@Service
public class JobImpl implements IJob {
	
	String job;
@Autowired
WebDevlopmentRepository wbrepo;

@Autowired
EducationRepository edurepo;

@Autowired
phpRepository phrepo;

@Autowired
WebDesignerRepository wdgrepo;
@Autowired
ApplyEntityRepository applyRepo;

@Autowired
PostEntityRepository postRepo;
	@Override
	public Page<WebDevelopment> findWbJob(Integer index) {
		Pageable page=PageRequest.of(index, 5);
		return wbrepo.findAll(page);
		
	}
	public void applyJob(ApplyBean ab) {
		ApplyEntity ae= new ApplyEntity();
		 
		 BeanUtils.copyProperties(ab, ae);
		applyRepo.save(ae);
		
	}
	
	public void postJob(PostBean ab) {
		PostEntity ae= new PostEntity();
		 job= ab.getName();
		switch(job) {
		case "wb":
			WebDesigner wjob = new WebDesigner();
			BeanUtils.copyProperties(ab, ae);
			BeanUtils.copyProperties(ae, wjob);
			 
			 wdgrepo.save(wjob);
			break;
		case "php":
			php pjob= new php();
			BeanUtils.copyProperties(ab, ae);
			 BeanUtils.copyProperties(ae, pjob);
			 phrepo.save(pjob);
			break;
		case "wdg":
			WebDevelopment wdjob = new WebDevelopment();
			BeanUtils.copyProperties(ab, ae);
			  BeanUtils.copyProperties(ae, wdjob);
			  wbrepo.save(wdjob);
			break;
		case "edu":
			 Education ejob= new Education();
			 BeanUtils.copyProperties(ab, ae);
			 BeanUtils.copyProperties(ae, ejob);
			 edurepo.save(ejob);
			break;
		
		
		
		}
		
		 
		
	}
	
	@Override
	public Page<Education> findEdJob(Integer index) {
		Pageable page=PageRequest.of(index, 5);
		return edurepo.findAll(page);
	}
	
	
	@Override
	public Page<php> findPhpJob(Integer index) {
		Pageable page=PageRequest.of(index, 5);
		return phrepo.findAll(page);
	}
	@Override
	public Page<WebDesigner> findWdgJob(Integer index) {
		Pageable page=PageRequest.of(index, 5);
		return wdgrepo.findAll(page);
	}
	public List<ApplyEntity> findWebCand(Integer index) {
		return applyRepo.readCand("wb");
		
	}
	
	public List<ApplyEntity> findPhpCand(Integer index) {
		
		return applyRepo.readCand("php");
	}
	public List<ApplyEntity> findDesCand(Integer index) {
		
		return applyRepo.readCand("wdg");
	}
	public List<ApplyEntity> findEduCand(Integer index) {
		
		return applyRepo.readCand("edu");
	}
	
  
}
