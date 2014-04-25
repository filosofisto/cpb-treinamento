package curso.javabasico.tiger;

public class ListaEncadeada<T> {

	private Node<T> first;
	private Node<T> last;
	
	public void add(T object) {
		Node<T> newLast = new Node<T>(object);
		
		if (first == null) {
			first = newLast;
			last = newLast;
		} else {
			last.setNext(newLast);
			last = newLast;
		}
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		Node<T> actual = first;
		while (actual != null) {
			buf.append(actual.toString() + ", ");
			actual = actual.getNext();
		}
		
		return buf.toString();
	}
}

class Node<T> {
	
	private Node<T> next;
	private T data;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public String toString() {
		if (getData() != null) {
			return getData().toString();
		} else {
			return "null";
		}
	}
}
