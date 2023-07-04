package com.example.news100.NewsGroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.news100.Adapters.Adaptertwo;
import com.example.news100.Apiutilities;
import com.example.news100.MainNews;
import com.example.news100.ModelA;
import com.example.news100.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class F_entertainment extends Fragment {


    String api = "abe79a4cdb114df39a365d88403c659c";
    ArrayList<ModelA> modelclassarraylist;
    Adaptertwo adaptertwo;
    String country = "in";
    private RecyclerView rv22;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank_b, null);


        rv22 = v.findViewById(R.id.rv22b);
        modelclassarraylist = new ArrayList<>();
        rv22.setLayoutManager(new LinearLayoutManager(getContext()));
        adaptertwo = new Adaptertwo(getContext(), modelclassarraylist);
        rv22.setAdapter(adaptertwo);

        findnews();


        return v;


    }

    private void findnews() {


        Apiutilities.getApiInterface().getNews(country, 100, api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {


                if (response.isSuccessful()) {

                    modelclassarraylist.addAll(response.body().getArticles());
                    adaptertwo.notifyDataSetChanged();
                }


            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });


    }
}