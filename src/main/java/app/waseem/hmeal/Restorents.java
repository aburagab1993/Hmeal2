package app.waseem.hmeal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.waseem.hmeal.adapter.AdapterRestorents;
import app.waseem.hmeal.list.ItemlistRest;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restorents extends Fragment {

    RecyclerView recyclerView;
    public List<ItemlistRest> listItems;

    RecyclerView.Adapter adapter;
    public Restorents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_restorents, container, false);
        recyclerView =
                (RecyclerView)root. findViewById(R.id.rcRestornts);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext()); //hadi  list
         recyclerView.setLayoutManager(layoutManager);
        listItems = new ArrayList<>();
        listItems.add(new ItemlistRest(R.drawable.dif,"difac cofee"));
        listItems.add(new ItemlistRest(R.drawable.kac,"kacl life"));
        listItems.add(new ItemlistRest(R.drawable.omain,""));

        listItems.add(new ItemlistRest(R.drawable.realfoods,"realfood"));
        listItems.add(new ItemlistRest(R.drawable.urban,"Unrban"));
        listItems.add(new ItemlistRest(R.drawable.veggie,"veggie"));
        listItems.add(new ItemlistRest(R.drawable.het,"haet"));
        listItems.add(new ItemlistRest(R.drawable.balnce,"blance"));
        listItems.add(new ItemlistRest(R.drawable.ofc,"Organic"));

        adapter = new AdapterRestorents(listItems,getContext());
        recyclerView.setAdapter(adapter);
        return root;
    }

}
