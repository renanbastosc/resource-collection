package br.uff.renan.resource_collection.models;

import javax.persistence.Entity;

@Entity(name = "events")
public class Event extends ResourceCollection {

  private String startAt;

  private String endAt;
  
  public String getStartAt(){
    return this.startAt;
  }

  public String getEndAt(){
    return this.endAt;
  }

  public void setStartAt(String startAt){
    this.startAt = startAt;
  }

  public void setEndAt(String endAt){
    this.endAt = endAt;
  }
}
