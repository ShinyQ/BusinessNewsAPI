package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurniadi A.W on 2/11/2018.
 */

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.Holder> {
    List<ModelBerita> ModelBeritaList;
    static Context context;

    public AdapterBerita(List<ModelBerita> Mb, Context ctx) {
        ModelBeritaList = Mb;
        context = ctx;
    }

    @Override
    public AdapterBerita.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listberita, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(AdapterBerita.Holder holder, int position) {
        ModelBerita MB = ModelBeritaList.get(position);

        holder.tvTitle.setText(MB.getTitle());
        holder.tvPublished.setText(MB.getPublishedAt());
        holder.tvAuthor.setText("- " + MB.getAuthor() + " -");
        Glide.with(context)
                .load(MB.getUrlToImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .into(holder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return ModelBeritaList.size();
    }

    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imgFoto;
        TextView tvAuthor, tvTitle, tvUrl, tvDeskripsi, tvPublished;
        Button btnSelengkapnya;
        Context context;

        public Holder(View itemView) {
            super(itemView);
            this.context = AdapterBerita.context;
            imgFoto = itemView.findViewById(R.id.Image_Berita);
            tvAuthor = itemView.findViewById(R.id.tv_Author);
            tvTitle = itemView.findViewById(R.id.tv_Judul);
            tvUrl = itemView.findViewById(R.id.web);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvPublished = itemView.findViewById(R.id.tv_Publish);
            btnSelengkapnya = itemView.findViewById(R.id.btn_selengkapnya);
            btnSelengkapnya.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_selengkapnya:
                    int position = getAdapterPosition();
                    ModelBerita MB = ModelBeritaList.get(position);
                    Intent intent = new Intent(context, Selengkapnya.class);
                    intent.putExtra("tvAuthor", MB.getAuthor());
                    intent.putExtra("tvTitle", MB.getTitle());
                    intent.putExtra("tvDeskripsi", MB.getDescription());
                    intent.putExtra("imgFoto", MB.getUrlToImage());
                    intent.putExtra("tvUrl", MB.getUrl());
                    intent.putExtra("tvPublished", MB.getPublishedAt());
                    this.context.startActivity(intent);
            }
        }

    }
}
