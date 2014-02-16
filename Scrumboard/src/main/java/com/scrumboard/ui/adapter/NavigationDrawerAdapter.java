package com.scrumboard.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.scrumboard.R;
import com.scrumboard.models.modules.NavigationDrawerItem;
import com.scrumboard.ui.widget.RobotoTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NavigationDrawerAdapter extends BaseAdapter {
    private Context mApplicationContext;
    private List<NavigationDrawerItem> mNavigationDrawerItems;

    public NavigationDrawerAdapter(){}

    public NavigationDrawerAdapter(Context context, ArrayList<NavigationDrawerItem> items){
        this.mApplicationContext = context;
        this.mNavigationDrawerItems = items;
    }

    @Override
    public int getCount() {
        return mNavigationDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mNavigationDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater mInflater = (LayoutInflater)
                    mApplicationContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.drawer_layout_items, null);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.mTitle.setText(mNavigationDrawerItems.get(position).getDrawerItemTitle());

        // displaying count
        // check whether it set visible or not
        if(mNavigationDrawerItems.get(position).isCounterVisible()){
            viewHolder.mCounter.setText(mNavigationDrawerItems.get(position).getCount());
        } else {
            // hide the counter view
            viewHolder.mCounter.setVisibility(View.GONE);
        }

        return view;
    }

    class ViewHolder {
        @InjectView(R.id.counter)
        RobotoTextView mCounter;
        @InjectView(R.id.title)
        RobotoTextView mTitle;

        ViewHolder(View view){
            ButterKnife.inject(this, view);
        }
    }
}
