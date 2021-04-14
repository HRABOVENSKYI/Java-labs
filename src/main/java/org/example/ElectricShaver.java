package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ElectricShaver {

    public static final double POWER_IN_WATTS;

    private int timeOfAutomaticWorkInSeconds;
    private String manufacturer;
    private int numberOfRazorAttachments;
    private double priceInHryvnias;
    private int warrantyTimeInYears;
    private String bodyMaterial;
    private String brand;

    protected double shippingPrice;
    protected int weightInGrams;

    static {
        POWER_IN_WATTS = 61.5;
    }

    {
        timeOfAutomaticWorkInSeconds = 9999;
        manufacturer = "Uganda";
        numberOfRazorAttachments = 0;
        priceInHryvnias = 0;
        warrantyTimeInYears = 0;
        bodyMaterial = null;
        brand = null;
        shippingPrice = 0;
        weightInGrams = 0;
    }

    public ElectricShaver(int timeOfAutomaticWorkInSeconds,
                          String manufacturer,
                          int numberOfRazorAttachments,
                          double priceInHryvnias) {
        this(timeOfAutomaticWorkInSeconds,
                manufacturer,
                numberOfRazorAttachments,
                priceInHryvnias,
                0,
                null,
                null,
                0,
                0);
    }

    public static void printStaticPowerInWatts() {
        System.out.println(ElectricShaver.POWER_IN_WATTS);
    }

    public void printPowerInWatts() {
        System.out.println(ElectricShaver.POWER_IN_WATTS);
    }

    public void resetValues(int timeOfAutomaticWorkInSeconds,
                            String manufacturer,
                            int numberOfRazorAttachments,
                            double priceInHryvnias,
                            int warrantyTimeInYears,
                            String bodyMaterial,
                            String brand,
                            double shippingPrice,
                            int weightInGrams) {
        this.timeOfAutomaticWorkInSeconds = timeOfAutomaticWorkInSeconds;
        this.manufacturer = manufacturer;
        this.numberOfRazorAttachments = numberOfRazorAttachments;
        this.priceInHryvnias = priceInHryvnias;
        this.warrantyTimeInYears = warrantyTimeInYears;
        this.bodyMaterial = bodyMaterial;
        this.brand = brand;
        this.shippingPrice = shippingPrice;
        this.weightInGrams = weightInGrams;
    }

    public int getTimeOfAutomaticWorkInSeconds() {
        return this.timeOfAutomaticWorkInSeconds + 5;
    }
}
