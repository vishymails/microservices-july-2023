package com.bvr.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bvr.util.FeignServiceUtil;

@RestController
@RequestMapping("/feigndemo")
public class FeignController {

	public FeignController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/customer-servicename")
	public String getCustomerServiceName() {
		String mymessage = "Local logic can be executed";
		
		return mymessage + ":" + feignServiceUtil.getServiceName();
	}

	
	@GetMapping("/customer-serviceaddress")
	public String getCustomerServiceAddress() {
		String mymessage = "Local logic can be executed - 2 ";
		
		return mymessage + ":" + feignServiceUtil.getServiceAddress();
	}

	
	@GetMapping("/customer-servicedetails")
	public String getCustomerServiceDetails() {
		String mymessage = "Local logic can be executed - 3";
		
		return mymessage + ":" + feignServiceUtil.getServiceDetails();
	}

}
