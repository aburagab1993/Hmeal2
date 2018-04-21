package app.waseem.hmeal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.waseem.hmeal.adapter.adapterfood;
import app.waseem.hmeal.list.ItemlistRest;

import static app.waseem.hmeal.home.titletolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class TypeFood extends Fragment {
    RecyclerView recyclerView;
    public List<ItemlistRest> listItems;

    RecyclerView.Adapter adapter;

    public TypeFood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View root= inflater.inflate(R.layout.fragment_type_food, container, false);
        titletolbar.setText("typefood");
        recyclerView =
                (RecyclerView)root. findViewById(R.id.rcTypefood);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext()); //hadi  list
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        listItems = new ArrayList<>();
        listItems.add(new ItemlistRest(R.drawable.qada,"breakfast"));
        listItems.add(new ItemlistRest(R.drawable.fator,"lunch"));
        listItems.add(new ItemlistRest(R.drawable.ada,"dinner"));
        listItems.add(new ItemlistRest(R.drawable.ada,"Candy"));


        adapter = new adapterfood(listItems,getContext());
        recyclerView.setAdapter(adapter);
        return root;
    }

}
