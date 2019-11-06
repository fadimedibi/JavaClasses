package com.class9;

public class HourMinuteSecond {

	public static void main(String[] args) {
		//24 hours, 60 minutes,60 second
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {

					if (m < 10) {
						System.out.println(h + ":0" + m + s+ " am");
					} else if (s < 10) {
						System.out.println(h + ":" + m + ":0" + s);
					} else {
						System.out.println(h + ":" + m + ":" + s);
					}
				}
			}
		}
	}

}
