package com.domain.shellcompany.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shells")
public class Shell
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private String manufacturer;
    private String model;
    
    public Shell() {}
    
    public Shell(String name, int price, String manufacturer, String model)
    {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
    }
    
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }
    
    @Override
    public String toString()
    {
        return "Shell{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
