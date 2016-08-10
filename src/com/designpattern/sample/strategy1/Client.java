package com.designpattern.sample.strategy1;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		CompressionContext ctx =  new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		ctx.createArchive(new ArrayList<>());
		
		ctx.setCompressionStrategy(new RarCompressionStrategy());
		ctx.createArchive(new ArrayList<>());
	}
}
