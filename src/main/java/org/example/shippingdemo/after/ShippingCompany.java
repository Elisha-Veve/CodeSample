package org.example.shippingdemo.after;

public class ShippingCompany {
    private final String name;

    public ShippingCompany(String name) {
        this.name = name;
    }
    public void shipPackage(String origin, String destination) {
        System.out.println("Package shipped from " + origin + " to " + destination +
                " in " + (origin.length() >  destination.length() ? 3 : 10) + " days by " +
                this.name + " shipping company");
    }
}
