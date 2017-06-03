package com.jlc.actions;

import java.util.List;

public class DMServiceImpl implements DMService {

	@Override
	public List<String> showDownload(String cat) {
		return DAOFactory.getDMDAO().showDownload(cat);
	}

}
