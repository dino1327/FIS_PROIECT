package org.fis2022.models;

public class Listing {
    private String nume;
    private float pret;

    private String descriere;

    public Listing(String nume, float pret, String descriere) {
        this.nume = nume;
        this.pret = pret;
        this.descriere = descriere;
    }

    public Listing(){

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Listing order= (Listing) o;

        if (this.pret != pret) return false;
        return nume.equals(order.nume);
    }
}