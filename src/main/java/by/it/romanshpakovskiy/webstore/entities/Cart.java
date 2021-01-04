package by.it.romanshpakovskiy.webstore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "carts")
public class Cart implements Serializable {
    private static final long serialVersionUID = -656458622095521798L;

    @Id
    @GeneratedValue
    private int id;

    private double price;

    @OneToOne(mappedBy = "role")
    private User user;

    @OneToMany(mappedBy = "cart")
    private Set<Product> products = new HashSet<>();

    public Cart() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cart cart = (Cart) obj;
        return id == cart.id &&
                Objects.equals(price, cart.price);}
}
