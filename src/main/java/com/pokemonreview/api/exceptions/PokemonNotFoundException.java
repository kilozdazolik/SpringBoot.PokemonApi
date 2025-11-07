package com.pokemonreview.api.exceptions;

public class PokemonNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L; // @Serial annotation
    public PokemonNotFoundException(String message) {
        super(message);
    }
}
