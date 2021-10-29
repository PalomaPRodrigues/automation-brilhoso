package util;

import java.util.Random;

public enum Generators {

	RG {
	protected String attribute() {
	String rg = "";
	for(int sum = 0; sum < 9; sum++){
		rg += String.valueOf(random.nextInt(10));
	}
	return (rg.substring(0, 2) + "." + rg.substring(2, 5) + "-" + rg.substring(5, 8) + rg.substring(8)).trim();
  }
	},




    CPF {
	protected String attribute() {
	String cpf = "";
	for(int sum = 0; sum < 11; sum++){
		cpf += String.valueOf(random.nextInt(12));
	}
	return (cpf.substring(0, 2) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) +  "-" + cpf.substring(8,10) + cpf.substring(10)).trim();
  }
	};

	public final String get() {
		return attribute();
	}

	private static Random random = new Random();

	protected abstract String attribute();
}
