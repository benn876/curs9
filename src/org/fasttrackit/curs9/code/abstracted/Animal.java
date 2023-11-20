package org.fasttrackit.curs9.code.abstracted;

public abstract class Animal implements Being{
    public abstract int numberOfLegs();
    public void makesSound(){
        System.out.println("Animal Sound");
    }

    @Override
    public void lives() {
        System.out.println("Animal life");
    }

    @Override
    public void breaths() {
        System.out.println("Using lungs");
    }
}
