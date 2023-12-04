package tg.esig.event_gestion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer age;
    private String location;

    public Utilisateur(){

    }
    public Utilisateur(Long id, String nom, String prenom, Integer age, String location){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.location = location;
    }

    public Utilisateur(String nom, String prenom, Integer age, String location){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public Integer getAge(){
        return age;
    }
    public String getLocation(){
        return location;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String toString(){
        return "Utilisateur{"+
                "id=" + id +
                "nom='"+nom+'\''+
                "prenom='"+prenom+'\''+
                "age='"+age+'\''+
                "location='"+location+'\''+
                '}';
    }
}
