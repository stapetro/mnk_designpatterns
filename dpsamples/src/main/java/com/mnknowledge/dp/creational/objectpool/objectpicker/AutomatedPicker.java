package com.mnknowledge.dp.creational.objectpool.objectpicker;

/**
 * Object that will be used into the pool.
 *
 * @author siiliev
 *
 */
public class AutomatedPicker {

    public int pickerId;

    public String currentLocation;

    public String carrying;

    public AutomatedPicker(int pickerId) {
        this.pickerId = pickerId;
        currentLocation = "Recharging Station";
    }

    public void identify(String code) {
        ShowMessage("Identified as " + code);
    }

    public void goToLocation(String location) {
        currentLocation = location;
        ShowMessage("At " + location);
    }

    public void pick(String item) {
        carrying = item;
        ShowMessage("Picked Up " + item);
    }

    public void drop() {
        ShowMessage("Dropped " + carrying);
        carrying = null;
    }

    public void ShowMessage(String msg) {
        System.out.println(String.format("Picker %s : %s", pickerId, msg));
    }

    public int getPickerId() {
        return pickerId;
    }

    public void setPickerId(int pickerId) {
        this.pickerId = pickerId;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCarrying() {
        return carrying;
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;
    }
}
