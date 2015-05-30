package com.mnknowledge.dp.behavioral.visitor.citytour;

public class Tourist implements Visitor {

    @Override
    public void visit(CityGuideCompanyVisitor city) {
        System.out.println("I'm visiting the city!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the Museum!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the Park!");
    }

    @Override
    public void visit(Castle castle) {
        System.out.println("I'm visiting the Park!");
    }
}
