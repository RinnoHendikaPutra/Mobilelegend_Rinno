package com.example.mobilelegend_rinno

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

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.aldous,
                "Aldous",
                " hero fighter terbaik saat ini karena memiliki damage yang tinggi saat memasuki late game. Shield-nya yang tebal dan mobilitasnya yang cepat juga membuat hero ini sering dipilih saat push rank"
            ),
            Superhero(
                R.drawable.alu,
                "Alucard",
                "fighter yang bisa menempel musuh dan memberikan damage tinggi. Kemampuan lifesteal-nya memberi jaminan kalau sang pemburu iblis ini bisa bertahan dalam pertempuran jangka panjang melawan musuh-musuh dengan pertahanan kuat"
            ),
            Superhero(
                R.drawable.badang,
                "Badang",
                " salah satu hero fighter yang ada di server utama game Mobile Legends . Badang diplot sebagai hero fighter yang bisa melakukan isolasi pada satu hero. Hero ini sangat efektif digunakan untuk melawan hero cepat yang bisa membuat kewalahan di early dan mid game"
            ),
            Superhero(
                R.drawable.baxia,
                "Baxia",
                "hero tank yang menggunakan mana dan ia akan sering menggunakan skill-nya. Tentu saja hal tersebut membuat Baxia menjadi hero yang sangat boros. Untung saja hal ini bisa diatasi dengan menggunakan item Demon Shoes untuk meningkatkan mana regen."
            ),
            Superhero(
                R.drawable.freya,
                "Freya",
                "Freya dikenal sebagai dewi perang yang berasal dari ujung utara tempat Nost Gal, banyak yang menganggap Freya sebagai legenda yang akan muncul dari surga apabila ada peperangan yang terjadi yang mengakibatkan kekalahan."
            ),
            Superhero(
                R.drawable.lancelot,
                "lancelot",
                "Lancelot adalah pangeran yang berasal dari keluarga kerajaan Baroque, ia ternyata gemar bermain anggar dan juga berlatih anggar sampai ia jadi ahli dan jago, maka jangan heran ketika di game ia menggunakan senjata anggarnya"
            ),
            Superhero(
                R.drawable.layla,
                "Layla",
                "Dikisahkan dulu Lylia adalah anak dari penguasa tertinggi dark magic, dan bukan hanya penguasa tertinggi dari dark magic melainkan orang tua Lylia adalah orang yang mendirikan sekolah akademi sihir"
            ),
            Superhero(
                R.drawable.ling,
                "Ling",
                "seorang murid dari The Great Dragon dan ia adalah sosok yang akan menggantikan The Great Dragon nantinya. Bisa dibilang Ling adalah rival dari Zilong Mobile Legends karena mereka adalah sepasang murid yang sama kuatnya dan sama-sama dicalonkan sebagai next The Great Dragon."
            ),
            Superhero(
                R.drawable.miya,
                "Miya",
                " seorang wanita yang lahir di kuil Bulan, Miya juga merupakan sosok keturunan dari kaum Elf. Miya adalah wanita yang ingin mempersembahkan dirinya kepada Dewa Bulan, maka dari itu ia terus berlatih agar layak untuk dipersembahkan."
            ),
            Superhero(
                R.drawable.odet,
                "Odette",
                "Sesuai legenda yang diceritakan oleh Regina Family, jika ada keturunan Regina Family yang ke 13 lahir maka, ia digambarkan akan mempunyai senyuman yang menawan bahkan sampai membuat semua orang terpana melihatnya. Keturunan tersebut tentu saja adalah Mobile Legends Odette alias putri Odette"
            ),
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}