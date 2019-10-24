package com.zjs.bwcx.dlqx.chapert2;

import java.util.ArrayList;

/**
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 
 * @author zjs
 */
public class HeapOOM {
	static class OOMObject {

	}

	public static void main(String[] args) {
		ArrayList<OOMObject> list = new ArrayList<OOMObject>();
		while (true) {
			list.add(new OOMObject());
		}
	}
}
