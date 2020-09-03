package com.tagHandler;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SimpleTagHandler extends TagSupport{

@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try{
		out.println(Calendar.getInstance().getTime());
	}
	catch(Exception e){
		System.out.println("e:"+e);	
	}
		
return SKIP_BODY;
}
}
