package curso.javabasico.tiger;

public class ListaEncadeada<T> {

	private Wrapper<T> first;
	private Wrapper<T> last;
	
	public void add(T object) {
		Wrapper<T> newLast = new Wrapper<T>(object);
		
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
		
		Wrapper<T> actual = first;
		while (actual != null) {
			buf.append(actual.toString() + ", ");
			actual = actual.getNext();
		}
		
		return buf.toString();
	}
}

class Wrapper<T> {
	
	private Wrapper<T> next;
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public Wrapper<T> getNext() {
		return next;
	}

	public void setNext(Wrapper<T> next) {
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
