package com.examples.stringbuffer;


class StringTest
{
public static void main(String[] args)
{
String originalString = "This is my is car";
String replacedString = replaceMethod(originalString, " is", "was");
System.out.println(replacedString);
}
static String replaceMethod(String original, String toReplace,
String replacedWith) {
for(;;) {
int i = original.indexOf(toReplace);
if (i == -1) {
break;
}
original = original.substring(0, i+1) + replacedWith + original.substring(i + toReplace.length()); 
}
return original;
}
}