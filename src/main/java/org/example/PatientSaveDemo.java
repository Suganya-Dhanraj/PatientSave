package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@Setter
@Getter

public class PatientSaveDemo {
    private String name;
    private String address;
    private ArrayList contactNumber;

    public PatientSaveDemo(String name, String address, ArrayList contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "PatientSaveDemo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}


