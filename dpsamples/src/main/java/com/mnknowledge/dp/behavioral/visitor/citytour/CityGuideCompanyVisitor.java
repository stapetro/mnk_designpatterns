package com.mnknowledge.dp.behavioral.visitor.citytour;

import java.util.ArrayList;

/**
 * City Guide Company visitor.
 *
 * @author siiliev
 *
 */
public class CityGuideCompanyVisitor implements Element {

    ArrayList<Element> places = new ArrayList<Element>();

    public CityGuideCompanyVisitor() {
        places.add(new Museum());
        places.add(new Park());
        places.add(new Castle());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City guide company is accepting visitor.");
        visitor.visit(this);

        for (Element e : places) {
            e.accept(visitor);
        }
    }
}
