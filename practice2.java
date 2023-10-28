package com.week41;

import java.util.Collection;
import java.util.LinkedList;

public class practice2 {
public static Collection get() {
Collection sorted = new LinkedList();
sorted.add("B"); sorted.add("C"); sorted.add("A");
return sorted;
}
//sorted = "B" , "C", "A"
//List 이므로 순서가 존재한다

public static void main(String[] args) {
for (Object obj: get()) {
System.out.print(obj + ",");
}
}
}
/*What is the result?
A. A, B, C,
B. B, C, A,
C. Compilation fails.
D. The code runs with no output.
E. An exception is thrown at runtime.*/
