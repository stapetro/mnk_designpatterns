package com.mnknowledge.dp.behavioral.visitor.citytour;

/**
 * Simple City Guide Demo - actually a demo for the Visitor Pattern.
 *
 * @author siiliev
 *
 */
public class CityGuideDemo {

    public static void main(String[] args) {

        // in the city comes tourist
        Tourist visitor = new Tourist();

        // he enter City Guide Tour Company
        CityGuideCompanyVisitor guidCompany = new CityGuideCompanyVisitor();

        // Guide Company takes control 
        // and makes a city tour for the tourist
        guidCompany.accept(visitor);
    }
}