package com.example.pokestar.universityset.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokestar.universityset.Activity.MainActivity;
import com.example.pokestar.universityset.Adapter.FragmentAdapter;
import com.example.pokestar.universityset.R;
import com.example.pokestar.universityset.Data.School;
import com.example.pokestar.universityset.School.SchoolListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link SchoolFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SchoolFragment extends Fragment {

    private String TAG = MainActivity.class.getSimpleName();

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private SchoolListFragment schoolListFragment;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SchoolFragment.
     */

    public static SchoolFragment newInstance() {
        SchoolFragment fragment = new SchoolFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "高校onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school, container, false);

        tabLayout = (TabLayout)view.findViewById(R.id.school_tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("推荐高校"));
        viewPager = (ViewPager)view.findViewById(R.id.school_viewpager);

        schoolListFragment = new SchoolListFragment();

        List<String> titles = new ArrayList<>();
        titles.add("推荐高校");
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(schoolListFragment);

        FragmentAdapter adapter = new FragmentAdapter(getChildFragmentManager(),fragmentList,titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "高校onAttact");
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}