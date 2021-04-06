package com.aleksandra.mymechanic.entity;

import javax.persistence.*;

@Entity
@Table(name="mechanic")

public class Mechanic {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phoneNumber;

    @Column
    private double price;

    @Column
    private String description;

    @Column
    private double longitude;

    @Column
    private double latitude;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getLongitude() { return longitude; }

    public double getLatitude() { return latitude; }
}
