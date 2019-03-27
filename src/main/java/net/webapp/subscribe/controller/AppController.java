package net.webapp.subscribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	@RequestMapping("/")
	public class AppController {
	 
	    @Autowired
	    SubcriberService service;
	     
	    @Autowired
	    MessageSource messageSource;
	 
	    /*
	     * This method will list all existing employees.
	     */
	    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	    public String listEmployees(ModelMap model) {
	 
	        List<Subscriber> subscribers = service.findAllSubscriberss();
	        model.addAttribute("subscribers", subscribers);
	        return "allsubscribers";
	    }

}
