package com.usa.stores.controller.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("b2cStore")
@Primary
public class B2CStoreService implements StoreService {

	@Override
	public String getStore() {
		// TODO Auto-generated method stub
		return "Called B2CStoreService getStore Method";
	}

}
