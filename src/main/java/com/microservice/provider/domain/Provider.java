package com.microservice.provider.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private Long id;

    @Column(name = "pname", length = 100)
    private String name;

    @Column(name = "pstate", length = 40)
    private String state;

    @Column(name = "paddress", length = 100)
    private String address;
}
