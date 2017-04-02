public class LLDeque<T> implements Deque<T> {

    private int _size;
    private DLLNode<T> _front, _end;
    
    public LLDeque() {
	_size = 0;
	_front = null;
	_end = null;
    }

    public boolean isEmpty() {
	return _size == 0;
    }

    public int size() {
	return _size;
    }

    public void addFront(T obj) {
	if (isEmpty()) {
	    DLLNode<T> l = new DLLNode<T>(obj, null, null);
	    _front = l;
	    _end = l;
	} else {
	    _front = new DLLNode<T>(obj, null, _front);
	}
	_size++;
    }

    public T removeFront() {
	T ret = _front.getValue();
	_front = _front.getNext();
	_size--;
	if (isEmpty())
	    _end = null;
	else
	    _front.setPrev(null);
	return ret;
    }

    public T peekFront() {
	return _front.getValue();
    }
    
    public void addLast(T obj) {
	if (isEmpty()) {
	    DLLNode<T> l = new DLLNode<T>(obj, null, null);
	    _front = l;
	    _end = l;
	} else {
	    _end.setNext(new DLLNode<T>(obj, _end, null));
	    _end = _end.getNext();
	}
	_size++;
    }

    public T removeLast() {
	T ret = _end.getValue();
	_end = _end.getPrev();
	_size--;
	if (isEmpty())
	    _front = null;
	else
	    _end.setNext(null);
	return ret;
    }

    public T peekLast() {
	return _end.getValue();
    }

    public String toString() {
	String ret = "FRONT-->";
	DLLNode<T> curr = _front;
	while (curr != null) {
	    ret += curr.getValue() + "-->";
	    curr = curr.getNext();
	}
	ret += "END";
	return ret;
    }

    public static void main(String args[]) {
	LLDeque<String> deque = new LLDeque<String>();
	System.out.println("Starts as: " + deque);
	deque.addFront("bip");
	deque.addLast("bop");
	deque.addFront("bam");
	System.out.println("Now it's: " + deque);
	System.out.println(deque.removeLast());
	System.out.println("Removed one: " + deque);
	System.out.println(deque.removeFront());
	System.out.println("Removed one: " + deque);
    }
    
}
