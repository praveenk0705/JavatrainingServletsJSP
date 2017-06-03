package com.jlcindia.struts1;

import java.util.List;

public class DMServiceImpl implements DMService {

	@Override
	public List<Download> showDownload() {
		return DAOFactory.getDMDAO().showDownload();
	}

}
