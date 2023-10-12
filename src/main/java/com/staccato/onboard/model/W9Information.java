package com.staccato.onboard.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;
@Document("w9InformationModel")
@Getter
@Setter
@RequiredArgsConstructor

public class W9Information {
    @Id
    private final String id;
    private final String taxpayerName;
    private final String taxpayerAddress;
    private final String taxpayerTaxId;
    private final LocalDate dateSigned;
}
