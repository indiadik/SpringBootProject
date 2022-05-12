package com.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.entity.ApplyEntity;
import com.demo.entity.Education;
import com.demo.entity.WebDesigner;
import com.demo.entity.WebDevelopment;
import com.demo.entity.php;
import com.demo.model.PostBean;

public interface IJob {
Page<WebDevelopment> findWbJob(Integer index);
Page<Education> findEdJob(Integer index);
Page<php> findPhpJob(Integer index);
Page<WebDesigner> findWdgJob(Integer index);
public void postJob(PostBean ab);

List<ApplyEntity> findWebCand(Integer index);
List<ApplyEntity> findEduCand(Integer index);
List<ApplyEntity> findPhpCand(Integer index);
List<ApplyEntity> findDesCand(Integer index);
}
