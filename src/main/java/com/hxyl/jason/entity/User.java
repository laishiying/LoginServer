package com.hxyl.jason.entity;

/**
 * Created by HX0010080 on 2018/7/12 0012.
 */

/**
 *
 * Mybatis 需要加上这些注解才可以使用，不然启动都会报错；
 *
 */
//@Entity
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column
    private String username;

//    @Column
    private String name;

//    @Column
    private Integer age;

//    @Column
    private String balance;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}