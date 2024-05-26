package datastructures;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularQueue<E> extends AbstractQueue<E>{

	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private final int MAX;
	private int front;
	private int rear;
	private Object[] circularQueue;
	private int modCount;

	
	public CircularQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	
	public CircularQueue(int size) {
		if(size < 1)
			throw new IllegalArgumentException();
		this.front = this.rear = -1;
		this.modCount = 0;
		this.circularQueue = new Object[size];
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
		if (e == null)
			throw new NullPointerException();
		
		if(isFull())
			throw new IllegalStateException();
		
		else {
			if(modCount == 0)
				front++;
			modCount++;
			rear = (rear + 1) % MAX;
			circularQueue[rear] = e;
			
		}
		return modCount != initialCount;
	}

	
	@Override
	public E dequeue() {
		if (isEmpty())
			throw new NoSuchElementException();
		
		modCount--;
		return cast(circularQueue[front++]);
	}

	
	@Override
	public E peek() {
		return isEmpty() ? null :  cast(circularQueue[front]);
	}
	

	@Override
	public E element() {
		if(isEmpty())
			throw new NoSuchElementException();
		return cast(circularQueue[front]);
	}

	@Override
	public E poll() {
		
		if(isEmpty())
			throw new NoSuchElementException();
		modCount--;
		return cast(circularQueue[front++]);
	}

	@Override
	public E rear() {
		return cast(circularQueue[rear]);
	}

	public int capacity() {
		return MAX;
	}
	
	public void ensureCapacity(int capacity) {
		if(MAX < capacity) 
			circularQueue = Arrays.copyOf(circularQueue, capacity);

	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(circularQueue, modCount);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if(a.length < modCount)
			return cast(Arrays.copyOf(circularQueue, modCount, a.getClass()));
		
		Object[] copy = new Object[a.length];
		int step = front;
		for(int i=front, counter = 0; i<modCount; i = (step++ + 1) % MAX) {
			copy[counter] = circularQueue[i];
			
		}
		return cast(copy);
	}

	public String toString() {
		return "";
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	private static <T> T cast(Object o) {
		return (T) o;
	}
	
}
