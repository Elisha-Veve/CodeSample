package org.example.shippingdemo.after.client;

import org.example.shippingdemo.after.ShippingHistory;
import org.example.shippingdemo.after.command.ShipBySeaCommand;
import org.example.shippingdemo.after.invoker.Button;
import org.example.shippingdemo.after.receiver.ShippingCompany;

public class Main {
    public static void main(String[] args) {
        //TODO: Create Shipping Companies
        //receivers
        ShippingCompany stormSC = new ShippingCompany("StormSC");
        ShippingCompany rainSC = new ShippingCompany("RainSC");

        //TODO: Create Commands
        //concrete commands
        ShipBySeaCommand stormBySeas = new ShipBySeaCommand("Ghana", "Benin", stormSC);
        ShipBySeaCommand rainBySeas = new ShipBySeaCommand("Ghana", "Argentina", rainSC);


        //Invoker
        //TODO: Create Buttons
        Button ghSeaBenin = new Button();
        ghSeaBenin.setCommand(stormBySeas);


        //invoking
//        ghSeaBenin.executeCommand();
//        ghSeaArgentina.onClick();
//        transit.executeCommand();
//        ghSeaAustralia.onClick();

        //undo and redo
//        ShippingHistory.getInstance().undo();
//        ShippingHistory.getInstance().redo();
//        ShippingHistory.getInstance().undo();



        //receiver
        ShippingCompany ghanaShippingCompany = new ShippingCompany("Ghana");

//        command
        ShipBySeaCommand shipFromGhanaBySea = new ShipBySeaCommand("Ghana", "Benin", ghanaShippingCompany);

        //invoker
        Button shipToBenin = new Button();
        shipToBenin.setCommand(shipFromGhanaBySea);

        //invoke
        shipToBenin.executeCommand();

        shipFromGhanaBySea.changeShippingDestination("Australia");


        Button shipToAustralia = new Button();
        shipToAustralia.setCommand(shipFromGhanaBySea);

        shipToAustralia.executeCommand();

        ShippingHistory.getInstance().undo();
        ShippingHistory.getInstance().undo();


        //receiver
//        ShippingCompany intercontinentalSC = new ShippingCompany("Intercontinental");


        //command
//        Command shipToEgypt = new ShipBySeaCommand("Ghana", "Egypt", ghanaShippingCompany);
//        Command shipToSpain = new ShipByAirCommand("Egypt", "Spain", intercontinentalSC);
//        Command shipToAntarctica = new ShipBySeaCommand("Spain", "Antarctica", intercontinentalSC);
//
//        ArrayList<Command> shipFromGhanaToAntarctica = new ArrayList<>();
//        shipFromGhanaToAntarctica.add(shipToEgypt);
//        shipFromGhanaToAntarctica.add(shipToSpain);
//        shipFromGhanaToAntarctica.add(shipToAntarctica);
//
//        //command
//        Command shipFromGHtoAnt = new ShipByTransitCommand(shipFromGhanaToAntarctica);
//
//        //invoker
//        Button shipToAntarcticaBtn = new Button();
//        shipToAntarcticaBtn.setCommand(shipFromGHtoAnt);
//
//
//        //invoke
//        shipToAntarcticaBtn.executeCommand();
//
//        ShippingHistory.getInstance().undo();
//        ShippingHistory.getInstance().redo();
    }
}
