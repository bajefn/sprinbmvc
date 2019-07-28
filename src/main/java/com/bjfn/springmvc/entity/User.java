package com.bjfn.springmvc.entity;


import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


/*@XmlRootElement(name = "user")*/
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private Integer state;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }




}
