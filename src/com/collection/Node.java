package com.collection;
/**
 * 自定义linkedList
 * @author ning
 *
 */
public class Node {
	Object element;//上一个节点
	Node previous;//下一个节点
	Node next;//元素
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
