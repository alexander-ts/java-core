package com.alexander.classwork.alexander.lesson8.collections.list;

public class LinkedList_1 {

	private Node head; // ��������� �� ������ �������
	private Node tail; // ��������� ��������� �������

	void addFront(int data) // �������� �������
	{
		Node a = new Node(); // ������ ����� �������
		a.data = data; 		
							// ��������� �� ��������� ������� �������������
							// ���������������� ��� null
		if (head == null) 		// ���� ������ ����
		{ 					// �� ��������� ������ ������ � ����� �� ����� �������
			head = a; 	
			tail = a;
		} else {
			a.next = head; 
			head = a; 	// � ��������� �� ������ ������� ������ ��������� �� �����
						// �������
		}
	}

	void addBack(int data) { // ���������� � ����� ������
		Node a = new Node(); // ������ ����� �������
		a.data = data;
		if (tail == null) 
		{ 			
			head = a; 		//  ������ ������ ������� �� ������ ��������
			tail = a;
		} else {
			tail.next = a; 	// �����  ��������� ������� ������ ��������� �� �����
			tail = a; 		// � � ��������� �� ��������� ������� ���������� �����
							// ������ ��������
		}
	}

	void printList() 
	{
		Node t = head; // �������� ������ �� ������ �������
		while (t != null) // ���� ������� ���������
		{
			System.out.print(t.data + " "); 
			t = t.next; 
		}
	}

	void delEl(int data) 
	{
		if (head == null) 
			return; 

		if (head == tail) { // ���� ������ ������� �� ������ �������� - ������� ��������� ������ � �����
			head = null; 
			tail = null;
			return; 
		}

		if (head.data == data) { // ���� ������ ������� - ���, ��� ��� �����
			head = head.next; 	// ����������� ��������� ������ �� ������ �������
			return; 
		}

		Node t = head; // ����� �������� ������
		while (t.next != null) { // ���� ��������� ������� ����������
			if (t.next.data == data) { // ��������� ��������� �������
				if (tail == t.next) // ���� �� ���������
				{
					tail = t; 
				}
				t.next = t.next.next; // ��������� ������� �������
				return;
			}
			t = t.next; 
		}
	}
}
