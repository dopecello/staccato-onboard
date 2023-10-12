package com.staccato.onboard.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document("rehearsalModel")
@Getter
@Setter
@RequiredArgsConstructor
public class Rehearsal {

    @Id
    private final String id;
    private String rehearsalCity;
    private String concert;
    private LocalDate rehearsalDate;
    private LocalTime rehearsalTime;
    private String violin1Name;
    private String violin2Name;
    private String violaName;
    private String celloName;
    private String pianoName;
    private String bassName;
    private String singerName;
    private String comments;
}
