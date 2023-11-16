package com.pizza.Pizza_Shop.model;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {
    @Id
   private long admin_id;
   @Column(name="username")
   private String username;
   @Column(name="password")
   private String password;

   public Admin(){

   }

   public Admin(long admin_id, String username, String password){
       this.admin_id = admin_id;
       this.username = username;
       this.password = password;
   }

}