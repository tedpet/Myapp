package com.eltek.model;

import org.apache.log4j.Logger;

import com.eltek.model.Person;
import com.eltek.model.gen._Person;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;

public class Person extends _Person {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Person.class);

	public static Person validateLogin(EOEditingContext editingContext, String username, String password) {
		EOQualifier qual = Person.LOGIN.eq(username).and(Person.PASSWORD.eq(password));
		Person user = Person.fetchRequiredPerson(editingContext, qual);
		//NSLog.out.appendln("The user is " + user);
		return user;
	}
	
	public String fullName() {
		return firstName().substring(0,1) + ". " + lastName();
	}
}


