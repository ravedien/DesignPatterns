package com.designpattern;

public class PlayerTester {
	public static void main(String[] args) {
		ShootingBehaviour arc = new ArcShot();
		Curry curry = new Curry(arc);
		curry.doShooting();
	}
}
