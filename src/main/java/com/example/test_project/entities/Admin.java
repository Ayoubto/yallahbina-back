package com.example.test_project.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "Admin")
@Data
public class Admin {

    @Id
    private BigInteger id;
    private String name;
    private String adresse;
    private String cni;
    private String phone_number;
    private int age;
    private String username;
    private String password;
    private String email;

    public Admin() {
    }

    public Admin(BigInteger id, String name, String adresse, String cni, String phone_number, int age,
                 String username, String password, String email) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.cni = cni;
        this.phone_number = phone_number;
        this.age = age;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
// Getters and setters
}
