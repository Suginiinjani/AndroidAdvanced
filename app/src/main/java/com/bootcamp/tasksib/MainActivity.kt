package com.bootcamp.tasksib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memberList = listOf<Member>(
            Member(
                R.drawable.adel,
                "Reva Fidela",
                "Reva Fidela Adel Pantjoro yang biasa dipanggil Adel atau Reva adalah salah seorang penyanyi Indonesia dan anggota JKT48 yang berasal dari Jakarta, Indonesia. Adel merupakan anggota JKT48 generasi ke-8 yang diperkenalkan pada 27 April 2019."
            ),
            Member(
                R.drawable.ashel,
                "Adzana Shaliha",
                "Adzana Shaliha Alifyaa atau juga dikenal sebagai Ashel JKT48 adalah salah seorang musisi Indonesia dan anggota JKT48 yang berasal dari Jakarta, Indonesia. Ashel merupakan anggota generasi kesembilan JKT48."
            ),
            Member(
                R.drawable.chika,
                "Yessica Tamara",
                "Yessica Tamara Siallagan yang akrab disapa Chika JKT48 adalah salah seorang anggota dari grup idola JKT48 dari generasi ketujuh. Sebelum restrukturisasi Chika berada di Tim KIII. Jikoushokai dari Chika di JKT48 adalah \"Memberikan kebahagiaan lewat gummy smile-ku. Halo, aku Chika!\n"
            ),
            Member(
                R.drawable.ella,
                "Gabriella Abigail",
                "Gabriela Abigail Mewengkang atau yang lebih akrab dipanggil Ella JKT48, adalah salah seorang anggota member JKT48 generasi sepuluh."
            ),
            Member(
                R.drawable.christy,
                "Angelina Christy",
                "Angelina Christy, dikenal dengan nama Christy JKT48, adalah seorang penyanyi asal Indonesia yang tergabung sebagai anggota grup idola JKT48. Ia merupakan anggota generasi ketujuh JKT48 yang diperkenalkan pada 29 September 2018."
            ),
            Member(
                R.drawable.fiony,
                "Fiony Alveria Tantri",
                "Fiony Alveria Tantri (lahir 4 Februari 2002), juga dikenal sebagai Fiony JKT48, adalah seorang penyanyi Indonesia dan anggota grup idola JKT48. Ia merupakan anggota generasi kedelapan JKT48 yang diperkenalkan pada 27 April 2019"
            ),
            Member(
                R.drawable.flora,
                "Flora Shafiq",
                "Flora Shafiqa Riyadi adalah salah satu member generasi 7 dari JKT48 yang berasal dari Jakarta. Ia kerap dikenal sebagai Flora atau Flo jika dipanggil oleh teman-teman satu generasinya"
            ),
            Member(
                R.drawable.freya,
                "Freyanashifa Jayawardhana",
                "Raden Roro Freyanashifa Jayawardana (lahir 13 Februari 2006),[1][2] secara mononim dikenal sebagai Freya, atau Freya JKT48 (selama menjadi anggota JKT48), adalah penyanyi, penari, dan aktris berkebangsaan Indonesia. Ia merupakan anggota grup idola JKT48 generasi ketujuh yang diperkenalkan pada 29 September 2018"
            ),
            Member(
                R.drawable.gracia,
                "Shania Gracia Harlan",
                "Shania Gracia Harlan, S.I.Kom. adalah salah aktris, penyanyi, dan penari berkebangsaan Indonesia. Shania merupakan anggota grup idola JKT48 generasi ketiga."
            ),
            Member(
                R.drawable.shani,
                "Shani Indira Natio",
                "Shani Indira Natio, S.I.Kom, secara mononim dikenal sebagai Shani JKT48, adalah seorang penyanyi dan penari Indonesia yang merupakan anggota dari grup idola JKT48."
            ),
            Member(
                R.drawable.indah,
                "Indah Cahya Nabila",
                "Indah Chya Nabila atau yang kerap disapa Indah merupakan member dari generasi 9 JKT48 yang berasal dari Jambi. Ia merupakan kelahiran 20 Maret 2001 yang sekarang sudah berusia 22 tahun."
            ),
            Member(
                R.drawable.jessi,
                "Jessica Chandra",
                "Jessica Chandra (lahir 23 September 2005), juga dikenal sebagai Jessi JKT48, adalah salah seorang penyanyi Indonesia dan anggota JKT48 yang berasal dari Jakarta, Indonesia. Jessi merupakan anggota JKT48 generasi ketujuh yang diperkenalkan pada 2018.Perempuan yang memiliki kemampuan dalam hal menari ini memiliki nama Mandarian / Hokkian yakni Zheng Wei Ting."
            ),
            Member(
                R.drawable.marsha,
                "Marsha Lenathea",
                "Marsha Lenathea Lapian, juga dikenal sebagai Marsha JKT48, adalah seorang penyanyi Indonesia dan anggota grup idola JKT48. Ia merupakan anggota generasi kesembilan JKT48 yang diperkenalkan pada 1 Desember 2019."
            ),
            Member(
                R.drawable.zee,
                "Azizi Asadel",
                "Azizi Shafaa Asadel, dikenal dengan nama mononim Zee JKT48, adalah seorang penyanyi dan aktris asal Indonesia yang tergabung sebagai anggota grup idola JKT48. Ia merupakan anggota generasi ketujuh JKT48 yang diperkenalkan pada 29 September 2018."
            ),
            Member(
                R.drawable.oniel,
                "Cornelia Vanessa",
                "Cornelia Syafa Vanisa yang biasa dipanggil Oniel adalah salah seorang penyanyi Indonesia, model dan anggota JKT48 yang berasal dari Jakarta, Indonesia. Oniel merupakan anggota JKT48 generasi kedelapan yang diperkenalkan pada 27 April 2019."
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv_member)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = MemberAdapter(this, memberList){
            val intent = Intent (this, DetailMemberActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}