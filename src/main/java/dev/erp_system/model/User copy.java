// package dev.erp_system.model;

// import java.time.LocalDateTime;
// import java.util.HashSet;
// import java.util.Set;

// import jakarta.persistence.*;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.PrePersist;
// import jakarta.persistence.PreUpdate;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "users")
// public class User1 {

// @ManyToMany(fetch = FetchType.LAZY)
// @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
// inverseJoinColumns = @JoinColumn(name = "role_id"))
// private Set<Role> roles = new HashSet<>();

// public User() {
// }

// public User(String username, String email, String password) {
// this.username = username;
// this.email = email;
// this.password = password;
// }

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @Column(nullable = false)
// private String username;

// @Column(nullable = false)
// private String email;

// @Column(nullable = false)
// private String password;

// // add status
// @Column(nullable = false)
// private String status;

// private LocalDateTime createdAt;
// private LocalDateTime updatedAt;

// public Long getId() {
// return id;
// }

// public void setId(Long id) {
// this.id = id;
// }

// public String getUsername() {
// return username;
// }

// public void setUsername(String username) {
// this.username = username;
// }

// public String getEmail() {
// return email;
// }

// public void setEmail(String email) {
// this.email = email;
// }

// public String getPassword() {
// return password;
// }

// public void setPassword(String password) {
// this.password = password;
// }

// public String getStatus() {
// return status;
// }

// public void setStatus(String status) {
// this.status = status;
// }

// public LocalDateTime getCreatedAt() {
// return createdAt;
// }

// public void setCreatedAt(LocalDateTime createdAt) {
// this.createdAt = createdAt;
// }

// public LocalDateTime getUpdatedAt() {
// return updatedAt;
// }

// public void setUpdatedAt(LocalDateTime updatedAt) {
// this.updatedAt = updatedAt;
// }

// @PrePersist
// protected void onCreate() {
// createdAt = LocalDateTime.now();
// updatedAt = LocalDateTime.now();
// }

// @PreUpdate
// protected void onUpdate() {
// updatedAt = LocalDateTime.now();
// }
// }