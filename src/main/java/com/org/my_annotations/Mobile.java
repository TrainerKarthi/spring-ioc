package com.org.my_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

//	@Autowired
	private Sim sim;

	
//	public Mobile(@Autowired Sim sim) {
//		super();
//		this.sim = sim;
//	}


	public Sim getSim() {
		return sim;
	}

	@Autowired
	public void setSim(Sim sim) {
		this.sim = sim;
		System.out.println("Setter injection performed");
	}

}
