package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.constants.ZuulConstants;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MypreFilter extends ZuulFilter {

	 HttpServletResponse resp;
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stubReq
		
//		return	RequestContext.getCurrentContext().getRequest().getMethod().equalsIgnoreCase("GET");
return		RequestContext.getCurrentContext().getRequest().getRequestURI().contains("/get");
//		 return RequestContext.getCurrentContext().getRequest().getUserPrincipal().getName().equals("ADMIN");
		
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		 log.info("-----PRE FLITER CALLED-------");
		 boolean result=	RequestContext.getCurrentContext().getRequest().getMethod().equalsIgnoreCase("POST");
		  if(result)
		  {
			 
			  try {
				RequestContext.getCurrentContext().getRequest().authenticate(resp);
			} catch (IOException | ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	
		 return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
