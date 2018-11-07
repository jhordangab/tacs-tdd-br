package br.ufg.inf.tacs.pratica.tdd;

import java.util.Map;
import java.util.TreeMap;

public class Romano {

	private final static TreeMap<Integer, String> romanMap = new TreeMap<Integer, String>();

    static {
    	romanMap.put(1000, "M");
    	romanMap.put(900, "CM");
    	romanMap.put(500, "D");
    	romanMap.put(400, "CD");
    	romanMap.put(100, "C");
    	romanMap.put(90, "XC");
    	romanMap.put(50, "L");
    	romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }

    public static int toNumber(String romanValue) {
    	
    	int number = 0;
    	
    	for (Map.Entry<Integer,String> entry : romanMap.descendingMap().entrySet()) {
    		String value = entry.getValue();
    	
    		if(romanValue.startsWith(value)) {
    			int currentNumber = entry.getKey();
    			number = currentNumber + toNumber(romanValue.substring(value.length()));
    			break;
    		}
    	}

		return number;
    }
}
