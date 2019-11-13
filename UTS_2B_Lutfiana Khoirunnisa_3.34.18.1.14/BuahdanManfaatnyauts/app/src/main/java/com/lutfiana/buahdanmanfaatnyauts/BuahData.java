package com.lutfiana.buahdanmanfaatnyauts;

import java.util.ArrayList;

public class BuahData {

    public static String[][] data = new String[][]{
            {"0", "Alpukat", "Manfaat Buah Alpukat Bagi Kesehatan :\n" +
                    "1.  Mencegah Resiko Kanker\n" +
                    "2.  Mencegah Sakit Jantung\n" +
                    "3.  Menjaga Kesehatan Mata\n" +
                    "4.  Melancarkan Pencernaan\n" +
                    "5.  Mencegah Depresi",
                    "https://i.postimg.cc/KYMHCyfp/Alpukat1.jpg"},
            {"1", "Jeruk", "Manfaat Buah Jeruk Bagi Kesehatan Tubuh :\n" +
                    "1. Menurunkan kolesterol\n" +
                    "2. Mencegah Kanker\n" +
                    "3. Mengurangi radang sendi dan otot kaku\n" +
                    "4. Menurunkan tekanan darah tinggi\n" +
                    "5. Daya tahan tubuh terhadap penyakit",
                    "https://i.postimg.cc/43mcBfJq/jeruk.jpg"},
            {"2", "Manggis", "Manfaat Buah Manggis Bagi Kesehatan Tubuh :\n" +
                    "1. Bisa mencegah kanker\n" +
                    "2. Bisa menurunkan berat badan\n" +
                    "3. Mengontrol gula darah\n" +
                    "4. Meningkatkan kekebalan tubuh\n" +
                    "5. Menjaga kulit lebih sehat",
                    "https://i.postimg.cc/GtrHwdCc/manggis.jpg"},
            {"3", "Pisang", "Manfaat Buah Pisang Bagi Kesehatan Tubuh :\n" +
                    "1. Sebagai Sumber Energi Instan\n" +
                    "2. Menjaga Tekanan Darah Tetap Terkontrol\n" +
                    "3. Meningkatkan Fungsi Saraf dan Daya Otak\n" +
                    "4. Menyehatkan Tulang\n" +
                    "5. Membantu Memperlancar Proses Pencernaan",
                    "https://i.postimg.cc/xCP9mmw2/pisang.jpg"},
            {"4", "Semangka", "Manfaat Buah Semangka Bagi Kesehatan Tubuh :\n" +
                    "1. Mencegah Impoten\n" +
                    "2. Mengatasi Lemak yang Menumpuk\n" +
                    "3. Menyehatkan Jantung\n" +
                    "4. Membantu Mencukupi Kebutuhan Gizi Harian\n" +
                    "5. Menurunkan Tekanan Darah",
                    "https://i.postimg.cc/c19SNdZX/semangka.jpg"},
            {"5", "Apel Hijau", "Manfaat Apel Hijau Bagi Kesehatan :\n" +
                    "1. Memperlancar Pencernaan\n" +
                    "2. Memperbaiki Jaringan Tubuh\n" +
                    "3. Menyehatkan Mata\n" +
                    "4. Mencegah Diabetes\n" +
                    "5. Makanan Pengganti Saat Diet",
                    "https://i.postimg.cc/0y1XT46V/apel-hijau.jpg"},
            {"6", "Kiwi", "Manfaat Buah Kiwi Bagi Kesehatan Tubuh :\n" +
                    "1. Sangat kaya akan vitamin C\n" +
                    "2. Membantu tidur nyenyak\n" +
                    "3. Sumber serat yang baik\n" +
                    "4. Melancarkan saluran pencernaan\n" +
                    "5. Mempercantik kulit",
                    "https://i.postimg.cc/rm77Kwmk/kiwi.jpg"},
            {"7", "Strawberry", "Manfaat Buah Strawberry Bagi Kesehatan Tubuh :\n" +
                    "1. Menjaga kesehatan mata\n" +
                    "2. Meningkatkan kekebalan tubuh\n" +
                    "3. Mengobati nyeri sendi dan asam urat\n" +
                    "4. Mencegah kanker\n" +
                    "5. Meningkatkan fungsi otak",
                    "https://i.postimg.cc/wMcFgqRF/strawberry.jpg"},
            {"8", "Kelapa", "Manfaat Buah Kelapa Bagi Kesehatan Tubuh :\n" +
                    "1. Memenuhi asupan cairan tubuh\n" +
                    "2. Menurunkan tekanan darah tinggi\n" +
                    "3. Obat kumur alami\n" +
                    "4. Membakar lemak perut\n" +
                    "5. Mencegah batu ginjal",
                    "https://i.postimg.cc/Jzt3dcxp/kelapa.jpg"},
            {"9", "Tomat", "Manfaat Buah Tomat Bagi Kesehatan Tubuh :\n" +
                    "1. Mencegah Kanker\n" +
                    "2. Melindungi Jantung Anda\n" +
                    "3. Mencegah Diabetes\n" +
                    "4. Bagus untuk kulit\n" +
                    "5. Mengurangi Depresi",
                    "https://i.postimg.cc/7Yjbw3Ds/tomat.jpg"}
    };
    public static ArrayList<Buah> getListData() {
        ArrayList<Buah> list = new ArrayList<>();
        for (String[] aData : data) {
            Buah Buah = new Buah();
            Buah.setId(Integer.parseInt(aData[0]));
            Buah.setName(aData[1]);
            Buah.setDescription(aData[2]);
            Buah.setPhoto(aData[3]);

            list.add(Buah);
        }
        return list;
    }
}
