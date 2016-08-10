package com.designpattern.sample.strategy1;

import java.util.ArrayList;

public class CompressionContext {
	private CompressionStrategy compressionStrategy;
	
	public void setCompressionStrategy(CompressionStrategy compressionStrategy){
		this.compressionStrategy = compressionStrategy;
	}
	
	public void createArchive(ArrayList files){
		this.compressionStrategy.compressFiles(files);
	}
}
