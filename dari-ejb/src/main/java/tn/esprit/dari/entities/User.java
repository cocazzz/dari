package tn.esprit.dari.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



	@Entity
	public class User implements Serializable {
		
		
			
			private static final long serialVersionUID = 1L;
		 
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;
			
			private String first_name;
			
			private String last_name;
			private String mail;
			
			@OneToOne
			private Complaint complaint;
			
			@OneToOne
			private Cart cart;
			
			@OneToOne
			private Credit_simulation credit_simulation;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Subscription> subscription;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Notification> notification;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<History> history;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Promotion> promotion;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Ad> ad;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Comment> comment;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="user") 
			private Set<Favorite> favorite;
			
			
			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getFirst_name() {
				return first_name;
			}


			public void setFirst_name(String first_name) {
				this.first_name = first_name;
			}


			public String getLast_name() {
				return last_name;
			}


			public void setLast_name(String last_name) {
				this.last_name = last_name;
			}


			public String getMail() {
				return mail;
			}


			public void setMail(String mail) {
				this.mail = mail;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}


			public int getNtelephone() {
				return Ntelephone;
			}


			public void setNtelephone(int ntelephone) {
				Ntelephone = ntelephone;
			}


			public String getLogin() {
				return login;
			}


			public void setLogin(String login) {
				this.login = login;
			}


			public UserType getUsertype() {
				return usertype;
			}


			public void setUsertype(UserType usertype) {
				this.usertype = usertype;
			}


			private String address;
			private int Ntelephone ;
			private String login ;
		
			
			@Enumerated(EnumType.STRING)
			private UserType usertype;
			public Complaint getComplaint() {
				return complaint;
			}


			public void setComplaint(Complaint complaint) {
				this.complaint = complaint;
			}


			public Cart getCart() {
				return cart;
			}


			public void setCart(Cart cart) {
				this.cart = cart;
			}


			public Credit_simulation getCredit_simulation() {
				return credit_simulation;
			}


			public void setCredit_simulation(Credit_simulation credit_simulation) {
				this.credit_simulation = credit_simulation;
			}


			public Set<Subscription> getSubscription() {
				return subscription;
			}


			public void setSubscription(Set<Subscription> subscription) {
				this.subscription = subscription;
			}


			public Set<Notification> getNotification() {
				return notification;
			}


			public void setNotification(Set<Notification> notification) {
				this.notification = notification;
			}


			public Set<History> getHistory() {
				return history;
			}


			public void setHistory(Set<History> history) {
				this.history = history;
			}


			public Set<Promotion> getPromotion() {
				return promotion;
			}


			public void setPromotion(Set<Promotion> promotion) {
				this.promotion = promotion;
			}


			public Set<Ad> getAd() {
				return ad;
			}


			public void setAd(Set<Ad> ad) {
				this.ad = ad;
			}


			public Set<Comment> getComment() {
				return comment;
			}


			public void setComment(Set<Comment> comment) {
				this.comment = comment;
			}


			public Set<Favorite> getFavorite() {
				return favorite;
			}


			public void setFavorite(Set<Favorite> favorite) {
				this.favorite = favorite;
			}
			
			
			
			
			
			


}
