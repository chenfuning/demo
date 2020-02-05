package com.collection;
/**
 * 泛型测试类
 * @author ning
 *
 */
public class testGeneric {

	public static void main(String[] args) {
		MyCollectionhaveGeneric<String> mc=new MyCollectionhaveGeneric<>();
		//可以加入各种类型的元素
		mc.set("猪肉", 0);
		//mc.set(8888, 1);
		Integer a=(Integer)mc.get(1);
		String b=(String)mc.get(0);
	}
}
/**
 * 自定义没有泛型的容器类
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
 * 自定义有泛型的容器类
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