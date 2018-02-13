package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Kurniadi A.W on 2/12/2018.
 */

public class Selengkapnya extends AppCompatActivity {

    ImageView imgFoto;
    TextView tvAuthor, tvTitle, tvUrl, tvDeskripsi, tvPublished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("News Details");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selengkapnya);

        imgFoto = findViewById(R.id.Image_Berita);
        tvAuthor = findViewById(R.id.tv_Author);
        tvTitle = findViewById(R.id.tv_Judul);
        tvUrl = findViewById(R.id.web);
        tvDeskripsi = findViewById(R.id.tvDeskripsi);
        tvPublished = findViewById(R.id.tv_Publish);

        imgFoto.setImageResource(getIntent().getIntExtra("imgFoto", 00));
        tvAuthor.setText("" + getIntent().getStringExtra("tvAuthor"));
        tvTitle.setText("" + getIntent().getStringExtra("tvTitle"));
        tvUrl.setText("" + getIntent().getStringExtra("tvUrl"));
        tvDeskripsi.setText("" + getIntent().getStringExtra("tvDeskripsi"));
        tvPublished.setText("" + getIntent().getStringExtra("tvPublished"));


        Glide.with(this)
                .load(getIntent().getStringExtra("imgFoto"))
                .fitCenter()
                .crossFade()
                .into(imgFoto);

    }
}
