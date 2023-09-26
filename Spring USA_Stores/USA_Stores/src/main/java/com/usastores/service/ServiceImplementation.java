package com.usastores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.usastores.bean.StoreBean;
import com.usastores.dao.DAO;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service
{
	@Autowired
	DAO dao;

	public int insert(StoreBean storeBean) {
		return dao.insert(storeBean);
	}

	public int delete(int storeId) {
		return dao.delete(storeId);
	}

	public List<StoreBean> search(int storeId) {
		return dao.search(storeId);
	}

	public int update(StoreBean storeBean) {
		return dao.update(storeBean);
	}
	

}
