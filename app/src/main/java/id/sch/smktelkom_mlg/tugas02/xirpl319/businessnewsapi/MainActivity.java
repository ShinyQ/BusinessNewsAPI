package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

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

    public void getDataBerita(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, BASE_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.e("Volley Error", toString());
                NetworkResponse networkResponse = error.networkResponse;
                if (networkResponse != null){
                    Log.e("Status Code", String.valueOf(networkResponse.statusCode));
                }
            }

        }

        );

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
