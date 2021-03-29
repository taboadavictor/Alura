package Módulo_6;

import Java_Lang_Revisao.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int [] idades = new int[5];
		ContaCorrente [] contas = new ContaCorrente [5];
		
		ContaCorrente cc1 = new ContaCorrente();
		contas [0]= cc1;
		
		ContaCorrente cc2 = new ContaCorrente();
		contas [1] = cc2;
		
		System.out.println(cc1);
		
		ContaCorrente ref = cc1;
		
		System.out.println(ref);
	}

}
