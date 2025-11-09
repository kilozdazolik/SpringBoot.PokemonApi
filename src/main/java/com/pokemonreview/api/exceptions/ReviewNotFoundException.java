package com.pokemonreview.api.exceptions;

import java.io.Serial;

public class ReviewNotFoundException  extends RuntimeException{
    private static final long serialVersionUID = 2; // @Serial annotation
    public ReviewNotFoundException(String message) {
        super(message);
    }
}
