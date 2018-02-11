package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Kurniadi A.W on 2/11/2018.
 */

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.Holder>{
    List<ModelBerita> ModelBeritaList;

    @Override
    public AdapterBerita.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AdapterBerita.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Holder(View itemView) {
            super(itemView);
        }
    }
}
