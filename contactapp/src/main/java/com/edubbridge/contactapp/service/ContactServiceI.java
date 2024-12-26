package com.edubbridge.contactapp.service;

import java.util.List;

import com.edubbridge.contactapp.dto.contact;

public interface ContactServiceI {
	 int addContact(contact c);
	  List<contact> getAllContacts();
	  contact getContactByName(String name);
	  int updateContact(contact c);
	  int deleteContact(String name);
}
