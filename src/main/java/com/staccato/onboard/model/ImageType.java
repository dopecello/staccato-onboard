package com.staccato.onboard.model;

import lombok.Getter;

@Getter
public enum ImageType {
    JPEG("image/jpeg"),
    PNG("image/png"),
    WEBP("image/webp"),
    GIF("image/gif"),
    BMP("image/bmp"),
    TIFF("image/tiff");

    private final String mimeType;

    ImageType(String mimeType) {
        this.mimeType = mimeType;
    }

}
