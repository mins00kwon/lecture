package com.ohgiraffers.restapi.section02.responseentity;

import java.util.Date;
import java.util.Objects;

public class UserDTO {
    private int no;
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollAt;

    @Override
    public String toString() {
        return "UserDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollAt=" + enrollAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDTO userDTO = (UserDTO) o;
        return no == userDTO.no && Objects.equals(id, userDTO.id) && Objects.equals(pwd, userDTO.pwd)
                && Objects.equals(name, userDTO.name) && Objects.equals(enrollAt, userDTO.enrollAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, id, pwd, name, enrollAt);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollAt() {
        return enrollAt;
    }

    public void setEnrollAt(Date enrollAt) {
        this.enrollAt = enrollAt;
    }

    public UserDTO(int no, String id, String pwd, String name, Date enrollAt) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollAt = enrollAt;
    }

    public UserDTO() {
    }
}
