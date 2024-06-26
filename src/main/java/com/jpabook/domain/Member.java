package com.jpabook.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // jpa내장타입 표시
    private Address address;

    @OneToMany(mappedBy = "member") // 일대다관계
    private List<Order> orders = new ArrayList<>();


}
