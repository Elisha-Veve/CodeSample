package org.example.shippingdemo.after;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TODO: Create Shipping Companies
        //receivers
        ShippingCompany stormSC = new ShippingCompany("Storm");
        ShippingCompany rainSC = new ShippingCompany("Rain");
        ShippingCompany cloudSC = new ShippingCompany("Cloud");
        ShippingCompany remoteSC = new ShippingCompany("Remote");

        //TODO: Create Commands
        //concrete commands
        ShipBySeaCommand stormBySeas = new ShipBySeaCommand("Ghana", "Benin", stormSC);
        ShipBySeaCommand rainBySeas = new ShipBySeaCommand("Ghana", "Argentina", rainSC);
        ShipByAirCommand cloudByPlane = new ShipByAirCommand("Ghana", "Australia", cloudSC);

        //TODO: Create Composite Command
        ArrayList<Command> transitList = new ArrayList<Command>();
        transitList.add(new ShipBySeaCommand("Ghana", "Nigeria", stormSC));
        transitList.add(new ShipByAirCommand("Nigeria", "South Africa", cloudSC));
        transitList.add(new ShipBySeaCommand("South Africa", "Antarctica", remoteSC));
        ShipByTransitCommand  extreme = new ShipByTransitCommand(transitList);



        //Invoker
        //TODO: Create Buttons
        Button ghSeaBenin = new Button(stormBySeas);
        Button ghSeaArgentina = new Button(rainBySeas);
        Button ghSeaAustralia= new Button(cloudByPlane);
        Button transit = new Button(extreme);


        //invoking
        ghSeaBenin.onClick();
        ghSeaArgentina.onClick();
        transit.onClick();
        ghSeaAustralia.onClick();

        //undo and redo
        ShippingHistory.getInstance().undo();
        ShippingHistory.getInstance().undo();


    }
}
