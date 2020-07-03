package com.lenguajes.examen2;

public class MajorDTO {

    private String Name;
    private int CyclesQuantity;

    public MajorDTO() {
    }

    public MajorDTO(String name, int cyclesQuantity) {
        Name = name;
        CyclesQuantity = cyclesQuantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCyclesQuantity() {
        return CyclesQuantity;
    }

    public void setCyclesQuantity(int cyclesQuantity) {
        CyclesQuantity = cyclesQuantity;
    }
}
