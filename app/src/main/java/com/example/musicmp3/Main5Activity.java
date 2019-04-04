package com.example.musicmp3;

import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    ListView listView;
    VideoView videoView;
    listViewAdapter adapter;
    String[] title;
    String[] ten;
    int[] icon;
    ArrayList<Model> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        listView = (ListView) findViewById(R.id.listvideo);
        videoView = (VideoView) findViewById(R.id.video_view);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" PlayMP4");
        //enable back home
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.anhnen));
        actionBar.setDisplayShowHomeEnabled(true);
        arrayList = new ArrayList<>();
        arrayList.add(new Model("Beautiful In White","Shane Filan",R.drawable.d));
        arrayList.add(new Model("Broken Angle","Arash, Helena",R.drawable.d2));
        arrayList.add(new Model("Cheap Thrills","Sia",R.drawable.d4));
        arrayList.add(new Model("Đời là thế thôi","Phú Lê",R.drawable.d1));
        arrayList.add(new Model("Đừng quên tên anh","Hoa Vinh",R.drawable.d5));
        arrayList.add(new Model("HongKong1","Double X,Nguyễn Trọng Tài, và Sanji",R.drawable.d8));
        arrayList.add(new Model("Em sẽ cô dâu","Minh Vương M4U ft Huy Cung",R.drawable.d7));
        arrayList.add(new Model("My Heart Will Go On","Andre Rieu",R.drawable.d3));
        arrayList.add(new Model("Symphony","J.Fla",R.drawable.d6));

//        title = new String[]{"Beautiful In White", "Broken Angle", "Cheap Thrills", "Đời là thế thôi", "Đừng quên tên anh", "HongKong1", "Em sẽ cô dâu", "My Heart Will Go On", "Symphony"};
//        ten  = new String[]{"Shane Filan", "Arash, Helena", "Sia", "Phú Lê", "Hoa Vinh", "Double X,Nguyễn Trọng Tài, và Sanji", "Minh Vương M4U ft Huy Cung", "Andre Rieu", "J.Fla"};
//        icon = new int[]{R.drawable.d, R.drawable.d2, R.drawable.d4, R.drawable.d1, R.drawable.d5, R.drawable.d8, R.drawable.d7, R.drawable.d3, R.drawable.d6};
        adapter = new listViewAdapter(this,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.beautifulinwhite));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.brokenagles));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cheapthrills));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.doilathethoi));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dungquentenanh));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hongkhong1));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.emselacodau));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.myheartwillgoon));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.symphony));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(Main5Activity.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}

