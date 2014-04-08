package com.javabasico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		Runner r = new Runner();
		r.run(populateArray(arrayList));
		r.run(populateLinked(linkedList));
		r.run(iterateArray(arrayList));
		r.run(iterateLinked(linkedList));
		r.run(indexAccessArray(arrayList));
		r.run(indexAccessLinked(linkedList));
		r.run(indexInsertArray(arrayList));
		r.run(indexInsertLinked(linkedList));
	}
	
	private static Operation populateArray(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				for (int i = 1; i < 999999; i++) {
					list.add(i);
				}
			}

			@Override
			public String getDescricao() {
				return "Popular ArrayList";
			}
		};
	}
	
	private static Operation populateLinked(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				for (int i = 1; i < 999999; i++) {
					list.add(i);
				}
			}

			@Override
			public String getDescricao() {
				return "Popular LinkedList";
			}
		};
	}
	
	private static Operation iterateArray(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				for (Integer i: list) {
					//System.out.println(i);
				}
			}

			@Override
			public String getDescricao() {
				return "Iterar ArrayList";
			}
		};
	}
	
	private static Operation iterateLinked(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				for (Integer i: list) {
					//System.out.println(i);
				}
			}

			@Override
			public String getDescricao() {
				return "Iterar Linked";
			}
		};
	}
	
	private static Operation indexAccessArray(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				list.get(900000);
			}

			@Override
			public String getDescricao() {
				return "Acesso indexado ArrayList";
			}
		};
	}
	
	private static Operation indexAccessLinked(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				list.get(900000);
			}

			@Override
			public String getDescricao() {
				return "Acesso indexado LinkedList";
			}
		};
	}
	
	private static Operation indexInsertArray(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				list.add(555555, 10);
			}

			@Override
			public String getDescricao() {
				return "Insersao indexada no ArrayList";
			}
		};
	}
	
	private static Operation indexInsertLinked(final List<Integer> list) {
		return new Operation() {
			@Override
			public void execute() {
				list.add(555555, 10);
			}

			@Override
			public String getDescricao() {
				return "Insersao indexada no LinkedList";
			}
		};
	}
}
