package com.staccato.onboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("musicianModel")
public class Musician {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String bio;
    private ImageUpload headshot;
    private ImageUpload contractReceipt;
    private Date contractDateSigned;
    private W9Information w9Information;
    private Rehearsal[] rehearsals;

}
