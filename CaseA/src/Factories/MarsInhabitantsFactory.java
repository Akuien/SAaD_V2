package Factories;

import AttackDronesUnits.AttackDroneUnit;
import AttackDronesUnits.MartiansAttackDroneUnit;
import HelicopterUnits.HelicopterUnit;
import HelicopterUnits.MartiansHelicopterUnit;
import InflatableBoatsUnits.InflatableBoatUnit;
import InflatableBoatsUnits.MartiansInflatableBoatUnit;

public class MarsInhabitantsFactory implements UnitFactory{
    @Override
    public AttackDroneUnit createAttackDroneUnit() {
        return new MartiansAttackDroneUnit();
    }

    @Override
    public HelicopterUnit createHelicopterUnit() {
        return new MartiansHelicopterUnit();
    }

    @Override
    public InflatableBoatUnit createInflatableBoatUnit() {
        return new MartiansInflatableBoatUnit();
    }
}
