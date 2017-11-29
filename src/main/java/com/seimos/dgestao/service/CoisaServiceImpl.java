package com.seimos.dgestao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;
import com.seimos.dgestao.dao.CoisaDao;
import com.seimos.dgestao.domain.Coisa;

@Service
public class CoisaServiceImpl extends GenericServiceImpl<Coisa, CoisaDao> implements CoisaService {

	private CoisaDao coisaDao;

	@Override
	public GenericDao<Coisa> getDao() {
		return coisaDao;
	}

	@Autowired
	public void setCoisaDao(CoisaDao coisaDao) {
		this.coisaDao = coisaDao;
	}

}
