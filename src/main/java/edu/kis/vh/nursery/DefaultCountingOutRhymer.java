package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class DefaultCountingOutRhymer {

	private IntStorageInterface intStorageInterface;
	
	public DefaultCountingOutRhymer() {
		intStorageInterface = new IntLinkedList();
	}
	
	public DefaultCountingOutRhymer(IntStorageInterface intStorageInterface) {
		this.intStorageInterface = intStorageInterface;
	}
	
	public int peekaboo() {
        return intStorageInterface.peekaboo();
    }
	

	public void countIn(int in) {
		intStorageInterface.push(in);
	}

	public boolean callCheck() {
		return intStorageInterface.isEmpty();
	}

	public boolean isFull() {
		return intStorageInterface.isFull();
	}

	public int countOut() {
		return intStorageInterface.pop();
	}

	
	


}
