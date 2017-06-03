package com.jlc.actions;

import java.util.List;

import com.jlc.beans.DownloadBean;

public interface DMService {

	List<DownloadBean> showDownload();

	int addDownLoad(String fileName);

	List<DownloadBean> getAllDownload();

	int updateDownload(String id, String dname, String st);

}
