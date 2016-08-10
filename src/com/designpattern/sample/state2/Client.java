package com.designpattern.sample.state2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		CeilingFanPullContext ctx = new CeilingFanPullContext();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            ctx.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
          ;
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }

}
