package com.service.correios.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.service.correios.dto.Endereco;

@WebService(serviceName = "CorreiosService", 
		    portName = "CorreiosPort", 
		    targetNamespace = "http://com.service.correios/correios", 
		    name="Correios")
public class CorreiosService {
	
	@WebResult(name = "endereco")
	public Endereco consultaPorCep(@WebParam(name = "cep") String cep) {
	    return new Endereco("91370-140", "Retorno CEP", "Vila Ipiranga", "Porto Alegre");
	}
	
	@WebResult(name = "endereco")
	public Endereco consultaPorRua(@WebParam(name = "rua") String rua) {
	    return new Endereco("91370-140", "Retorno RUA", "Vila Ipiranga", "Porto Alegre");
	}
}
