package br.com.furb.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.furb.model.Cpf;
import br.com.furb.model.response.CpfResponse;

@Path("/cpf")
public class CpfService {

	@POST
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/validar")
	public CpfResponse validar(Cpf cpf) {
		return new CpfResponse(1, "Produto cadastrado com sucesso.", cpf);
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/testar")
	public Cpf getCpf() {
		return new Cpf("00328688045");
	}

}
