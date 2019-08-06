package com.example.geta;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Model.Task;
import Services.TaskAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class TaskFragment extends Fragment {

    RecyclerView mRecyclerView;
    private TaskAdapter mAdapter;

    public TaskFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_task, container, false);

        mRecyclerView =  v.findViewById(R.id.my_recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        // Adiciona o adapter que irá anexar os objetos à lista.
        // Está sendo criado com lista vazia, pois será preenchida posteriormente.

        ArrayList<Task> task = new ArrayList<>();

        /*Task l = new Task(1,"Minha primeira Tarefa","segunda","15:45",1,1,false,1,"24/05/2019");
        task.add(l);
        task.add(l);
        task.add(l);
        task.add(l);*/
        Conexao c = new Conexao();

        c.loadTasks(getActivity());

        mAdapter = new TaskAdapter(c.getTasks());
        mRecyclerView.setAdapter(mAdapter);

        // Configurando um dividr entre linhas, para uma melhor visualização.
        mRecyclerView.addItemDecoration(
                new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));


        return v;
    }

}
