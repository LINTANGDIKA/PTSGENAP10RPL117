package com.example.ptsgenap10rpl117;

public class User {

    public User(String namaLengkap, String notelp, String pelajar, String image) {
        this.namaLengkap = namaLengkap;
        this.notelp = notelp;
        this.pelajar = pelajar;
        this.image = image;
    }

    private String namaLengkap, notelp, pelajar,image;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getPelajar() {
        return pelajar;
    }

    public void setPelajar(String pelajar) {
        this.pelajar = pelajar;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
