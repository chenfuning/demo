package com.collection;
/**
 * �Զ���linkedList
 * @author ning
 *
 */
public class Node {
	Object element;//��һ���ڵ�
	Node previous;//��һ���ڵ�
	Node next;//Ԫ��
	public Node(Node previous,Node next,Object element) {
		super();
		this.previous=previous;
		this.next=next;
		this.element=element;
	}
	public Node(Object element) {
		super();
		this.element=element;
	}
}
