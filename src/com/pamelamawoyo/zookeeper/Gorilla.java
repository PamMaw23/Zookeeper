package com.pamelamawoyo.zookeeper;

//Subclass of mammal

public class Gorilla extends Mammal{
	
	public Gorilla() {	
		super();
	}
	
	public Gorilla throwSomething() {
		int energy = this.getEnergyLevel();
		this.setEnergyLevel(energy-5);
		System.out.println("Gorilla has thrown something. Energy level: " + this.getEnergyLevel());
		return this;
	}
	
	public Gorilla eatBananas() {
		int energy =this.getEnergyLevel();
		this.setEnergyLevel(energy+10);
		System.out.println("Gorilla has had a banana. Energy level: " + this.getEnergyLevel() );	
		return this;
	}
	
	public void climb() {
		int energy =this.getEnergyLevel();
		this.setEnergyLevel(energy-10);
		System.out.println("Gorilla has climbed a tree. Energy level: " + this.getEnergyLevel() );	
	}
	
	public void display() {
		super.displayEnergy();
	}
}
