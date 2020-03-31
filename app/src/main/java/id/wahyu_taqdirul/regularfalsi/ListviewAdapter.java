package id.haqiqi_studio.regularfalsi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {

    public ArrayList<Model> productList;
    Activity activity;

    public ListviewAdapter(Activity activity, ArrayList<Model> productList) {
        super();
        this.activity = activity;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView mNo;
        TextView mFa;
        TextView mFb;
        TextView mC;
        TextView mFc;
        TextView mErc;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_row, null);
            holder = new ViewHolder();
            holder.mNo = (TextView) convertView.findViewById(R.id.txtNo);
            holder.mFa = (TextView) convertView.findViewById(R.id.txtFA);
            holder.mFb = (TextView) convertView.findViewById(R.id.txtFB);
            holder.mC = (TextView) convertView.findViewById(R.id.txtC);
            holder.mFc = (TextView) convertView.findViewById(R.id.txtFC);
            holder.mErc = (TextView) convertView.findViewById(R.id.txtERC);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Model item = productList.get(position);
        holder.mNo.setText(String.valueOf(item.getNo()));
        holder.mFa.setText(String.valueOf(item.getFa()));
        holder.mFb.setText(String.valueOf(item.getFb()));
        holder.mC.setText(String.valueOf(item.getC()));
        holder.mFc.setText(String.valueOf(item.getFc()));
        holder.mErc.setText(String.valueOf(item.getErc()));

        return convertView;
    }
}