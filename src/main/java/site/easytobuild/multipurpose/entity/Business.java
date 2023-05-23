package site.easytobuild.multipurpose.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "business_type")
public class Business {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "business_id")
    private int businessId;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_type")
    private String businessType;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    public Business() {

    }

    public Business(String businessName, String businessType) {
        this.businessName = businessName;
        this.businessType = businessType;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
