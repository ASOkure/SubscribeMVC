package net.webapp.subcribe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="provides")
public class Providers {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int providerId;
	
    @NotEmpty
    @Column(name = "provider", nullable = false)
	private String provider;

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "Providers [providerId=" + providerId + ", provider=" + provider + "]";
	}

}
