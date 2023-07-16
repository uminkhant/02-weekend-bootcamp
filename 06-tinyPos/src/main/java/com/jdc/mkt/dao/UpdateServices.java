package com.jdc.mkt.dao;

public interface UpdateServices<T> {

	int insert(T t);
	int update(T t);
	int delete(int id);
	
}
