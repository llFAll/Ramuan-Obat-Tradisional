package com.example.obat9;

public class SoalPilihanGanda {
    public String image [] = {
            "s1",
            "s2",
            "s3",
            "s4",
            "s5",
            "s6",
            "s7",
            "s8",
            "s9",
            "s10"};
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Dari ketiga gambar daun sirih, gula aren dan garam merupakan resep obat untuk mengobati?",
            "Daun Gendola memilili khasiat untuk mengobati?",
            "Tanaman temulawak bermanfaat untuk mengobati cacar air, selain itu juga dapat digunakan untuk mengobati?",
            "Tanaman kencur memiliki kegunaan untuk mengobati?",
            "Tanaman akar rumput, akar alang-alang, dan meniran dapat digunakan untuk mengobati penyakit?",
            "Dari gambar diatas adalah resep obat tradisional yang dapat mengobati penyakit?",
            "Gandarusa dapat digunakan untuk mengobati penyakit?",
            "Tanaman diatas adalah biji jali yang dapat digunakan untuk mengobati penyakit?",
            "Bunga pagoda dapat digunakan dalam mengobati penyakit?",
            "Daun sendok segar dapat di gunakan untuk mengobati penyakit?",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Cacar air","Campak","Alergi"},
            {"Diabetes","Cacar Air","Pleuritis"},
            {"Panu","Disentri","Asma"},
            {"Batuk","Asma","Keseleo"},
            {"Chlamydia","Sifilis","Radang Amandel"},
            {"Bronkritis","Leukimia","Flu"},
            {"Stroke","Kusta","Haid"},
            {"Hepatitis","Radang Usus Buntu","Lupus"},
            {"Sembelit","Wasir","Maag"},
            {"TBC","Sariawan","Cacingan"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Alergi",
            "Cacar Air",
            "Asma",
            "Keseleo",
            "Sifilis",
            "Bronkritis",
            "Haid",
            "Radang Usus Buntu",
            "Wasir",
            "Cacingan",
    };
    //membuat getter untuk mengambil gambar
    public String getGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
