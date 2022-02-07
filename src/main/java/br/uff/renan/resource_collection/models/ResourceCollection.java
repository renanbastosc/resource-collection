package br.uff.renan.resource_collection.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ResourceCollection {

  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;
  
  @ManyToMany
  private List<Resource> resources;

  @Column(length = 1024)
  private String title;

  @Column(length = 4096)
  private String description;

  private String image;

  public ResourceCollection(){
    this.resources = new ArrayList<>();
  }

  public Integer getId(){
    return this.id;
  }
  public List<Resource> getResources(){
    return this.resources;
  }
  public String getTitle(){
    return this.title;
  }
  public String getDescription(){
    return this.description;
  }
  public String getImage(){
    return this.image;
  }

  public void setId(Integer id){
    this.id = id;
  }
  public void setResources(List<Resource> resources){
    this.resources = resources;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public void setImage(String image){
    this.image = image;
  }

}
