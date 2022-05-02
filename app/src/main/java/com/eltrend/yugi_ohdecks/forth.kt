package com.eltrend.yugi_ohdecks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forth.*

class forth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
        when {
            BlogRecyclerAdapter.clicked==1->pdf_view.fromAsset("yugi deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==2->pdf_view.fromAsset("Rulebook_v9_en_compressed (1).pdf").load()
            BlogRecyclerAdapter.clicked==3->pdf_view.fromAsset("v 1_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==4->pdf_view.fromAsset("red eyes_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==5->pdf_view.fromAsset("galaxy-eys deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==6->pdf_view.fromAsset("divine_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==7->pdf_view.fromAsset("1845204 (1)_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==8->pdf_view.fromAsset("top ban_compressed.pdf").load()

            BlogRecyclerAdapter.clicked==9->{
                var i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse("https://www.facebook.com/groups/239694416741219/?ref=group_header")
                startActivity(i)
            }
            BlogRecyclerAdapter.clicked==10->{
                var i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.eltrend.myapplication4")
                startActivity(i)
            }
            BlogRecyclerAdapter.clicked==11->{
                var i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.eltrend.myapplication5")
                startActivity(i)
            }
            BlogRecyclerAdapter.clicked==12->{
                var i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.eltrrend.yugi2")
                startActivity(i)
            }
            BlogRecyclerAdapter.clicked==13->pdf_view.fromAsset("dark magician deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==14->pdf_view.fromAsset("blue-eyes deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==15->pdf_view.fromAsset("cyber dragon deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==16->pdf_view.fromAsset("Egyptian gods deck _compressed.pdf").load()
            BlogRecyclerAdapter.clicked==17->pdf_view.fromAsset("exodia deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==18->pdf_view.fromAsset("Trickstars 2019_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==19->pdf_view.fromAsset("Sky Strikers_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==20->pdf_view.fromAsset("THUNDER DRAGON 1ST PLACE DECK.pdf").load()
            BlogRecyclerAdapter.clicked==21->pdf_view.fromAsset("DDD Control Field_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==22->pdf_view.fromAsset("Gouki_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==23->pdf_view.fromAsset("kaiba deck (1)_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==24->pdf_view.fromAsset("marik deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==25->pdf_view.fromAsset("bakura d_compressed_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==26->pdf_view.fromAsset("pegasus deck_compressed (1).pdf").load()
            BlogRecyclerAdapter.clicked==27->pdf_view.fromAsset("joey deck_compressed.pdf").load()
            BlogRecyclerAdapter.clicked==28->pdf_view.fromAsset("Elemental hero deck _compressed.pdf").load()
            BlogRecyclerAdapter.clicked==29->pdf_view.fromAsset("d heto.pdf").load()
            BlogRecyclerAdapter.clicked==30->pdf_view.fromAsset("manjume thunder deck_compressed.pdf").load()
        }
    }
}
