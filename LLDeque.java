public class LLDeque<T> implements Deque {

    private int _size;
    private DLLNode _front, _end;
    
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
	    DLLNode l = new DLLNode(obj, null, null);
	    _front = l;
	    _end = l;
	} else {
	    _front = new DDLLNode(obj, null, _front);
	}
	_size++;
    }

    public T removeFront() {
	T ret = _front.getValue();
	_front = _front.getNext();
	_front.setPrev(null);
	if (isEmpty())
	    _end = null;
	_size--;
	return ret;
    }

    public T peekFront() {
	return _front.getValue();
    }
    
    public void addLast(T obj) {
	if (isEmpty()) {
	    DLLNode l = new DLLNode(obj, null, null);
	    _front = l;
	    _end = l;
	} else {
	    _end.setNext(new DLLNode(obj, null));
	    _end = _end.getNext();
	}
	_size++;
    }

    public T removeLast() {
	return null;
    }

    public T peekLast() {
	return null;
    }
    
}
