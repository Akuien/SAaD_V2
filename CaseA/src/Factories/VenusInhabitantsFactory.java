package Factories;

import AttackDronesUnits.AttackDroneUnit;
import AttackDronesUnits.VenusiansAttackDroneUnit;
import HelicopterUnits.HelicopterUnit;
import HelicopterUnits.VenusiansHelicopterUnit;
import InflatableBoatsUnits.InflatableBoatUnit;
import InflatableBoatsUnits.VenusiansInflatableBoatUnit;

public class VenusInhabitantsFactory implements UnitFactory{
    @Override
    public AttackDroneUnit createAttackDroneUnit() {
        return new VenusiansAttackDroneUnit();
    }

    @Override
    public HelicopterUnit createHelicopterUnit() {
        return new VenusiansHelicopterUnit();
    }

    @Override
    public InflatableBoatUnit createInflatableBoatUnit() {
        return new VenusiansInflatableBoatUnit();
    }
}
