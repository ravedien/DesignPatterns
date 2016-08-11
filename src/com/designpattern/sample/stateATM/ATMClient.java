package com.designpattern.sample.stateATM;

public class ATMClient {
	public static void main(String[] args) {
		ATMMachineContext atmMachine = new ATMMachineContext();

		atmMachine.insertCard();

		atmMachine.ejectCard();

		atmMachine.insertCard();

		atmMachine.insertPin(1234);

		atmMachine.requestCash(2000);

		atmMachine.insertCard();

		atmMachine.insertPin(1234);
	}
}
