package Hibernete.Boostrapping.NativeBoostRaping.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Orders")
public class Order {


    @Id
    @Column(name = "oid")
    private String oid;
    @Column(name = "OrderDate")
    private Date OrderDate;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", OrderDate=" + OrderDate +
                '}';
    }
}
