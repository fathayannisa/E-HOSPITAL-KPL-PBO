/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class User_Mod {
    private String nama;
    private String email;
    private String password;
    private String jenisKelamin;
    private String nomorHP;
    private String idPasien;
    
    public User_Mod(String idPasien, String nama, String email, String password, String jenisKelamin, String nomorHP) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
        this.nomorHP = nomorHP;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNomorHp() {
        return nomorHP;
    }

    public void setNoHp(String nomorHP) {
        this.nomorHP = nomorHP;
    }
}
