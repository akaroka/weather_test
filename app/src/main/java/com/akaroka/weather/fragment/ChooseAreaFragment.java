package com.akaroka.weather.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.akaroka.weather.R;
import com.akaroka.weather.db.City;
import com.akaroka.weather.db.County;
import com.akaroka.weather.db.Province;

import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment{

    public static final int LEVEL_PROVINCE = 0;

    public static final int LEVEL_CITY = 1;

    public static final int LEVEL_COUNTY = 2;

    private ProgressBar progressBar;
    //todo

    private TextView titleText;

    private Button backButton;

    private ListView listView;

    private ArrayAdapter<String> adapter;

    private List<String> dataList= new ArrayList<>();

    private List<Province> provinceList;

    private List<City> cityList;

    private List<County> countyList;

    private Province selectedProvince;

    private City selectedCity;

    private int cuttentLevel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.choose__area, container, false);
        titleText = (TextView)view.findViewById(R.id.title_text);
        backButton = (Button)view.findViewById(R.id.back_button);
        listView = (ListView)view.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);
        return view;

    }

}
