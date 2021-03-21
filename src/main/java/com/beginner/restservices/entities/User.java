package com.beginner.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
//if we do not give this table annotation then the name of the table will be considered same as the entity name
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
	private String username;
	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstName;
	@Column(name = "LAST_NAME", length = 50, nullable = false)
	private String lastName;
	@Column(name = "EMAIL_ADDRESS", length = 50, nullable = false)
	private String email;
	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;

	@Column(name = "SSN", length = 50, nullable = false, unique = true)
	private String ssn;

	public User() {
	}

	public User(Long id, String username, String firstName, String lastName, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}

}
