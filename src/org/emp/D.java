package org.emp;

public class D implements A, B, C{
  
	public void m4() {
		System.out.println("Class Method1");
	}
	@Override
	public void m3() {
		System.out.println("Interface Method3");
	}

	@Override
	public void m2() {
		System.out.println("Interface Method2");	
	}

	@Override
	public void m1() {
		System.out.println("Interface Method1");
	}

}
