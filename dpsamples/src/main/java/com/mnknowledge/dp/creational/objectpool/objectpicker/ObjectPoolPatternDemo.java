package com.mnknowledge.dp.creational.objectpool.objectpicker;

/**
 * Use object pool pattern to (create) get, use and return in to the pool
 * objects.
 *
 * @author siiliev
 *
 */
public class ObjectPoolPatternDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {

        PickerPool pickerPool = PickerPool.getInstance();

        AutomatedPicker pickerA = pickerPool.getPicker();
        AutomatedPicker pickerB = pickerPool.getPicker();

        pickerA.identify("POA");
        pickerB.identify("POB");

        pickerA.goToLocation("Sofia 1");
        pickerB.goToLocation("Sofia 3");

        pickerA.pick("Phone");
        pickerB.pick("Laptop");

        pickerA.goToLocation("Plovdiv 1");
        pickerB.goToLocation("Plovdiv 2");

        pickerA.drop();
        pickerB.drop();

        pickerPool.releasePicker(pickerA);
        pickerPool.releasePicker(pickerB);

        AutomatedPicker pickerC = pickerPool.getPicker();
        AutomatedPicker pickerD = pickerPool.getPicker();
        AutomatedPicker pickerE = pickerPool.getPicker();
        AutomatedPicker pickerF = pickerPool.getPicker();
        AutomatedPicker pickerG = pickerPool.getPicker();
        AutomatedPicker pickerH = pickerPool.getPicker();
    }
}
