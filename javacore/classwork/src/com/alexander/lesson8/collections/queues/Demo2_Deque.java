package com.alexander.lesson8.collections.queues;

public class Demo2_Deque {

	int size;
	int head;
	int tail;
	int[] data;

	Demo2_Deque(int size) {
		data = new int[this.size = size];
	}

	void pushBack(int value) {
		if (++tail == size)
			tail = 0;
		data[tail] = value;
	}

	int popBack() {
		int ret = data[tail];
		if (--tail < 0)
			tail = size - 1;
		return ret;
	}

	void pushFront(int value) {
		data[head] = value;
		if (--head < 0)
			head = size - 1;
	}

	int popFront() {
		if (++head == size)
			head = 0;
		return data[head];
	}

	boolean isEmpty() {
		return head == tail;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2_Deque demo1_Queue = new Demo2_Deque(5);
		demo1_Queue.pushFront(1);
		demo1_Queue.pushFront(2);
		demo1_Queue.pushFront(3);
		demo1_Queue.pushFront(4);
		demo1_Queue.pushFront(5);
		demo1_Queue.pushFront(6);
		System.out.println(demo1_Queue.data);
		
		
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		System.out.println(demo1_Queue.popFront());
		//System.out.println(demo1_Queue.isEmpty());

	}


}
