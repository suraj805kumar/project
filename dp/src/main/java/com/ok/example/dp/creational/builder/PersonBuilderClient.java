package com.ok.example.dp.creational.builder;

public class PersonBuilderClient {

	public static void main(String[] args) {

		Person p1 = new PersonBuilder().setName("aaa").setId(1001).setAge(23).setCity("Bangalore")
				.setEamil("aaa@gmail.com").setMob(7878787878l).build();
		Person p2 = new PersonBuilder().setName("bbb").setId(1002).build();
		Person p3 = new PersonBuilder().setName("ccc").setId(1003).setMob(89898989l).setCity("Bangalore").build();
		
		System.out.println(p1);// Person [id=1001, name=aaa, city=Bangalore, age=23, eamil=aaa@gmail.com,
								// mob=7878787878]
		System.out.println(p2);// Person [id=1002, name=bbb, city=null, age=0, eamil=null, mob=0]
		System.out.println(p3);// Person [id=1003, name=ccc, city=Bangalore, age=0, eamil=null, mob=89898989]

		p2 = new PersonBuilder(p2).setCity("Maysore").setMob(5885858585l).build();

		System.out.println(p2);// Person [id=1002, name=bbb, city=Maysore, age=0, eamil=null, mob=5885858585]
	}

}
