package com.robert.rodriguez.pattern.creational.ufo.products;

import com.robert.rodriguez.pattern.creational.ufo.factories.ShipFactory;
import com.robert.rodriguez.pattern.creational.ufo.factories.UFOShipFactory;

public class UFOShip extends Ship {

  private ShipFactory shipFactory;

  public UFOShip() {
    setName("UFO Ship");
    this.shipFactory = new UFOShipFactory();
  }

  @Override
  public void makeShip() {
    System.out.println("Making new " + getName());
    setShipEngine(shipFactory.makeShipEngine());
    setShipWeapon(shipFactory.makeShipGun());
  }
}
