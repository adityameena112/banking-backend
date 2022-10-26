//package com.banking.model;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="Account")
//public class Account {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer account_id;
//	private Integer user_id;
//	private String account_number;
//	private String account_name;
//	private String account_type;
//	private BigDecimal balance;
//	private LocalDateTime created_at;
//	private LocalDateTime updated_at;
//
//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private User user;
//
//	public Integer getAccount_id() {
//		return account_id;
//	}
//
//	public void setAccount_id(Integer account_id) {
//		this.account_id = account_id;
//	}
//
//	public Integer getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(Integer user_id) {
//		this.user_id = user_id;
//	}
//
//	public String getAccount_number() {
//		return account_number;
//	}
//
//	public void setAccount_number(String account_number) {
//		this.account_number = account_number;
//	}
//
//	public String getAccount_name() {
//		return account_name;
//	}
//
//	public void setAccount_name(String account_name) {
//		this.account_name = account_name;
//	}
//
//	public String getAccount_type() {
//		return account_type;
//	}
//
//	public void setAccount_type(String account_type) {
//		this.account_type = account_type;
//	}
//
//	public BigDecimal getBalance() {
//		return balance;
//	}
//
//	public void setBalance(BigDecimal balance) {
//		this.balance = balance;
//	}
//
//	public LocalDateTime getCreated_at() {
//		return created_at;
//	}
//
//	public void setCreated_at(LocalDateTime created_at) {
//		this.created_at = created_at;
//	}
//
//	public LocalDateTime getUpdated_at() {
//		return updated_at;
//	}
//
//	public void setUpdated_at(LocalDateTime updated_at) {
//		this.updated_at = updated_at;
//	}
//}