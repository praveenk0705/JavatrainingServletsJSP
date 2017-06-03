package com.dell.struts1;

import java.util.List;

public class ContactServiceImpl implements ContactService {



	@Override
	public ContactTO getContactByEmail(String email) {
		return DAOFactory.getContactDAO().getContactByEmail(email);
	}

	}
