package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="yx_admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

  @Id
  private String id;

  private String username;

  private String password;

  private String status;

  private String salt;    //盐

  private String level;   //级别

  public static void main(String[] args) {

        System.out.println("hello world");

    }

}
