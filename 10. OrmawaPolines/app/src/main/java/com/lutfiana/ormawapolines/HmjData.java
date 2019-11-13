package com.lutfiana.ormawapolines;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0", "HMJ Elektro", "HMJ Elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi dan S.Tr Teknik Telekomunikasi",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"},

            {"1", "HMS Sipil", "HMJ Sipil terdiri dari 4 program studi yaitu D3 Konstruksi Gedung, D3 Konstruksi Sipil, S.Tr Teknik Perawatan dan Perbaikan gedung,dan S.Tr Perancangan Jalan dan jembatan",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"},

            {"2", "HMM Mesin", "HMJ Mesin terdiri dari 4 program studi yaitu D3 Teknik Mesin, D3 Teknik Konversi Energi, S.Tr Teknik Mesin Produksi dan Perawatan,dan S.Tr Teknik Teknologi Rekayasa Pemabngkit Energi",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},

            {"3", "HMAK Akutansi", "HMJ Akutansi terdiri dari 6 program studi yaitu D3 Akutansi, D3 Keuangan dan Perbankan, S.Tr Komputerisasi Akutansi, S.Tr Akutansi Manajerial, S.Tr Perbankan Syariah, S.Tr Analisis Keuangan",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},

            {"4", "HMAB Administrasi Bisnis", "HMJ Administrasi Bisnis terdiri dari 4 program studi yaitu D3 Administrasi Bisnis , D3 Manajemen Pemasaran, D3 Teknik Listrik, S.Tr Manajemen Bisnis Internasional dan S.Tr Administrasi Bisnis Terapan",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    };

    public static ArrayList<Hmj> getListData() {
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data) {
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}

