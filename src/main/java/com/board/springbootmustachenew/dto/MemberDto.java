package com.board.springbootmustachenew.dto;

//전달하고자 하는 필드 객체를 선언하고 getter/setter 메서드 구현
//받아야 할 파라미터가 많을 때 활용.
public class MemberDto {
    private String name;
    private String email;
    private String organization;

    //getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String toString() {
        return "MemberDto{" + "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization'" + organization + '\'' +
                '}';
    }
}
