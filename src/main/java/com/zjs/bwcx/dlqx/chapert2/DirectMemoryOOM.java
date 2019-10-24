package com.zjs.bwcx.dlqx.chapert2;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 *
 * Vm Args:-Xmx20M -XX:MaxDirectMemorySize=10M
 * 
 * @author zjs
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe;
		try {
			unsafe = (Unsafe) unsafeField.get(null);
			while (true) {
				unsafe.allocateMemory(_1MB);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
