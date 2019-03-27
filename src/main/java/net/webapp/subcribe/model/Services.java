package net.webapp.subcribe.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="services")
public class Services {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
	

    @NotEmpty
    @Column(name = "service" )
	private String service;
    
    
    
    @NotEmpty
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ServiceProfider", joinColumns = { @JoinColumn(name = "Service_ID") }, 
             inverseJoinColumns = { @JoinColumn(name = "Provider_ID") })
	private Set<Providers> providers = new HashSet<Providers>();
    
    
    
    

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", service=" + service + "]";
	}

}
