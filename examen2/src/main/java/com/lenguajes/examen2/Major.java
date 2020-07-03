package com.lenguajes.examen2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Major")
public class Major {
    @Id
    private int MajorId;
    private String Name;
    private int CyclesQuantity;

    public Major() {
    }

    public Major(int majorId, String name, int cyclesQuantity) {
        MajorId = majorId;
        Name = name;
        CyclesQuantity = cyclesQuantity;
    }

    public int getMajorId() {
        return MajorId;
    }

    public void setMajorId(int majorId) {
        MajorId = majorId;
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
