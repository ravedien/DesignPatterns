package com.designpattern.sample.strategy1;

import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy{

	@Override
	public void compressFiles(ArrayList files) {
		System.out.println("compress to zip");
	}

}
