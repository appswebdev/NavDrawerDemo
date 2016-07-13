package college.edu.tomer.navdrawerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {


    private static final String ARG_COLOR = "Colors";


    private int color;

    public static ColorFragment newInstance(int color) {
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR, color);

        ColorFragment fragment = new ColorFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle args = getArguments();
        if (args!=null)
            color = args.getInt(ARG_COLOR);
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

}
