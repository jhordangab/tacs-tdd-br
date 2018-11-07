package br.ufg.inf.tacs.pratica.tdd;

import junit.framework.TestCase;

public class TestRomano extends TestCase {
	
	public void testTrueEntry() {
		String romanoReferente1 = "I";
		assertEquals(Romano.toNumber(romanoReferente1), 1);
		
		String romanoReferente73 = "LXXIII";
		assertEquals(Romano.toNumber(romanoReferente73), 73);

		String romanoReferente1200 = "MCC";
		assertEquals(Romano.toNumber(romanoReferente1200), 1200);
		
		String romanoReferente4999 = "MMMMCMXCIX";
		assertEquals(Romano.toNumber(romanoReferente4999), 4999);
    }
	
	public void testFalseEntry() {
		String romanoReferente1 = "I";
		assertEquals(Romano.toNumber(romanoReferente1) == 23, false);
		
		String romanoReferente73 = "LXXIII";
		assertEquals(Romano.toNumber(romanoReferente73)== 192, false);

		String romanoReferente1200 = "MCC";
		assertEquals(Romano.toNumber(romanoReferente1200) == 49, false);
		
		String romanoReferente4999 = "MMMMCMXCIX";
		assertEquals(Romano.toNumber(romanoReferente4999) == 5288, false);
    }
	
	public void testEntryError() {
		assertEquals(Romano.toNumber("OP"), 0);
		assertEquals(Romano.toNumber("TPA"), 0);
		assertEquals(Romano.toNumber("JAS"), 0);
    }
}
