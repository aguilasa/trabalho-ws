package br.com.furb.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.furb.model.Cpf;
import br.com.furb.model.response.Response;

@Path("/cpf")
public class CpfService {

	@POST
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/validar")
	public Response validar(Cpf cpf) {
		return new Response(1);
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/testar")
	public Response getCpf() {
		return new Response(1);
	}

}
