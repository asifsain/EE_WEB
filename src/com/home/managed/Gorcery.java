package com.home.managed;

import javax.annotation.Resource;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.transaction.UserTransaction;

import com.home.managed.annotations.Random;

import java.io.Serializable;

@Named
@javax.enterprise.context.SessionScoped
public class Gorcery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Gorcery() {
		// TODO Auto-generated constructor stub
	}

	

	// @Random is a Qualifier
	@Produces @Random  int next() {
		return 99 + 1;
	}


}
