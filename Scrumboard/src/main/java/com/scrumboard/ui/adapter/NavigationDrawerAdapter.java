package com.scrumboard.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.scrumboard.MainActivity;
import com.scrumboard.models.modules.NavigationDrawerItem;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;

@Module(injects = MainActivity.class, complete = false, library = true)
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
        return null;
    }
}
