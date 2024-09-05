package admin_user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CheckoutForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String full_name;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String card_name;
    private String card_number;
    private String exp_month;
    private String exp_year;
    private String cvv;
    private boolean shipping_address_same;

    // Getter and Setter methods for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter methods for 'full_name'
    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    // Getter and Setter methods for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter methods for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter methods for 'city'
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter methods for 'state'
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter methods for 'zip'
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // Getter and Setter methods for 'card_name'
    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    // Getter and Setter methods for 'card_number'
    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    // Getter and Setter methods for 'exp_month'
    public String getExp_month() {
        return exp_month;
    }

    public void setExp_month(String exp_month) {
        this.exp_month = exp_month;
    }

    // Getter and Setter methods for 'exp_year'
    public String getExp_year() {
        return exp_year;
    }

    public void setExp_year(String exp_year) {
        this.exp_year = exp_year;
    }

    // Getter and Setter methods for 'cvv'
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    // Getter and Setter methods for 'shipping_address_same'
    public boolean isShipping_address_same() {
        return shipping_address_same;
    }

    public void setShipping_address_same(boolean shipping_address_same) {
        this.shipping_address_same = shipping_address_same;
    }
}
