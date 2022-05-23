package org.bike;

public class Bike implements Ktm {
public void cost() {
	// TODO Auto-generated method stub
System.out.println("cost :90000");
}public void speed() {
	// TODO Auto-generated method stub
System.out.println("60km per hr");
}public static void main(String[] args) {
	Bike b=new Bike();
	b.cost();
	b.speed();
}
}
