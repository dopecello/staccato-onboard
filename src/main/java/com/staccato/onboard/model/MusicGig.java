package com.staccato.onboard.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
@Document("musicGigModel")
@Getter
@Setter
@RequiredArgsConstructor
public class MusicGig {

    @Id
    private final String id;
    private LocalDate gigDate;
    private LocalTime gigTime;
    private String gigVenue;
    private String gigCity;
    private String gigSetList;
    private String gigType;
    private int gigPay;
    @DBRef
    private Musician gigViolin1;
    @DBRef
    private Musician gigViolin2;
    @DBRef
    private Musician gigViola;
    @DBRef
    private Musician gigCello;
    @DBRef
    private Musician gigPiano;
    @DBRef
    private Musician gigAdditionalMusician;
}
