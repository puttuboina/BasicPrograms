package org.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringDATE {
	public static void main(String[] args) {
		Date d = Calendar.getInstance().getTime();
		DateFormat a = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		String s = a.format(d);
		System.out.println(s);

	}

}
