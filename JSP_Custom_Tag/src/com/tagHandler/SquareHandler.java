package com.tagHandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SquareHandler extends TagSupport {
private int side;

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

@Override
	public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.println("square of no:"+side*side);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return SKIP_BODY;
	}
	
}
