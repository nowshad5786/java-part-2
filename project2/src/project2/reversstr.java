package project2;
import java.lang.*;
import java.io.*;
import java.util.*;

public class reversstr {
	public static void main(String args[])
	{
		String input = "Hello World";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
	}

}
