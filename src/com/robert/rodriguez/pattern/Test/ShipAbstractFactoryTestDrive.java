package com.robert.rodriguez.pattern.Test;

import com.robert.rodriguez.pattern.creational.ufo.products.Ship;
import com.robert.rodriguez.pattern.creational.ufo.products.UFOBossShip;
import com.robert.rodriguez.pattern.creational.ufo.products.UFOShip;

public class ShipAbstractFactoryTestDrive {

  public static void main(String[] args) {
    Ship ship;
    String typeShip;

    typeShip = "ufo";
    if (typeShip.equalsIgnoreCase("ufo")) {
      ship = new UFOShip();
      ship.makeShip();
      System.out.println(ship.toString());
    }

    typeShip = "boss";
    if (typeShip.equalsIgnoreCase("boss")) {
      ship = new UFOBossShip();
      ship.makeShip();
      System.out.println(ship.toString());
    }
  }
}
