package com.robert.rodriguez.pattern.creational.ufo.products;

import com.robert.rodriguez.pattern.creational.ufo.factories.ShipFactory;
import com.robert.rodriguez.pattern.creational.ufo.factories.UFOBossShipFactory;

public class UFOBossShip extends Ship {

  private ShipFactory shipFactory;

  public UFOBossShip() {
    this.shipFactory = new UFOBossShipFactory();
    setName("UFO Boss Ship");
  }

  @Override
  public void makeShip() {
    System.out.println("Making new: " + getName());
    setShipEngine(shipFactory.makeShipEngine());
    setShipWeapon(shipFactory.makeShipGun());
  }
}
