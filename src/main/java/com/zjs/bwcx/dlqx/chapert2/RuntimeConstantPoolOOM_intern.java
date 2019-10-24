package com.zjs.bwcx.dlqx.chapert2;

/**
 * 
 * @author zjs
 *
 */
public class RuntimeConstantPoolOOM_intern {
	public static void main(String[] args) {
		//jdk1.6 中 false false
		//jdk1.7中 true false
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}
}
