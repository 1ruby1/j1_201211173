/*
 *abstract Factory
 * ver03
 * 
 */

package com.j1.w7.abstractFactory;

public abstract class Pizza {
    private String name;
    private Dough dough;
    private Cheese cheese;

    abstract void prepare();
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setDough(Dough dough) {
        this.dough = dough;
    }
    Dough getDough() {
        return dough;
    }
    void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
    Cheese getCheese() {
        return cheese;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough.toString());
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese.toString());
            result.append("\n");
        }
        return result.toString();
    }
}