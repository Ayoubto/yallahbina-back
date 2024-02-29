package com.example.test_project.entities;


public class UserResponseDTO {

    private String id;
    private String nom;
    private String addresse;
    private String phone_number;
    private String email;
    private String role;
    private String image;
    private String prenom;



    public UserResponseDTO(String id, String name, String addresse, String phone_number, String email, String role, String image, String prenom) {
        this.id = id;
        this.nom = name;
        this.addresse = addresse;
        this.phone_number = phone_number;
        this.email = email;
        this.role = role;
        this.image = image;
        this.prenom = prenom;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }



    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getAddresse() {
//        return addresse;
//    }
//
//    public void setAddresse(String addresse) {
//        this.addresse = addresse;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public String getCni() {
//        return cni;
//    }
//
//    public void setCni(String cni) {
//        this.cni = cni;
//    }
//
//    public String getRib() {
//        return rib;
//    }
//
//    public void setRib(String rib) {
//        this.rib = rib;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getNom() {
//        return name;
//    }
//
//    public String getPrenom() {
//        return category;
//    }
//
//    public String getAddress() {
//        return addresse;
//    }
//
//    public String getTelephone() {
//        return phone_number;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public String getImage() {
//        return image;
//    }


}

