package com.staccato.onboard.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document("musicianModel")
@Getter
@Setter
@RequiredArgsConstructor
public final class Musician {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;
    private String email;
    private String phoneNumber;
    private String bio;
    private ImageUpload headshot;
    private ImageUpload contractReceipt;
    private LocalDateTime contractDateSigned; // can make unit test for this
    private W9Information w9Information;
    private List<Rehearsal> rehearsals = new ArrayList<>();

    public List<Rehearsal> getRehearsals() {
        return new ArrayList<>(rehearsals);
    }

    public void setRehearsals(List<Rehearsal> rehearsals) {
        this.rehearsals = (rehearsals != null) ? new ArrayList<>(rehearsals) : new ArrayList<>();
    }

    public void addRehearsal(Rehearsal rehearsal) {
        this.rehearsals.add(rehearsal);
    }

    public void removeRehearsal(Rehearsal rehearsal) throws IllegalStateException {
        if (rehearsals == null || rehearsals.isEmpty()) {
            throw new IllegalStateException("The list of rehearsals is empty or null");
        }
        this.rehearsals.remove(rehearsal);

    }

}
