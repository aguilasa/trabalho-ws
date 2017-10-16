package br.com.furb.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.furb.model.Cpf;
import br.com.furb.model.response.Response;
import br.com.furb.util.CpfValidator;

/**
 * Esta classe � respons�vel por disponibilizar o servi�o de valida��o do CPF
 * no seguinte endere�o: http://servidor/trabalho-ws/rest/cpf/validate
 * @author ingmar
 *
 */
@Path("/cpf")
public class CpfService {

	@POST
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/validate")
	public Response validar(Cpf cpf) {
		if (CpfValidator.isCpf(cpf.getCpf().trim())) {
			return new Response(1);
		}
		return new Response(0);
	}

}
