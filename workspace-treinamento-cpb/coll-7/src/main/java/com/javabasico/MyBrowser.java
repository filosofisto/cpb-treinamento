package com.javabasico;

import java.util.Stack;

public class MyBrowser {

	private Stack<Page> pages;
	
	public MyBrowser() {
		pages = new Stack<Page>();
	}
	
	public void go(Page page) {
		pages.push(page);
	}
	
	public Page currentPage() {
		return pages.peek();
	}
	
	public Page back() {
		return pages.pop();
	}
}
