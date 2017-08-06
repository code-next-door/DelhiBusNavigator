package com.sas.delhibusnavigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class TourismActivity extends Activity {
    Integer[] pics = {R.drawable.akshardham_temple, R.drawable.ansal_plaza,
            R.drawable.appu_ghar, R.drawable.art_heritage, R.drawable.chandni_chowk,
            R.drawable.dilli_haat_ina, R.drawable.garhi_lalit_kala_artist_studio,
            R.drawable.greater_kailash_market, R.drawable.gurudwara_bangla_sahib,
            R.drawable.humayun_tomb, R.drawable.india_gate,
            R.drawable.indira_gandhi_memorial, R.drawable.iskcon_temple,
            R.drawable.jama_masjid , R.drawable.jantar_mantar,
            R.drawable.lodhi_garden , R.drawable.lotus_temple,
            R.drawable.national_zoological_park , R.drawable.nehru_park,
            R.drawable.parliament_house , R.drawable.pragati_maidan,
            R.drawable.purana_qila, R.drawable.qutab_minar ,
            R.drawable.raj_ghat, R.drawable.rajpath ,
            R.drawable.rashtrapati_bhavan,	R.drawable.red_fort,
            R.drawable.the_village_gallery, R.drawable.tibet_house };
    String[] names = { "AKSHARDHAM TEMPLE", "ANSAL PLAZA", "APPU GHAR", "ART HERITAGE",
            "CHANDNI CHOWK", "DILLI HAAT INA", "GARHI LALIT KALA ARTIST STUDIO ",
            "GREATER KAILASH MARKET", "GURUDWARA BANGLA SAHIB", "HUMAYUN TOMB", "INDIA GATE",
            "INDIRA GANDHI MEMORIAL", "ISKCON TEMPLE", "JAMA MASJID", "JANTAR MANTAR",
            "LODHI GARDEN", "LOTUS TEMPLE", "NATIONAL ZOOLOGICAL PARK", "NEHRU PARK",
            "PARLIAMENT HOUSE", "PRAGATI MAIDAN", "PURANA QILA", "QUTAB MINAR", "RAJ GHAT",
            "RAJPATH", "RASHTRAPATI BHAVAN", "RED FORT", "THE VILLAGE GALLERY", "TIBET HOUSE"};
    ListView list;
    ImageAdapter imgadap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tour_list);

        list = (ListView)findViewById(R.id.tour_list);
        imgadap = new ImageAdapter(this, pics, names);
        list.setAdapter(imgadap);

        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent tourismDetails = new Intent("com.sas.delhibusnavigator.TOURISMDETAILS");
                tourismDetails.putExtra("pos", i);
                tourismDetails.putExtra("img", pics[i]);
                tourismDetails.putExtra("name", names[i]);
                startActivity(tourismDetails);
            }
        });
    }
}
