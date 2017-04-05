package BalancedParamthesis;

import java.util.Arrays;
import java.util.Scanner;

public class StackDemo {
	char str[];
	int top, cp;
	
	public StackDemo(int cp) {
		str = new char[cp];
	}

	public void push(char s1) {
		str[top] = s1;
		top++;
	}

	public char pop() {
		char last = str[top];
		top--;
		return last;
	}

	public int size(){
		return top;
	}
	
	public boolean isEmpty(){
		return top == 0;
	}
	
	public String toString() {
		return "StackDemo [str=" + Arrays.toString(str) + "]";
	}
	
}