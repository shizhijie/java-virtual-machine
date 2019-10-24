package com.zjs.bwcx.dlqx.chapert3;

/**
 * 
 * ��ӡgc����ϸ��Ϣ
 * Vm Args: -XX:+PrintGCDetails
 * 
 * @author zjs
 *
 */
public class ReferenceCountingGC {

	public Object instance = null;

	private static final int _1MB = 1024 * 1024;

	/**
	 * �����Ա���Ե�Ψһ�������ռ���ڴ棬�Ա�����GC��־�п�����Ƿ񱻻��չ�
	 */
	@SuppressWarnings("unused")
	private byte[] bigSize = new byte[2 * _1MB];

	public static void testGC() {
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		objA = null;
		objB = null;
		// ���������з���GC,objA��objB�Ƿ��ܱ�����
		System.gc();
	}

	public static void main(String[] args) {
		testGC();
	}
}