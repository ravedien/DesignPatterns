package com.designpattern.sample.command1;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Command> commandList = new ArrayList<Command>();

	public void takeOrder(Command command) {
		commandList.add(command);
	}

	public void placeOrders() {

		for (Command command : commandList) {
			command.execute();
		}
		commandList.clear();
	}
}
