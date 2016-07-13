package college.edu.tomer.navdrawerdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnTimeSelectedListener} interface
 * to handle interaction events.
 */
public class ListenerFragment extends Fragment {

    private OnTimeSelectedListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listener, container, false);
    }

    public void onTimeSet(int hour, int min) {
        if (mListener != null) {
            mListener.onTimeSelected(hour, min);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTimeSelectedListener)
            mListener = (OnTimeSelectedListener) context;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnTimeSelectedListener {
        void onTimeSelected(int hour, int min);
    }
}
