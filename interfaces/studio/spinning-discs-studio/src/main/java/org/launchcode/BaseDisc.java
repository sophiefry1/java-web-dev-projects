package org.launchcode;

public abstract class BaseDisc {
    private static int nextId = 1;
    private final int id;
    private String name;
    private String discType;
    private int spinRate;

    public BaseDisc(int id, String name, String discType, int spinRate) {
        this.id = nextId;
        this.name = name;
        this.discType = discType;
        this.spinRate = spinRate;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public String getDiscType(){
        return discType;
    }
    public void setDiscType(String discType){
        this.discType = discType;

    }
    public int getSpinRate(){
        return spinRate;
    }
    public void setSpinRate(int spinRate){
        this.spinRate = spinRate;
    }
    @Override
    public String toString(){
        String newLine = System.lineSeparator();
        String asterisks = "*****";
        return newline + asterisks + " " + name + " " + asterisks + newline +
                "ID: " + id + newline +
                "Disc Type: " + discType + newline +
                "Spin Rate: " + spinRate + "RPM " + newLine;
   }
}




