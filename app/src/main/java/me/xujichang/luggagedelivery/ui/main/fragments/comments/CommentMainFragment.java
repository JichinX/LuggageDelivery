package me.xujichang.luggagedelivery.ui.main.fragments.comments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xujichang.luggagedelivery.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CommentMainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommentMainFragment extends Fragment {


    public CommentMainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1
     *         Parameter 1.
     * @param param2
     *         Parameter 2.
     *
     * @return A new instance of fragment CommentMainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CommentMainFragment newInstance(String param1, String param2) {
        CommentMainFragment fragment = new CommentMainFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comment_main, container, false);
    }

}
