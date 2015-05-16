package com.mnknowledge.dp.creational.objectpool.objectpicker;

import java.util.ArrayList;
import java.util.List;

/**
 * Object Pool.
 *
 * @author siiliev
 *
 */
public class PickerPool {
    private static PickerPool uniqueInstance;

    private static int pickerCount = 5;

    private static List<AutomatedPicker> _available = new ArrayList<AutomatedPicker>();
    private static List<AutomatedPicker> _inUse = new ArrayList<AutomatedPicker>();

    // Get the only object available
    public static synchronized PickerPool getInstance() {

        if (uniqueInstance == null) {
            // create an object of MySingleObjectV1
            uniqueInstance = new PickerPool();

            for (int i = 1; i <= pickerCount; i++) {
                _available.add(new AutomatedPicker(i));
            }
        }

        return uniqueInstance;
    }

    public AutomatedPicker getPicker() throws Exception {
        synchronized (_available) {
            if (_available.size() != 0) {
                AutomatedPicker picker = _available.get(0);
                _inUse.add(picker);
                _available.remove(0);

                System.out.println("Debug: Objects Left in the pool: " + _available.size());
                return picker;
            } else {
                throw new Exception("No pickers are available");
            }
        }
    }

    public void releasePicker(AutomatedPicker picker) {
        reset(picker);

        synchronized (_available) {
            _available.add(picker);
            _inUse.remove(picker);
            System.out.println("Debug: Objects Left in the pool: " + _available.size());
        }
    }

    private void reset(AutomatedPicker picker) {
        if (picker.getCarrying() != null) {
            picker.drop();
        }

        picker.goToLocation("Recharging Station");
    }
}