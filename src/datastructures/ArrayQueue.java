package datastructures;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Queue is FIFO structure which uses array. It has initial capacity of 
 * 10. Either we can declare the capacity while initialising the object
 * else it will be set as 10. Basic properties of queue's are: 
 * it doesn't accept null values, it can contain duplicate values.
 * 
 * 
 * @param <E> The type of element held in this queue
 */
public class ArrayQueue<E> extends AbstractQueue<E>{
	
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private int MAX;
	private int front;
	private int rear;
	private Object[] arrayQueue;
	private int modCount;
	
	
	public ArrayQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	public ArrayQueue(int size) {
		if(size < 1)
			throw new IllegalArgumentException();
		this.front  = this.rear = -1;
		this.modCount = 0;
		this.arrayQueue = new Object[size];
		this.MAX = size;
	}
	

	@Override
	public int size() {
		return modCount;
	}



	@Override
	public boolean isFull() {
		return (size() == MAX);
	}

	@Override
	public boolean enqueue(E e) {
		int initialCount = modCount;
		if(e == null)
			throw new NullPointerException();

		if(isFull())
			throw new IllegalStateException();
		
		else {
			if(modCount == 0)
				front++;
			arrayQueue[++rear] = e;
			modCount++;
		}
		
		return modCount != initialCount;
	}

	@Override
	public E dequeue() {
		if(isEmpty())
			throw new NoSuchElementException();
		modCount--;
		return cast(arrayQueue[front++]);	
	}

	@Override
	public E peek() {
		return isEmpty() ? null :  cast(arrayQueue[front]);
	}

	@Override
	public E element() {
		if(isEmpty())
			throw new NoSuchElementException();
		return cast(arrayQueue[front]);
	}

	@Override
	public E poll() {
		if(isEmpty())
			return null;

		modCount--;
		return cast(arrayQueue[front++]);
	}

	@Override
	public E rear() {
		return cast(arrayQueue[rear]);
	}

	@Override
	public Object[] toArray() {	
		return Arrays.copyOf(arrayQueue, modCount);
	}
	
	public <T> T[] toArray(T[] a) {
		if(a.length < modCount)
			return cast(Arrays.copyOf(arrayQueue, modCount));
		System.arraycopy(arrayQueue, front, a, 0, modCount);
		return a;
	}
	
	public int capacity() {
		return MAX;
	}
	
	public void ensureCapacity(int capacity) {
		if(MAX < capacity) {
			arrayQueue = Arrays.copyOf(arrayQueue, capacity);
			MAX = capacity;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	private static <T> T cast(Object o) {
		return (T) o;
	}
	
	public String toString() {
		if(isEmpty())
			return "Queue is Empty";
		StringBuilder sb = new StringBuilder("[");
		for(int i=front; i<=rear; i++) {
			sb.append(arrayQueue[i]);
			if(i != rear)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

	
}




/*
The problem with queue is that suppose the front is at index 2 and rear at index 4
where the size of array is 5. It means that total size of array is 5 and only 3 elements
are present in the queue. But still, the queue will appear as full because rear is pointing
at the end of the array. To overcome this problem circular queue was introduces.
*/