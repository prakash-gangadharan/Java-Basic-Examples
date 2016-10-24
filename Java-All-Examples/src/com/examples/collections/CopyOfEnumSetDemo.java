package com.examples.collections;

import java.util.*;

enum Season {
	WINTER, SPRING, SUMMER, FALL
}

public class CopyOfEnumSetDemo {

	public static void main(String args[]) {

		EnumSet<Season> seas = EnumSet.of(Season.SPRING, Season.SUMMER,
				Season.WINTER);

		System.out.println(seas);

	}
}
