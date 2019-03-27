package net.webapp.subcribe.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="subscribers")
public class Subscribers {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subscriber_id;
	
	@Column(name = "subscriber", nullable = false)
	private String subcriber;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Subscriptions> subscriptions;
	
	
public List<Subscriptions> getSubscriptions(){
		
		return  this.subscriptions ;
	}
	
   public  void setSubscriptions( List<Subscriptions> subscriptionss ){
    	
   	this.subscriptions = subscriptions;
    }
	
	public int getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(int subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	public String getSubcriber() {
		return subcriber;
	}
	public void setSubcriber(String subcriber) {
		this.subcriber = subcriber;
	}
	
	
	
	@Override
	public String toString() {
		return "Subcribers [subscriber_id=" + subscriber_id + ", subcriber=" + subcriber + "]";
	}

}
