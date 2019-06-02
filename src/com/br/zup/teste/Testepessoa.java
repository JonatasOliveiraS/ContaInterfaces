package com.br.zup.teste;

import java.util.ArrayList;
import java.util.List;

import com.br.zup.modelo.Brasileiro;
import com.br.zup.modelo.Conta;
public class Testepessoa {

	public static void main(String[] args) {
		
		List<Brasileiro> listaPessoas = new ArrayList<Brasileiro>();
		Conta conta = new Conta("0000-0", "Itaú", "8786", 100.000);
		
		Brasileiro br = new Brasileiro("João", "Anastácio", 25, "Português", true, conta);
		
		listaPessoas.add(br);
		
		for (Brasileiro brasileiro : listaPessoas) {
			System.out.println(brasileiro);
		}

	}

}
