package com.zjs.bwcx.dlqx.chapert2;

/**
 * 
 * @author zjs
 *
 */
public class RuntimeConstantPoolOOM_intern {
	public static void main(String[] args) {
		//jdk1.6 �� false false
		//jdk1.7�� true false
		String str1 = new StringBuilder("�����").append("���").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}
}
