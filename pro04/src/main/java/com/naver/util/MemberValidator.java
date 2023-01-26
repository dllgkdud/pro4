package com.naver.util;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator{
	@Override
	public void validate(Object obj, Errors error) {
		System.out.println("validate action");
		Member member = (Member)obj;
		
		ValidationUtils.rejectIfEmpty(error, "id", "member.id.empty");
		ValidationUtils.rejectIfEmpty(error, "pw", "member.pw.empty");
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);
		if(!(pattern.matcher(member.getPw()).matches())) {
			error.rejectValue("pw", "member.pw.invalid");
		}
		/*
        String id = member.getId();
        String pw = member.getPw();
        
        //id�� ������� Ȯ��
        if(id == null || id.trim().isEmpty()) {
            error.rejectValue("id", "not value");
        }
        
        //pw�� ������� Ȯ��
        if(pw == null || pw.trim().isEmpty()) {
            error.rejectValue("pw", "not value");
        }
        
        //id�� 8~12 �������� Ȯ��
        else if(id.length() >= 8 && id.length() <= 12) {
            error.rejectValue("id", "bad size"); 
        }
        
        //pw�� 6~12�� �������� Ȯ��
        if(pw.length() >= 6 && pw.length() <= 12) {
            error.rejectValue("pw", "bad size");
        }
        */
	}
	@Override
	public boolean supports(Class<?> clazz) {
		return Member.class.equals(clazz);
	}
}
