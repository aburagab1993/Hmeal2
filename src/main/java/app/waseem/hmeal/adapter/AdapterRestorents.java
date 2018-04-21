package app.waseem.hmeal.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.waseem.hmeal.FragmentUtil;
import app.waseem.hmeal.R;
import app.waseem.hmeal.TypeFood;
import app.waseem.hmeal.list.ItemlistRest;

/**
 * Created by hp pro 4540s on 4/20/2018.
 */

public class AdapterRestorents extends RecyclerView.Adapter<AdapterRestorents.ViewHolder> {
    private List<ItemlistRest> List_Item;
    private Context context;
    FragmentManager fragmentManager;
    public AdapterRestorents (List<ItemlistRest> list_Item, Context context){
        List_Item = list_Item;
        this.context = context;

    }

    @Override
    public AdapterRestorents.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrestorent, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterRestorents.ViewHolder holder, final int position) {
        holder.imageView.setImageResource(List_Item.get(position).getImage());
        holder.textView.setText(List_Item.get(position).getName());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtil.replaceFragmentWithBackStack(context, new TypeFood(), R.id.frameparpa, null);


            }
        });
    }

    @Override
    public int getItemCount() {
        return List_Item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imagetypeRest);
            textView = (TextView) itemView.findViewById(R.id.typeRest);

        }
    }
}
