package br.uff.renan.resource_collection.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name = "resources")
public class Resource {

  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;
  
  @Column(length = 1024)
  private String title;

  @Column(length = 4096)
  private String description;

  private String link;

  private String image;

  private String createdAt;

  private String registeredAt;

  @ElementCollection
  private Set<String> keywords;

  @ManyToMany
  private List<Author> authors;

  public Resource(){
    this.keywords = new HashSet<>();
    this.authors = new ArrayList<>();
  }

  public Integer getId(){
    return this.id;
  }
  public String getTitle(){
    return this.title;
  }
  public String getDescription(){
    return this.description;
  }
  public String getLink(){
    return this.link;
  }
  public String getImage(){
    return this.image;
  }
  public String getCreatedAt(){
    return this.createdAt;
  }
  public String getRegisteredAt(){
    return this.registeredAt;
  }
  public Set<String> getKeywords(){
    return this.keywords;
  }
  public List<Author> getAuthors(){
    return this.authors;
  }

  public void setId(Integer id){
    this.id = id;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public void setLink(String link){
    this.link = link;
  }
  public void setImage(String image){
    this.image = image;
  }
  public void setCreatedAt(String createdAt){
    this.createdAt = createdAt;
  }
  public void setRegisteredAt(String registeredAt){
    this.registeredAt = registeredAt;
  }
  public void setKeywords(Set<String> keywords){
    this.keywords = keywords;
  }
  public void setAuthors(List<Author> authors){
    this.authors = authors;
  }
}
