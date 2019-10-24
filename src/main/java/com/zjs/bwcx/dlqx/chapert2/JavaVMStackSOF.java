package com.zjs.bwcx.dlqx.chapert2;

/**
 * VM Args: -Xss128k
 * 
 * @author zjs
 */
public class JavaVMStackSOF {
	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:" + oom.stackLength);
			e.printStackTrace();
		}
	}
}
