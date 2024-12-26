package com.edubbridge.contactapp.service;
import com.edubbridge.contactapp.dao.ContactDao;
import java.util.List;

import com.edubbridge.contactapp.dto.contact;
public class ContactService implements ContactServiceI {
     private ContactDao dao = new ContactDao();

	@Override
	public int addContact(contact c) {
		// TODO Auto-generated method stub
		return dao.addContact(c);
	}

	@Override
	public List<contact> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

	@Override
	public contact getContactByName(String name) {
		// TODO Auto-generated method stub
		return dao.getContactByName(name);

	}

	@Override
	public int updateContact(contact c) {
		// TODO Auto-generated method stub
		return dao.updateContact(c);

	}

	@Override
	public int deleteContact(String name) {
		// TODO Auto-generated method stub
		return dao.deleteContact(name);

	}
     
}
