package com.example.pokestar.universityset.School;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokestar.universityset.Adapter.SchoolAdapter;
import com.example.pokestar.universityset.Data.School;
import com.example.pokestar.universityset.Fragment.HomePage.HotTopicFragment;
import com.example.pokestar.universityset.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shinelon on 2018/6/8.
 */

public class SchoolListFragment extends Fragment {
    private RecyclerView recyclerView;
    private SchoolAdapter schoolAdapter;
    private List<School> schoolList = new ArrayList<>();

    public static SchoolListFragment newInstance(String param1, String param2) {
        SchoolListFragment fragment = new SchoolListFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school_list,container,false);
        initSchool();
        recyclerView = (RecyclerView)view.findViewById(R.id.school_recycler_view);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void initSchool() {

        for (int i = 0; i < 5; i++) {
            School NUC = new School("中北大学", "中北大学（North University of China" +
                    "），简称“中北”（NUC），位于山西省太原市，是中华人民共和国国家国防科技工业局与" +
                    "山西省人民政府共建的综合性教学研究型大学，位列中西部高校基础能力建设工程、卓越" +
                    "工程师教育培养计划，入选海外高层次人才引进计划、国家高层次人才特殊支持计划、百" +
                    "千万人才工程，是山西省重点建设高校。",R.drawable.zbdx);
            schoolList.add(NUC);
//            School TUT = new School("太原理工大学", "太原理工大学（Taiyuan University" +
//                    " of Technology, TUT），简称“太原理工”，位于山西省会太原市，位列国家“211工程" +
//                    "”、世界一流学科建设高校 [1]  。学校理工科优势明显，是教育部首批61所“卓越工程" +
//                    "师教育培养计划”实施高校。",R.drawable.tylgdx);
//            schoolList.add(TUT);
//            School ShangXiUniversity = new School("山西大学", "山西大学（Shanxi Unive" +
//                    "rsity），位于山西省会太原市，是教育部与山西省人民政府重点合建的综合研究型大学" +
//                    "，中西部十四所国家重点建设大学之一，入选“中西部高校综合实力提升工程”、" +
//                    "“中西部高校基础能力建设工程”。",R.drawable.sxdx);
//            schoolList.add(ShangXiUniversity);
//            School ShangXiYiKeDa = new School("山西医科大学", "山西医科大学（Shanxi " +
//                    "Medical University）位于山西省省会太原市，是一所以医学为主， 多学科协调发展的" +
//                    "医科大学，拥有本科与研究生医学高等教育为主的多层次人才培养体系，“卓越医生教育培" +
//                    "养计划”试点高校，中俄医科大学联盟第一批成员。山西医科大学前身是由民国时期时任" +
//                    "山西省都督阎锡山创办的山西医学传习所，建校于1919年。",R.drawable.sxykdx);
//            schoolList.add(ShangXiYiKeDa);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        schoolAdapter = new SchoolAdapter(schoolList);
        recyclerView.setAdapter(schoolAdapter);
    }
}
