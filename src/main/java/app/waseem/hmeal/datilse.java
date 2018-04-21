package app.waseem.hmeal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static app.waseem.hmeal.home.titletolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class datilse extends Fragment {

Button ordr;
    public datilse() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_datilse, container, false);
        titletolbar.setText("details");
        ordr = (Button) root.findViewById(R.id.buttonorder);
        ordr .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtil.replaceFragmentWithBackStack(getContext(), new location(), R.id.frameparpa, null);

            }
        });
        return root;
    }

}
