package com.org.scenarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lavan {
	
	@Autowired
	private IceCream cream;

	public IceCream getCream() {
		return cream;
	}

	public void setCream(IceCream cream) {
		this.cream = cream;
	}
	
	

}
