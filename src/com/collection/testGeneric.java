package com.collection;
/**
 * ���Ͳ�����
 * @author ning
 *
 */
public class testGeneric {

	public static void main(String[] args) {
		MyCollectionhaveGeneric<String> mc=new MyCollectionhaveGeneric<>();
		//���Լ���������͵�Ԫ��
		mc.set("����", 0);
		//mc.set(8888, 1);
		Integer a=(Integer)mc.get(1);
		String b=(String)mc.get(0);
	}
}
/**
 * �Զ���û�з��͵�������
 */
class MyCollection{
	Object[] objs=new Object[5];
	public void set(Object obj,int index) {
		objs[index]=obj;
	}
	public Object get(int index) {
		return objs[index];
	}
}
/**
 * �Զ����з��͵�������
 */
class MyCollectionhaveGeneric<E>{
	Object[] objs=new Object[5];
	public void set(E e,int index) {
		objs[index]=e;
	}
	public Object get(int index) {
		return (E)objs[index];
	}
}