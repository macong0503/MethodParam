package com.fs.test;

public class MethodParam {
	//ֵ����
	//�����Ĳ���Ϊ�������������ǣ����ݵ���ֵ�ĸ�����ֵ�������������в���ı�ԭʵ�ε�ֵ
	public void swap(int a,int b){//a,b������Ϊ�β�
		int temp = a;
		a=b;
		b=temp;
		System.out.println("swap�����н������ݺ�a="+a+",b="+b);
	}
	//��ַ����
	//�������Ĳ�������������ʱ�����ݵ��Ƕ���ĵ�ַ
	int x=100,y=200;
	public void swap2(MethodParam m){
		int temp = m.x;
		m.x=m.y;
		m.y=temp;
		System.out.println("swap2�����н������ݺ�x="+m.x+",y="+m.y);
	}

	public static void main(String[] args) {
		//ֵ����
		MethodParam mp = new MethodParam();
	    int m=10,n=20;
		mp.swap(m, n);//m,n��Ϊʵ��
		System.out.println("������ɺ�m="+m+",n="+n);
		
		//��ַ����
		MethodParam mp1 = new MethodParam();//���ڵ���swap2�����Ķ���
		MethodParam mParam = new MethodParam();//���ڴ���ʱʹ��
		mp.swap2(mParam);
		System.out.println("������ɺ�x="+mParam.x+",y="+mParam.y);
	

	}

}
