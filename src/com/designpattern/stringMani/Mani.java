package com.designpattern.stringMani;

public class Mani {
	public static void main(String[] args) {
		String[] arr = {"bat","cat","rat"};
		String s = "battery";
		String sCopy = new String(s);
		
		String [][] multi = new String[arr.length][2];
		int multiCnt = 0;
		for(String arrString : arr){
			while(true){
				int cnt = 0;
				if(arrString.contains(sCopy.charAt(cnt)+"")){
					multi[multiCnt][0] = arrString;
					multi[multiCnt][1] = s.substring(0, s.indexOf(sCopy.charAt(cnt+1))).toUpperCase()+s.substring(s.indexOf(sCopy.charAt(cnt+1)));
					sCopy = sCopy.replaceAll(sCopy.charAt(cnt)+"", "");
					multiCnt++;
					break;
				}else{
					cnt++;
				}
			}
		}
	}
}
