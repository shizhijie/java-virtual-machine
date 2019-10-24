package com.zjs.bwcx.dlqx.chapert3;

/**
 * �˴�����ʾ�����㣺 1.��������ڱ�GCʱ�������� 2.�������ȵĻ���ֻ��һ�Σ���Ϊһ�������finalize()�������ֻ�ᱻϵͳ�Զ�����һ��
 * 
 * @author zjs
 */
public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;

	public void isAlive() {
		System.out.println("yes, i am still alive :)");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}

	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();

		// �����һ�γɹ������Լ�
		SAVE_HOOK = null;
		System.gc();
		// ӦΪfinalize�������ȼ��ܵͣ�������ͣ0.5���Եȴ���
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.out.println("no,i am dead :(");
		}

		// ������δ�����������ȫ��ͬ���������ȴ�Ծ�ʧ����
		SAVE_HOOK = null;
		System.gc();
		// ӦΪfinalize�������ȼ��ܵͣ�������ͣ0.5���Եȴ���
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.out.println("no,i am dead :(");
		}
	}
}
