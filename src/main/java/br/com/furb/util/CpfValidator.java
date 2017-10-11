package br.com.furb.util;

public class CpfValidator {
	public static boolean isCpf(String cpf) {
		int digitosCpf[] = new int[11]; // d�gitos do cpf
		int i, j, totalSoma, resultado, verificador1, verificador2;
		// efetua a convers�o do cpf, de string para d�gitos num�ricos
		for (i = 0; i < 11; i++) {
			digitosCpf[i] = cpf.charAt(i) - 48;
		}
		// calcula o primeiro d�gito verificador
		totalSoma = 0;
		for (i = 0, j = 10; i < 9; i++, j--) {
			totalSoma = totalSoma + (digitosCpf[i] * j);
		}
		resultado = totalSoma % 11;
		if ((resultado == 0) || (resultado == 1)) {
			verificador1 = 0;
		} else {
			verificador1 = 11 - resultado;
		}
		// calcula o segudno d�gito verificador
		totalSoma = 0;
		for (i = 0, j = 11; i < 9; i++, j--) {
			totalSoma = totalSoma + digitosCpf[i] * j;
		}
		totalSoma = totalSoma + (verificador1 * 2);
		resultado = totalSoma % 11;
		if ((resultado == 0) || (resultado == 1)) {
			verificador2 = 0;
		} else {
			verificador2 = 11 - resultado;
		}
		// verifica se o CPF � v�lido
		if ((verificador1 == digitosCpf[9]) && (verificador2 == digitosCpf[10])) {
			return true;
		}
		return false;
	}
}
