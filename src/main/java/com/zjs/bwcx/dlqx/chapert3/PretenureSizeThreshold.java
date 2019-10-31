package com.zjs.bwcx.dlqx.chapert3;

/**
 * 
 * VM²ÎÊý£º-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
 * 
 * 
 * @author zjs
 *
 */
public class PretenureSizeThreshold {

	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}

	private static void testPretenureSizeThreshold() {
		@SuppressWarnings("unused")
		byte[] allocation;
		allocation = new byte[4 * _1MB];
	}

}
