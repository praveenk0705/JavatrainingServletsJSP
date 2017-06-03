package com.jlcindia.struts1;

import java.util.List;

public interface ContactService {
public int addContact(ContactTO cto);
public ContactTO getContactByEmail(String email);
public int updateContact(ContactTO cto);
public List<ContactTO> getAllContacts(int start,int total);
public int getTotalNumberOfRecords();
public int deleteContact(String cid);

}
