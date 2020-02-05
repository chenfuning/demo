package com.collection;

public class test_LinkedList {
	private Node first;
	private Node last;
	private int size;
	
	public void add(Object obj) {
		Node node=new Node(obj);
		//如果是第一次添加元素
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
	//待续
	//get
	//remove
	//插入节点
	//--加入泛型
}
