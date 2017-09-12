package com.cmad.biz;

import com.cmad.data.BlogDAO;
import com.cmad.data.DAOFactoryImpl;
import com.cmad.data.UsersDAO;

public abstract class DAOFactory {
	private static DAOFactory _Instance = null; 
	public static DAOFactory getInstance() {
		if (_Instance == null) {
			_Instance = new DAOFactoryImpl();
		}
		return _Instance;
	}

	public abstract UsersDAO getUserDAO();
	
	public abstract BlogDAO getBlogDAO();
	
}
