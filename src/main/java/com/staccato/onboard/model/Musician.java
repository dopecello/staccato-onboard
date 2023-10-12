package com.staccato.onboard.model;

import java.util.Date;

public class Musician {
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
