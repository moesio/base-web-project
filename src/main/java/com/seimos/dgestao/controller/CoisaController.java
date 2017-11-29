package com.seimos.dgestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;
import com.seimos.dgestao.domain.Coisa;
import com.seimos.dgestao.service.CoisaService;
import com.seimos.dgestao.validator.CoisaValidator;

@Controller
@RequestMapping("/coisa")
public class CoisaController extends GenericCrudController<Coisa> {

	private CoisaService coisaService;
	private CoisaValidator coisaValidator;

	@Override
	public GenericService<Coisa> getService() {
		return coisaService;
	}

	@Override
	public GenericValidator<Coisa> getValidator() {
		return coisaValidator;
	}

	@Autowired
	public void setCoisaService(CoisaService coisaService) {
		this.coisaService = coisaService;
	}

	@Autowired
	public void setCoisaValidator(CoisaValidator coisaValidator) {
		this.coisaValidator = coisaValidator;
	}

}
