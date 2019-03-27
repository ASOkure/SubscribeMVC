package net.webapp.subcribe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="subscriptions")
public class Subscriptions {
     
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriptionId;
	
	@NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
    @Column(name = "from", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private Date from;
	
	@NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
    @Column(name = "to", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private Date to;
	
	
	@ManyToOne
	@JoinColumn(name = "Subscriber_id")
	private Subscribers subscribers;
	
	
	public Subscribers getSubscribers() {
		return this.subscribers;
	}

	public void setSubscribers(Subscribers subscribers) {
		this.subscribers = subscribers;
	}
	
	
	
	

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Subscriptions [subscriptionId=" + subscriptionId + ", from=" + from + ", to=" + to + "]";
	}

}
