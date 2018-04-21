package app.waseem.hmeal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static app.waseem.hmeal.home.titletolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class plan2 extends Fragment {


    public plan2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_plan2, container, false);
        titletolbar.setText("plan");

        return root;
    }

}
