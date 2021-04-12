package org.example;

public class ElectricShaver {

    public static final float POWER_IN_WATTS = 60;

    private int timeOfAutomaticWorkInSeconds;
    private String manufacturer;
    private int numberOfRazorAttachments;
    private float priceInHryvnias;
    private int warrantyTimeInYears;
    private String bodyMaterial;
    private String brand;

    protected float shippingPrice;
    protected int weightInGrams;

    public ElectricShaver() {
    }

    public ElectricShaver(int timeOfAutomaticWorkInSeconds,
                          String manufacturer,
                          int numberOfRazorAttachments,
                          float priceInHryvnias,
                          int warrantyTimeInYears,
                          String bodyMaterial,
                          String brand,
                          float shippingPrice,
                          int weightInGrams) {
        resetValues(timeOfAutomaticWorkInSeconds,
                manufacturer,
                numberOfRazorAttachments,
                priceInHryvnias,
                warrantyTimeInYears,
                bodyMaterial,
                brand,
                shippingPrice,
                weightInGrams);
    }

    public ElectricShaver(int timeOfAutomaticWorkInSeconds,
                          String manufacturer,
                          int numberOfRazorAttachments,
                          float priceInHryvnias) {
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
                            float priceInHryvnias,
                            int warrantyTimeInYears,
                            String bodyMaterial,
                            String brand,
                            float shippingPrice,
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
        return timeOfAutomaticWorkInSeconds;
    }

    public void setTimeOfAutomaticWorkInSeconds(int timeOfAutomaticWorkInSeconds) {
        this.timeOfAutomaticWorkInSeconds = timeOfAutomaticWorkInSeconds;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumberOfRazorAttachments() {
        return numberOfRazorAttachments;
    }

    public void setNumberOfRazorAttachments(int numberOfRazorAttachments) {
        this.numberOfRazorAttachments = numberOfRazorAttachments;
    }

    public float getPriceInHryvnias() {
        return priceInHryvnias;
    }

    public void setPriceInHryvnias(float priceInHryvnias) {
        this.priceInHryvnias = priceInHryvnias;
    }

    public int getWarrantyTimeInYears() {
        return warrantyTimeInYears;
    }

    public void setWarrantyTimeInYears(int warrantyTimeInYears) {
        this.warrantyTimeInYears = warrantyTimeInYears;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static float getPowerInWatts() {
        return POWER_IN_WATTS;
    }

    public float getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "ElectricShaver{" +
                "timeOfAutomaticWorkInSeconds=" + timeOfAutomaticWorkInSeconds +
                ", manufacturer='" + manufacturer + '\'' +
                ", numberOfRazorAttachments=" + numberOfRazorAttachments +
                ", priceInHryvnias=" + priceInHryvnias +
                ", warrantyTimeInYears=" + warrantyTimeInYears +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", brand='" + brand + '\'' +
                ", shippingPrice=" + shippingPrice +
                ", weightInGrams=" + weightInGrams +
                '}';
    }
}
