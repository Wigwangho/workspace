package com.week41;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class practice3 {
	public static List<String> reverse(List<String> list) {
	    Collections.reverse(list);
	    return list;
	}

	public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    list.add("1");
	    list.add("2");
	    list.add("3");

	    List<String> reversedList = reverse(list);
	    for (String str : reversedList) {
	        System.out.print(str + ", ");
	    }
	}
}