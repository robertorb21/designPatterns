package com.robert.rodriguez.pattern.creational.ufo.factories;

import com.robert.rodriguez.pattern.creational.ufo.parts.ShipEngine;
import com.robert.rodriguez.pattern.creational.ufo.parts.ShipWeapon;

public abstract class ShipFactory {
  public abstract ShipWeapon makeShipGun();

  public abstract ShipEngine makeShipEngine();
}
