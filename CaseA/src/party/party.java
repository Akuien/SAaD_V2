package party;

import AttackDronesUnits.AttackDroneUnit;
import Factories.UnitFactory;
import HelicopterUnits.HelicopterUnit;
import InflatableBoatsUnits.InflatableBoatUnit;

public class party {
    private AttackDroneUnit attackDroneUnit;
    private HelicopterUnit helicopterUnit;
    private InflatableBoatUnit inflatableBoatUnit;

    public party (UnitFactory party1 ) {
        attackDroneUnit = party1.createAttackDroneUnit();
        helicopterUnit = party1.createHelicopterUnit();
        inflatableBoatUnit = party1.createInflatableBoatUnit();


    }

}
