package com.application.zoranlee.myapplication.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.application.zoranlee.myapplication.R;
import com.application.zoranlee.myapplication.framework.BaseFragment;

/**
 * Created by zhouwei on 17/3/20.
 */

public class HomeFragment extends BaseFragment {
    private String mFrom;

    public static HomeFragment newInstance(String from) {
        HomeFragment fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFrom = getArguments().getString("from");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, null);
        TextView textView = view.findViewById(R.id.title_from);
        TextView content = view.findViewById(R.id.fragment_content);
//        textView.setText(mFrom);
        content.setText("Homefragment");
        return view;
    }

}
