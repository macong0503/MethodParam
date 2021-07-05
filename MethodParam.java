package com.fs.test;

public class MethodParam {
	//值传递
	//方法的参数为基本数据类型是，传递的是值的副本（值拷贝），方法中不会改变原实参的值
	public void swap(int a,int b){//a,b变量称为形参
		int temp = a;
		a=b;
		b=temp;
		System.out.println("swap方法中交换数据后：a="+a+",b="+b);
	}
	//地址传递
	//当方法的参数是引用类型时，传递的是对象的地址
	int x=100,y=200;
	public void swap2(MethodParam m){
		int temp = m.x;
		m.x=m.y;
		m.y=temp;
		System.out.println("swap2方法中交换数据后：x="+m.x+",y="+m.y);
	}

	public static void main(String[] args) {
		//值传递
		MethodParam mp = new MethodParam();
	    int m=10,n=20;
		mp.swap(m, n);//m,n成为实参
		System.out.println("交换完成后：m="+m+",n="+n);
		
		//地址传递
		MethodParam mp1 = new MethodParam();//用于调用swap2方法的对象
		MethodParam mParam = new MethodParam();//用于传参时使用
		mp.swap2(mParam);
		System.out.println("交换完成后：x="+mParam.x+",y="+mParam.y);
	

	}

}
