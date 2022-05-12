package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
@Autowired
JavaMailSender mailSender;
public void sendMailToCustomer(String email,String name)
{
	SimpleMailMessage smm = new SimpleMailMessage();
	smm.setTo(email);
	smm.setSubject("confirmation mail");
	smm.setText("Hello"+name+"Application Submmited Successfully! \n\nregards\n\n HireWithUs");
	mailSender.send(smm);
}
}
