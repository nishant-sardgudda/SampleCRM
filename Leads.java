package com.samplecrmproject.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Leads
 *
 */

@Entity

public class Leads implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Leads() {
		super();
	}
   
}
