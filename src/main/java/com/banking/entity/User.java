//package com.banking.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//
//@Entity
//@Table(name="users")
//public class User {
//
//    @Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//    private int user_id;
//    private String first_name;
//    private String last_name;
//    private String email;
//    private String password;
//    private String token;
//    private String code;
//    private int verified;
//    private LocalDate verified_at;
//    private LocalDateTime created_at;
//    private LocalDateTime updated_at;
//    private String confirm_password;
//
//    public int getUser_id() {
//        return user_id;
//    }
//
//	public void setUser_id(int user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public int getVerified() {
//        return verified;
//    }
//
//    public void setVerified(int verified) {
//        this.verified = verified;
//    }
//
//    public LocalDate getVerified_at() {
//        return verified_at;
//    }
//
//    public void setVerified_at(LocalDate verified_at) {
//        this.verified_at = verified_at;
//    }
//
//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public LocalDateTime getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(LocalDateTime updated_at) {
//        this.updated_at = updated_at;
//    }
//
//	public String getConfirm_password() {
//		return confirm_password;
//	}
//
//	public void setConfirm_password(String confirm_password) {
//		this.confirm_password = confirm_password;
//	}
//
//
//}
