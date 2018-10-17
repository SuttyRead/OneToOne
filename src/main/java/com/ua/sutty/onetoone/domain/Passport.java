package com.ua.sutty.onetoone.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passports")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "series")
    private String series;

    @Column(name = "number")
    private String number;

    @OneToOne(mappedBy = "passport")
    private Person person;

}
