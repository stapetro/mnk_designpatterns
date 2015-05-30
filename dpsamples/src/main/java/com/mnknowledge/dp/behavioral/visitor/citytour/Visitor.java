package com.mnknowledge.dp.behavioral.visitor.citytour;

/**
 * Visitor interface.
 *
 * @author siiliev
 *
 */
public interface Visitor {
    public void visit(CityGuideCompanyVisitor city);

    public void visit(Castle castle);

    public void visit(Museum museum);

    public void visit(Park park);
}