package com.collection;

public class test_LinkedList {
	private Node first;
	private Node last;
	private int size;
	
	public void add(Object obj) {
		Node node=new Node(obj);
		//����ǵ�һ�����Ԫ��
		if(first==null) {
			
			first=node;
			last=node;
		}else {
			node.previous=last;
			node.next=null;
			
			last.next=node;
			last=node;
		}
	}
	//����
	//get
	//remove
	//����ڵ�
	//--���뷺��
}
