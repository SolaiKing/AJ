package org.univ;

public class College extends University {
	
	@Override
	public void ug() {
	 System.out.println("ug");
	}
	@Override
	public void pg() {
		System.out.println("pg");
	}
	
    public static void main(String[] args) {
		College a=new College();
		a.ug();
		a.pg();
	}

}
