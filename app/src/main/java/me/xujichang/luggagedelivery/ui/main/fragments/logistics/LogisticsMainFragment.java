package me.xujichang.luggagedelivery.ui.main.fragments.logistics;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.Logistics;
import me.xujichang.luggagedelivery.ui.main.adapter.LogisticsAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LogisticsMainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LogisticsMainFragment extends Fragment {


    private RecyclerView mRvLogistics;
    private List<Logistics> mLogistics;
    private LogisticsAdapter mLogisticsAdapter;

    public LogisticsMainFragment() {
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
     * @return A new instance of fragment LogisticsMainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LogisticsMainFragment newInstance(String param1, String param2) {
        LogisticsMainFragment fragment = new LogisticsMainFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
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
        return initView(inflater.inflate(R.layout.fragment_logistics_main, container, false));
    }

    private View initView(View inflate) {
        mRvLogistics = inflate.findViewById(R.id.rv_logistics);
        return inflate;
    }

}
