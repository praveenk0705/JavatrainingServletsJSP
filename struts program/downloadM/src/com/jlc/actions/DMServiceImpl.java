package com.jlc.actions;

import java.util.List;

import com.jlc.beans.DownloadBean;

public class DMServiceImpl implements DMService {

	@Override
	public List<DownloadBean> showDownload() {
		return DAOFactory.getDMDAO().showDownload();
	}

	@Override
	public int addDownLoad(String fileName) {
		return DAOFactory.getDMDAO().addDownload(fileName);
	}

	@Override
	public List<DownloadBean> getAllDownload() {
		return DAOFactory.getDMDAO().getAllDownload();
	}

	@Override
	public int updateDownload(String id, String dname, String st) {
		return DAOFactory.getDMDAO().updateDownload(id,dname,st);
	}

}
