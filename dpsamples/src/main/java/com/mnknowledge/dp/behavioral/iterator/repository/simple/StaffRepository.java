package com.mnknowledge.dp.behavioral.iterator.repository.simple;

public class StaffRepository implements Container {
    public String names[] = { "Maria", "Ivan", "Petar", "Ioana" };

    /**
     * Use our custom iterator here
     */
    @Override
    public CIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements CIterator {

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
    }
}
