package br.com.furb.util;

/**
 * Classe que faz a valida��o do CPF
 * 
 * @author ingmar
 *
 */
public class CpfValidator {
	/**
	 * Verifica se a String passada � um CPF v�lido.
	 * 
	 * @param cpf
	 *            String contendo o CPF a ser validado
	 * @return True se o CPF for v�lido.
	 */
	public static boolean isCpf(String cpf) {
		cpf = cpf.replaceAll("\\.", "").replaceAll("-", "");

		if (cpf.length() < 11) {
			return false;
		}

		if (hasSameDigits(cpf.toCharArray())) {
			return false;
		}

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
		// calcula o segundo d�gito verificador
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

	/**
	 * Verifica se o CPF possui o mesmo d�gito para todas as posi��es, exemplo: 00000000000
	 * @param digits Array com os valores do CPF
	 * @return True se todos os valores forem do mesmo d�gito
	 */
	private static boolean hasSameDigits(char[] digits) {
		boolean result = true;
		int i = 1;
		int last = digits[0] - 48;
		while (i < digits.length) {
			int actual = digits[i] - 48;
			if (actual != last) {
				result = false;
				break;
			}
			last = actual;
			i++;
		}
		
		return result;
	}
}
