package org.fis2022.exceptions;

public class ProductAlreadyExists extends Exception {

    public ProductAlreadyExists(String username) {
        super(String.format("Listare deja EXISTA!"));
    }
}
