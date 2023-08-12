package Hibernete.Boostrapping.NativeBoostRaping.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

 //@Entity annotation eka magin kiyawenne meka Entity ekk kiyla
@Entity
@Table(name ="customer")
public class Customer {
     //Ideka damata passe wenne class eke id eke primary key ekk wenwa
    @Id
    @Column(name = "customer_id")
    private int id;
    @Column(name = "customer_name")
    public String name;
//
//    @OneToMany(cascade = CascadeType.ALL )
//    @JoinColumn(name = "customer_Id")
//    List<Order> oderss = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Column(name = "customer_address")
    private String Address;

    @Column(name = "customer_salary")
    private  double Salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
