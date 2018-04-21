package app.waseem.hmeal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static app.waseem.hmeal.home.titletolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class lunch extends Fragment {
    ImageView imagefood;

    public lunch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_lunch, container, false);
        titletolbar.setText("lunch");
        imagefood = (ImageView) root.findViewById(R.id.imagefood);
        imagefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtil.replaceFragmentWithBackStack(getActivity(), new datilse(), R.id.frameparpa, null);

            }
        });
        return  root;
    }

}
