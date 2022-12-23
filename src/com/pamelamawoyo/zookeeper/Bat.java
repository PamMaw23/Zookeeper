package com.pamelamawoyo.zookeeper;

public class Bat extends Mammal {
	
	//Subclass of mammal
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	public Bat fly() {
		int energy = this.getEnergyLevel();
		this.setEnergyLevel(energy-50);
		System.out.println("Sound - Swoosh (bat is taking off). Energy level: " + this.getEnergyLevel());
		return this;
	}
	
	public Bat eatHumans() {
		int energy =this.getEnergyLevel();
		this.setEnergyLevel(energy+25);
		System.out.println("Energy level: " + this.getEnergyLevel() );	
		return this;
	}
	
	public Bat attackTowns() {
		int energy =this.getEnergyLevel();
		this.setEnergyLevel(energy-100);
		System.out.println("Sound - town on fire!. Energy level: " + this.getEnergyLevel() );	
		return this;
	}
	
}
