package id.haqiqi_studio.regularfalsi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListSecant extends BaseAdapter {

    public ArrayList<ModelSecant> list;
    Activity activity;

    public ListSecant(Activity activity, ArrayList<ModelSecant> list) {
        super();
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView mNo;
        TextView mN;
        TextView mXn;
        TextView mXn1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.secant_row, null);
            holder = new ViewHolder();
            holder.mNo = (TextView) convertView.findViewById(R.id.txtNo);
            holder.mN = (TextView) convertView.findViewById(R.id.txtN);
            holder.mXn = (TextView) convertView.findViewById(R.id.txtFXN);
            holder.mXn1 = (TextView) convertView.findViewById(R.id.txtFXN1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ModelSecant item = list.get(position);
        holder.mNo.setText(String.valueOf(item.getNo()));
        holder.mN.setText(String.valueOf(item.getXn()));
        holder.mXn.setText(String.valueOf(item.getFxn()));
        holder.mXn1.setText(String.valueOf(item.getFxn1()));

        return convertView;
    }
}