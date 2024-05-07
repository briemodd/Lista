package com.example.lista.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lista.R;
import com.example.lista.activity.MainActivity;
import com.example.lista.model.MyItem;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter { //classe Adapter responsável por construir e preencher um item da lista do RecycleView
    MainActivity mainActivity;
    List<MyItem> itens;

    public MyAdapter(MainActivity mainActivity, List<MyItem> itens) {
        this.mainActivity = mainActivity;
        this.itens = itens;
    }

    @NonNull
    @Override
    //responsável por criar os elementos de interface para um item. elementos sao guardados em uma classe container do tipo viewholder
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        View v = inflater.inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    // recebe o viewholder criado por oncreateviewholder e preenche os elementos de UI com os dados do item
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyItem myItem = itens.get(position);
        View v = holder.itemView;

        ImageView imvfoto = v.findViewById(R.id.imvPhoto);
        imvfoto.setImageURI(myItem.photo);

        TextView tvTitle = v.findViewById(R.id.tvTitle);
        tvTitle.setText(myItem.title);

        TextView tvdesc = v.findViewById(R.id.tvDesc);
        tvdesc.setText(myItem.description);


    }

    @Override
    // informa quantos elementos a lista possui
    public int getItemCount() {
        return itens.size();
    }
}
