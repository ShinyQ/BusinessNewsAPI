package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kurniadi A.W on 2/11/2018.
 */

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.Holder>{
    List<ModelBerita> ModelBeritaList;

    @Override
    public AdapterBerita.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listberita, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(AdapterBerita.Holder holder, int position) {
        ModelBerita MB = ModelBeritaList.get(position);

        holder.tvtittle.setText(MB.getTitle());
        holder.tvPublish.setText(MB.getPublishedAt());
        holder.tvAuthor.setText(MB.getAuthor());

    }

    @Override
    public int getItemCount() {
        return  ModelBeritaList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView tvtittle;
        TextView tvAuthor;
        TextView tvPublish;
        public Holder(View itemView) {
            super(itemView);
            tvtittle = itemView.findViewById(R.id.tvJudul);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvPublish = itemView.findViewById(R.id.tvDate);
        }
    }
}
