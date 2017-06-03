package com.jlc.actions;

import java.util.List;

import com.jlc.beans.DownloadBean;

public interface DMDAO {

	public List<DownloadBean> showDownload();

	public int addDownload(String fileName);

	public List<DownloadBean> getAllDownload();

	public int updateDownload(String id, String dname, String st);

}
