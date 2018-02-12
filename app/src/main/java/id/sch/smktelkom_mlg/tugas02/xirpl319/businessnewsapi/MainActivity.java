package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=4847be56cae34defb224fdfc1822d58f";
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<ModelBerita> ModelBeritaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
