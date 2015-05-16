package com.mnknowledge.dp.creational.objectpool.simple;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Object that will be used into the simple pool.
 *
 * @author siiliev
 *
 */
public class PooledObject {

    private final static SimpleDateFormat df = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");

    Date _createdAt = Calendar.getInstance().getTime();

    public String getCreatedAt() {
        return df.format(_createdAt);
    }
}
