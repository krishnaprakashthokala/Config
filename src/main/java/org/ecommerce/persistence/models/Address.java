package org.ecommerce.persistence.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author sergio
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "{address.street.notnull}")
	@Column(nullable = false, length = 40)
	private String street;
	@NotBlank(message = "{address.city.notnull}")
	@Column(nullable = false, length = 20)
	private String city;
	@Column(nullable = false, length = 20)
	private String zipCode;
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Country country;
	@OneToMany(mappedBy = "shipTo")
	private Set<Order> shipToOrders;
	@OneToMany(mappedBy = "billTo")
	private Set<Order> billToOrders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<Order> getShipToOrders() {
		return shipToOrders;
	}

	public void setShipToOrders(Set<Order> shipToOrders) {
		this.shipToOrders = shipToOrders;
	}

	public Set<Order> getBillToOrders() {
		return billToOrders;
	}

	public void setBillToOrders(Set<Order> billToOrders) {
		this.billToOrders = billToOrders;
	}

	@Override
	public String toString() {
		return "Address{" + "id=" + id + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", country="
				+ country + '}';
	}

}
