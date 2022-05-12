package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.ApplyEntity;
import com.demo.entity.Education;
import com.demo.entity.WebDesigner;
import com.demo.entity.WebDevelopment;
import com.demo.entity.php;
import com.demo.model.ApplyBean;
import com.demo.model.PostBean;
import com.demo.service.impl.EmailService;
import com.demo.service.impl.JobImpl;

@Controller
public class MyController {
	@Autowired
	JobImpl jobService;
	@Autowired
	EmailService eser;
	@GetMapping("/project")
	public String getIndex() {
		return "candidate";
	}
	@GetMapping("/post")
	public String postJob(Model model) {
		PostBean postBean = new PostBean();

		model.addAttribute("postBean", postBean);
		return "postjob";
	}
	
	@GetMapping("/getCandidate")
	public String showCand() {
		
		return "showCandList";
	}
	
	@GetMapping("/eduCand")
	public String EduCand(@RequestParam(defaultValue="0") Integer index,Model model)
	{
		List<ApplyEntity> list1 =jobService.findEduCand(index);
		
		
		model.addAttribute("list1", list1);
		
		return "CandList-edu";
	}	
	@GetMapping("/phpCand")
	public String PhpCand(@RequestParam(defaultValue="0") Integer index,Model model)
	{
		List<ApplyEntity> list1 =jobService.findPhpCand(index);
		
		
		model.addAttribute("list1", list1);
		
		return "CandList-php";
	}	
	@GetMapping("/webCand")
	public String WebCand(@RequestParam(defaultValue="0") Integer index,Model model)
	{
		List<ApplyEntity> list1 =jobService.findWebCand(index);
		
		
		model.addAttribute("list1", list1);
		
		return "CandList-web";
	}	
	@GetMapping("/desCand")
	public String DesCand(@RequestParam(defaultValue="0") Integer index,Model model)
	{
		List<ApplyEntity> list1 =jobService.findDesCand(index);
		
		model.addAttribute("list1", list1);
		
		return "CandList-des";
	}	
	
@GetMapping("/web")
public String ShowJob(@RequestParam(defaultValue="0") Integer index,Model model)
{
	Page<WebDevelopment> list =jobService.findWbJob(index);
	List<WebDevelopment> list1 = list.getContent();
	
	model.addAttribute("list1", list1);
	model.addAttribute("current", list.getNumber());
	model.addAttribute("next", list.hasNext());
	model.addAttribute("back", list.hasPrevious());
	return "wb-job";
}
@GetMapping("/edu")
public String ShowEduJob(@RequestParam(defaultValue="0") Integer index,Model model)
{
	Page<Education> list =jobService.findEdJob(index);
	List<Education> list1 = list.getContent();
	
	model.addAttribute("list1", list1);
	model.addAttribute("current", list.getNumber());
	model.addAttribute("next", list.hasNext());
	model.addAttribute("back", list.hasPrevious());
	return "edu-job";
}
@GetMapping("/php")
public String ShowPhpJob(@RequestParam(defaultValue="0") Integer index,Model model)
{
	Page<php> list =jobService.findPhpJob(index);
	List<php> list1 = list.getContent();
	
	model.addAttribute("list1", list1);
	model.addAttribute("current", list.getNumber());
	model.addAttribute("next", list.hasNext());
	model.addAttribute("back", list.hasPrevious());
	return "php-job";
}
@GetMapping("/design")
public String ShowDesignJob(@RequestParam(defaultValue="0") Integer index,Model model)
{
	Page<WebDesigner> list =jobService.findWdgJob(index);
	List<WebDesigner> list1 = list.getContent();
	
	model.addAttribute("list1", list1);
	model.addAttribute("current", list.getNumber());
	model.addAttribute("next", list.hasNext());
	model.addAttribute("back", list.hasPrevious());
	return "wdg-job";
}
@GetMapping("/apply-wb")
public String getApplyWb(Model model) {
	ApplyBean applyModel = new ApplyBean();

	model.addAttribute("applyModel", applyModel);
	return "apply-wb";
}
@GetMapping("/apply-php")
public String getApplyPhp(Model model) {
	ApplyBean applyModel = new ApplyBean();

	model.addAttribute("applyModel", applyModel);
	return "apply-php";
}
@GetMapping("/apply-edu")
public String getApplyEdu(Model model) {
	ApplyBean applyModel = new ApplyBean();

	model.addAttribute("applyModel", applyModel);
	return "apply-edu";
}
@GetMapping("/apply-wdg")
public String getApplyWdg(Model model) {
	ApplyBean applyModel = new ApplyBean();

	model.addAttribute("applyModel", applyModel);
	return "apply-wdg";
}
@PostMapping("/applySuccess")
public String applySuccess(@Valid @ModelAttribute("applyModel") ApplyBean applyModel, BindingResult result,Model model)
{
	if(result.hasErrors()) {
		String message ="Application Fail ";
		model.addAttribute("message",message);
		return "apply";
	}else {
		String name = applyModel.getName();
		
		jobService.applyJob(applyModel);
		
		String message = name+"Applyed Successfully ";
		model.addAttribute("msg",message);
		return "apply";
	}
}
@PostMapping("/postSuccess")
public String postSuccess(@Valid @ModelAttribute("postBean") PostBean postBean, BindingResult result,Model model)
{
	if(result.hasErrors()) {
		String message ="Application Fail ";
		model.addAttribute("message",message);
		return "apply";
	}else {
		
		
		jobService.postJob(postBean);
		
		String message = "POST Successfully ";
		model.addAttribute("msg",message);
		return "postjob";
	}
}
}
