package br.uff.renan.resource_collection.models;

import javax.persistence.Entity;

@Entity(name = "courses")
public class Course extends ResourceCollection{
  
  private String registerAt;

  public String getRegisterAt(){
    return this.registerAt;
  }

  public void setRegisterAt(String registerAt){
    this.registerAt = registerAt;
  }
}
