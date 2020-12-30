package com.example.aplikasimakanan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_makanan.*

class MakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Empal Gentong","Empal gentong adalah makanan khas masyarakat Cirebon, Jawa Barat. Makanan ini mirip dengan gulai dan dimasak menggunakan kayu bakar di dalam gentong. Daging yang digunakan adalah usus, babat dan daging sapi. Empal gentong berasal dari Kabupaten Cirebon.","Rp 15.000",R.drawable.empal_gentong))
        arrayList.add(Model("Mie Koclok","Mie koclok adalah kuliner khas Indonesia, tepatnya dari wilayah Cirebon, Jawa Barat. Mie koclok sendiri merupakan kepanjangan dari \"Mie Khasnya Orang Cirebon yang Lebih Okay\" yang diciptakan oleh Pak Edy, seorang pemilik warung Mie koclok pada tahun 1945.","Rp 10.000",R.drawable.mie_koclok))
        arrayList.add(Model("Nasi Jamblang","Sega Jamblang adalah makanan khas dari Cirebon, Jawa Barat. Nama Jamblang berasal dari nama daerah di sebelah barat Kabupaten Cirebon tempat asal pedagang makanan tersebut. Ciri khas makanan ini adalah penggunaan daun jati sebagai bungkus nasi. Penyajian makanannya pun bersifat prasmanan.","Rp 15.000",R.drawable.nasi_jamblang))
        arrayList.add(Model("Nasi Lengko","Sega lengko adalah makanan khas asli Cirebon. Makanan khas yang sederhana ini sarat akan protein dan karbohidrat serta rendah kalori karena bahan-bahan yang digunakan adalah 100% non-hewani.","Rp 7.000",R.drawable.nasilengko))
        arrayList.add(Model("Tahu Gejrot","Tahu gejrot adalah makanan khas Cirebon, Indonesia yang terbuat dari tahu dan bumbu lainnya. Tahu gejrot terdiri dari tahu yang sudah digoreng kemudian dipotong agak kecil lalu dimakan dengan kuah yang bumbunya cabai, bawang putih, bawang merah, gula. Biasanya disajikan di layah kecil.","Rp 5.000",R.drawable.tahugejrot))

        val myAdapter = MyAdapter(arrayList, this)

        rv_makanan.layoutManager = LinearLayoutManager(this)
        rv_makanan.adapter = myAdapter

    }
}