package com.example.hikenow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ListView lv;
    destinasiadapter destadp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lv = findViewById(R.id.listdestinasi);

        destadp = new destinasiadapter(this,R.layout.destination_list);
        lv.setAdapter(destadp);
        initdata();
    }

    void initdata()
    {
        ArrayList<DataDestinasi> dd = new ArrayList<>();

        DataDestinasi dd1 = new DataDestinasi();
        dd1.setdurasi("4D5N");
        dd1.setgunung("Gunung Gede");
        dd1.setharga("Rp250.000");
        dd1.settinggi("1234dpl");
        dd1.setimgurl("https://phinemo.com/wp-content/uploads/2017/08/mandalawangi.jpg");

        DataDestinasi dd2 = new DataDestinasi();
        dd2.setdurasi("2D1N");
        dd2.setgunung("Gunung Sahari");
        dd2.setharga("Rp68.000");
        dd2.settinggi("72dpl");
        dd2.setimgurl("https://jendela360.com/gallery/district/59b0bf347080d.jpg");

        DataDestinasi dd3 = new DataDestinasi();
        dd3.setdurasi("3D2N");
        dd3.setgunung("Gunung Salak");
        dd3.setharga("Rp105.000");
        dd3.settinggi("2221dpl");
        dd3.setimgurl("https://cdn0-production-images-kly.akamaized.net/kNTgD3rKno1TgnHX9gBzwp1ruSg=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1994761/original/021962700_1521021721-image__1_.jpg");

        DataDestinasi dd4 = new DataDestinasi();
        dd4.setdurasi("5D4N");
        dd4.setgunung("Gunung X");
        dd4.setharga("Rp788.000");
        dd4.settinggi("72dpl");
        dd4.setimgurl("https://jendela360.com/gallery/district/59b0bf347080d.jpg");

        dd.add(dd1);
        dd.add(dd4);
        dd.add(dd3);
        dd.add(dd2);
        destadp.addAll(dd);
        destadp.notifyDataSetChanged();

    }


}
