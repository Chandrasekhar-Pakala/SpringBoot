package com.usa.stores.controller.services;

import org.springframework.stereotype.Service;

@Service("b2bStore")
public class B2BStoreService implements StoreService {

	@Override
	public String getStore() {
		// TODO Auto-generated method stub
		return "Called B2BStoreService getStore Method";
	}

}
