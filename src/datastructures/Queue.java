package datastructures;

import java.util.NoSuchElementException;

public interface Queue<E> {
	
	/**
	 * @return number of elements in this collection
	 */
	int size();
	
	
	/**
	 * @return {@code true} if no elements are present in this collection
	 */
	boolean isEmpty();
	
	/**
	 * @return {@code true} if this collection is full
	 */
	boolean isFull();
	
	
	/**
	 * removes all the elements from this collection
	 */
	void clear();
	
	
	/**
	 * @param element to add in this collection
	 * @return
	 */
	boolean enqueue(E element);
	
	
	/**
	 * removes head of this collection if present. If queue is empty then it
	 * throws exception
	 * @return removed element
	 * @throws NoSuchElementException if this collection is empty
	 */
	E dequeue();
	
	
	/**
	 * Retrieves the head of this collection but does not remove
	 * @return head element of this collection or returns null if this collection
	 * is empty.
	 */
	E peek();
	
	
	/**
	 * Retrieves, but does not remove, the head of this queue.
	 * @return the head of this queue
	 * @throws NoSuchElementException if this queue is empty
	 */
	E element();
	
	
	/**
	 * Retrieves and removes the head of this queue, or returns {@code null} 
	 * if this queue is empty.
     * @return the head of this queue, or {@code null} if this queue is empty
	 */
	E poll();
	
	/**
	 * Retrieves the tail of this collection but does not remove
	 * @return head element of this collection or returns null if this collection
	 * is empty.
	 */
	E rear();
	
	public void ensureCapacity(int capacity);
	
	Object[] toArray();
	
	<T> T[] toArray(T[] a);
}








