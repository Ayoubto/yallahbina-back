package com.example.test_project.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "Hoster")
@Data
public class User {
    @Id
    private BigInteger id;
    private String name;
    private String prenom;
    private String addresse;
    private String phone_number;
    private String email;
    private String password;
    private String confirmePassword;
    private String role;
    private  String image="image path";
    private boolean validated;


    public BigInteger getId() {
        return id;
    }


    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddress() {
        return addresse;
    }

    public void setAddress(String address) {
        this.addresse = address;
    }

    public String getTelephone() {
        return phone_number;
    }

    public void setTelephone(String telephone) {
        this.phone_number = telephone;
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

    public String getConfirmePassword() {
        return confirmePassword;
    }

    public void setConfirmePassword(String confirmePassword) {
        this.confirmePassword = confirmePassword;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
}
