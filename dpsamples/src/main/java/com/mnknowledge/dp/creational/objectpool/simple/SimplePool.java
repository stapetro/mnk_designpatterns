package com.mnknowledge.dp.creational.objectpool.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple pool, just to demonstrate a simple pool implementation.
 *
 * @author siiliev
 *
 */
public class SimplePool {

    private static List<PooledObject> _available = new ArrayList<PooledObject>();
    private static List<PooledObject> _inUse = new ArrayList<PooledObject>();

    public static PooledObject getObject() {
        synchronized (_available) {
            if (_available.size() != 0) {
                PooledObject po = _available.get(0);
                _inUse.add(po);
                _available.remove(0);
                return po;
            } else {
                PooledObject po = new PooledObject();
                _inUse.add(po);
                return po;
            }
        }
    }

    public static void releaseObject(PooledObject po) {
        cleanUp(po);

        synchronized (_available) {
            _available.add(po);
            _inUse.remove(po);
        }
    }

    private static void cleanUp(PooledObject po) {
        po = null;
    }
}
