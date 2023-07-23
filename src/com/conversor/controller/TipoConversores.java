package com.conversor.controller;

public enum TipoConversores {
    DIVISA("Conversor de Moneda"),
    TEMPERATURA("Conversor de Temperatura"),
    LONGITUD("Conversor de Longitud");

    String tipo;
    int id;

    private TipoConversores(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}