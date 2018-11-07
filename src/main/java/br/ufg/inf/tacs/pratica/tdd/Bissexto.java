package br.ufg.inf.tacs.pratica.tdd;

public class Bissexto {

	public static boolean isBissexto(int ano) {
		return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	}
}
