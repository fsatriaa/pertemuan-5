package com.fsatriaa.pertemuan5.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "datadiri_db")
public class DataDiri {

    @NonNull
    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "name")
    private String nama;

    @ColumnInfo(name = "address")
    private String alamat;

    @ColumnInfo(name = "gender")
    private char jenisKelamin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
