package br.uff.renan.resource_collection.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name = "authors")
public class Author {

  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  private String email;

  @Column(length = 64)
  private String name;

  @Column(length = 64)
  private String lastName;

  @Column(length = 256)
  private String affiliation;

  private String orcid;

  @ManyToMany(mappedBy = "authors")
  private List<Resource> resources;

  public Integer getId(){
    return this.id;
  }
  public String getEmail(){
    return this.email;
  }
  public String getName(){
    return this.name;
  }
  public String getLastName(){
    return this.lastName;
  }
  public String getAffiliation(){
    return this.affiliation;
  }
  public String getOrcid(){
    return this.orcid;
  }

  public void setId(Integer id){
    this.id = id;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public void setAffiliation(String affiliation){
    this.affiliation = affiliation;
  }
  public void setOrcid(String orcid){
    this.orcid = orcid;
  }

}
