package com.mnknowledge.dp.behavioral.iterator.repository.java;

import java.util.Iterator;

public class StaffRepository implements Container {
    public String names[] = { "Ivan", "Maria", "Petar", "Ioana" };

    /**
     * Use java util iterator here
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }
    }
}
