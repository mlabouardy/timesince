package com.labouardy;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Timesince t=Timesince.getInstance();
		Date d1=new Date();
		System.out.println(t.calculateSince(d1));
	}
}
