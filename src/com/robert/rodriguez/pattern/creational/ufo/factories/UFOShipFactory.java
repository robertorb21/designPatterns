package com.robert.rodriguez.pattern.creational.ufo.factories;

import com.robert.rodriguez.pattern.creational.ufo.parts.ShipEngine;
import com.robert.rodriguez.pattern.creational.ufo.parts.ShipWeapon;
import com.robert.rodriguez.pattern.creational.ufo.parts.UFOEngine;
import com.robert.rodriguez.pattern.creational.ufo.parts.UFOGun;

public class UFOShipFactory extends ShipFactory {
  @Override
  public ShipWeapon makeShipGun() {
    return new UFOGun();
  }

  @Override
  public ShipEngine makeShipEngine() {
    return new UFOEngine();
  }
}
