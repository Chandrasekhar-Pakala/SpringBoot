package com.usa.stores.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usa.stores.controller.services.StoreService;
import com.usa.stores.model.Store;

@Controller
public class CommerceStoresController {
	
	@Autowired(required=true)
	@Qualifier(value="b2bStore")
	private StoreService sService;
	
	@RequestMapping("/stores")
	public ModelAndView getStores(ModelMap model) {
		List<Store> storeList = Arrays.asList(new Store("Wal-Mart Stores, Inc.","Walmart is the largest retailer of consumer staples products in the world","Retail"),new Store("Home Depot","sells hard goods, such as nails and screws","hardware shop"),new Store("Toys & R Us","sells all kinds of toys","toy shop"));
		model.addAttribute("stores", storeList);
		System.out.println("Autowire check "+sService.getStore());
		return new ModelAndView("home", model);
	}
}
