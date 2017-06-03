package com.jlcindia.struts1;

import java.util.List;

public class ContactServiceImpl implements ContactService {

	@Override
	public int addContact(ContactTO cto) {
		return DAOFactory.getContactDAO().addContact(cto);
	}

	@Override
	public ContactTO getContactByEmail(String email) {
		return DAOFactory.getContactDAO().getContactByEmail(email);
	}

	@Override
	public int updateContact(ContactTO cto) {
		// TODO Auto-generated method stub
		return  DAOFactory.getContactDAO().updateContact(cto);
	}

	@Override
	public List<ContactTO> getAllContacts(int start, int total) {
		return DAOFactory.getContactDAO().getAllContacts(start, total);
	}

	@Override
	public int getTotalNumberOfRecords() {
		
		return DAOFactory.getContactDAO().getTotalNumberOfRecords();
	}

	@Override
	public int deleteContact(String cid) {
		return DAOFactory.getContactDAO().deleteContact(cid);
	}

}
