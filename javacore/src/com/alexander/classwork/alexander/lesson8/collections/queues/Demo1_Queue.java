package com.alexander.classwork.alexander.lesson8.collections.queues;

public class Demo1_Queue {

	int size;
	int head; // ������
	int tail; // �����
	int[] data;

	Demo1_Queue(int size) {
		data = new int[this.size = size];
	}

	void add(int value) {
		if (++tail == size)
			tail = 0;
		data[tail] = value;
	}

	int extract() {
		if (++head == size)
			head = 0;
		return data[head];
	}

	//if size of queue == 5 then isEmpty true
	boolean isEmpty() {
		return head == tail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_Queue demo1_Queue = new Demo1_Queue(5);
		demo1_Queue.add(1);
		demo1_Queue.add(2);
		demo1_Queue.add(3);
		demo1_Queue.add(4);
		demo1_Queue.add(5);
		demo1_Queue.add(6);
		
		System.out.println(demo1_Queue.extract());
		System.out.println(demo1_Queue.isEmpty());
		
		for (int i = 0; i<demo1_Queue.data.length; i++){
			System.out.println(demo1_Queue.data[i]);
		}	
		
	
		
	}

}
