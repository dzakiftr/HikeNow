package com.example.hikenow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class destinasiadapter extends ArrayAdapter<DataDestinasi> {

    Context context;
    int resource;

    public destinasiadapter(Context context, int resource)
    {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Holder holder = null;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            holder = new Holder();
            holder.imageView = convertView.findViewById(R.id.destinationpic);
            holder.txtdurasi = convertView.findViewById(R.id.durasi);
            holder.txtGunung = convertView.findViewById(R.id.gunung);
            holder.txtTinggi = convertView.findViewById(R.id.tinggi);
            holder.txtHarga = convertView.findViewById(R.id.harga);
            convertView.setTag(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }

        holder.txtdurasi.setText(getItem(position).getdurasi());
        holder.txtGunung.setText(getItem(position).getgunung());
        holder.txtTinggi.setText(getItem(position).gettinggi());
        holder.txtHarga.setText(getItem(position).getharga());

        new getimageurl(holder.imageView).execute(getItem(position).imageUrl);
        return convertView;
    }


    class Holder {
        ImageView imageView;
        TextView txtdurasi;
        TextView txtGunung;
        TextView txtTinggi;
        TextView txtHarga;
    }
}
