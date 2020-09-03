package com.tagHandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AttributeTagHandler extends TagSupport {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
	public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try{
		out.println("welcome"+name);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return SKIP_BODY;
	}
	
}
