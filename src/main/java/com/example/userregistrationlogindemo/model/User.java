package com.example.userregistrationlogindemo.model;

import java.util.Collection;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.JoinColumn;



	@Entity
	@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email"}) })
	public class User {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lasttName;
		
		private String email;
		private String password;
		
		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(
				name = "users_roles",
				joinColumns = {@JoinColumn(
						name = "user_id", referencedColumnName="id")},
		        inverseJoinColumns = {@JoinColumn(
		        		name = "role_id", referencedColumnName = "id")})
		
		private Collection<Role> roles;
		
		public User(long id, String firstName, String lasttName, String email, String password,
				Collection<Role> roles) {
			
			this.id = id;
			this.firstName = firstName;
			this.lasttName = lasttName;
			this.email = email;
			this.password = password;
			this.roles = roles;
		}
		public User(String firstName, String lastName, String email2, String password2, List<Role> asList) {
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLasttName() {
			return lasttName;
		}
		public void setLasttName(String lasttName) {
			this.lasttName = lasttName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Collection<Role> getRoles() {
			return roles;
		}
		public void setRoles(Collection<Role> roles) {
			this.roles = roles;
		}
}
