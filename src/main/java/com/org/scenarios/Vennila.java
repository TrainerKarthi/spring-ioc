package com.org.scenarios;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Vennila implements IceCream {

	@Override
	public void flavour() {
		System.out.println("Vennila Flavour");
	}

}
