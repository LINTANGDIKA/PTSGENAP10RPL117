package com.example.ptsgenap10rpl117;

public class Mahasiswa {
    private String nama;
    private String namaPanggilan;
    private String nohp;
    private String email;

    public Mahasiswa(String nama, String namaPanggilan, String nohp, String email) {
        this.nama = nama;
        this.namaPanggilan = namaPanggilan;
        this.nohp = nohp;
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNamaPanggilan() {
        return namaPanggilan;
    }

    public void setNamaPanggilan(String namaPanggilan) {
        this.namaPanggilan = namaPanggilan;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
