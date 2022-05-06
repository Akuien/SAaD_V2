package Factories;

import AttackDronesUnits.AttackDroneUnit;
import HelicopterUnits.HelicopterUnit;
import InflatableBoatsUnits.InflatableBoatUnit;

public interface UnitFactory {
    AttackDroneUnit createAttackDroneUnit();
    HelicopterUnit createHelicopterUnit();
    InflatableBoatUnit createInflatableBoatUnit();
}
