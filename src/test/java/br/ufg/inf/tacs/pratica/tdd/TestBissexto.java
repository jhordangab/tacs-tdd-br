package br.ufg.inf.tacs.pratica.tdd;

import junit.framework.TestCase;

public class TestBissexto extends TestCase {

	public void testFalseBissexto100Em100() {
		for(int anoNao = 100; anoNao < 3000; anoNao++) {
			if(anoNao % 400 != 0) {
		        assertEquals(Bissexto.isBissexto(anoNao), false);
			}
			anoNao = anoNao + 99;
		}
    }
	
	public void testTrueBissexto100Em100() {
		for(int anoSim = 100; anoSim < 3000; anoSim++) {
			if(anoSim % 400 == 0) {
		        assertEquals(Bissexto.isBissexto(anoSim), true);
			}
			anoSim = anoSim + 99;
		}
    }
	
	public void testFalseBissexto4Em4() {
		for(int anoSim = 2000; anoSim < 2400; anoSim++) {
			if(anoSim % 4 != 0) {
		        assertEquals(Bissexto.isBissexto(anoSim), false);
			}
		}
    }
	
	public void testTrueBissexto4Em4() {
		for(int anoSim = 2000; anoSim < 2400; anoSim++) {
			if(anoSim % 4 == 0 && anoSim % 100 != 0) {
		        assertEquals(Bissexto.isBissexto(anoSim), true);
			}
		}
    }
}
