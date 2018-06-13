package com.robert.rodriguez.pattern.creational.ufo.factories;

import com.robert.rodriguez.pattern.creational.ufo.parts.ShipEngine;
import com.robert.rodriguez.pattern.creational.ufo.parts.ShipWeapon;
import com.robert.rodriguez.pattern.creational.ufo.parts.UFOBossEngine;
import com.robert.rodriguez.pattern.creational.ufo.parts.UFOBossGun;

public class UFOBossShipFactory extends ShipFactory {
  @Override
  public ShipWeapon makeShipGun() {
    return new UFOBossGun();
  }

  @Override
  public ShipEngine makeShipEngine() {
    return new UFOBossEngine();
  }
}
