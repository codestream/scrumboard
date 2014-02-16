package com.scrumboard.models.modules;

public class NavigationDrawerItem {

    private String mDrawerItemTitle;
    private int mDrawerItemIcon;
    private String mCount = "0";
    // boolean to set visibility of the counter
    private boolean isCounterVisible = false;

    public NavigationDrawerItem(){}

    public NavigationDrawerItem(String title, int icon, boolean isCounterVisible, String count){
        this.mDrawerItemTitle = title;
        this.mDrawerItemIcon = icon;
        this.isCounterVisible = isCounterVisible;
        this.mCount = count;
    }

    public NavigationDrawerItem(String title, int icon){
        this.mDrawerItemTitle = title;
        this.mDrawerItemIcon = icon;
    }

    public String getDrawerItemTitle() {
        return mDrawerItemTitle;
    }

    public void setDrawerItemTitle(String mDrawerItemTitle) {
        this.mDrawerItemTitle = mDrawerItemTitle;
    }

    public int getDrawerItemIcon() {
        return mDrawerItemIcon;
    }

    public void setDrawerItemIcon(int mDrawerItemIcon) {
        this.mDrawerItemIcon = mDrawerItemIcon;
    }

    public String getCount() {
        return mCount;
    }

    public void setCount(String mCount) {
        this.mCount = mCount;
    }

    public boolean isCounterVisible() {
        return isCounterVisible;
    }

    public void setCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NavigationDrawerItem)) return false;

        NavigationDrawerItem that = (NavigationDrawerItem) o;

        if (isCounterVisible != that.isCounterVisible) return false;
        if (mDrawerItemIcon != that.mDrawerItemIcon) return false;
        if (!mCount.equals(that.mCount)) return false;
        if (!mDrawerItemTitle.equals(that.mDrawerItemTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mDrawerItemTitle.hashCode();
        result = 31 * result + mDrawerItemIcon;
        result = 31 * result + mCount.hashCode();
        result = 31 * result + (isCounterVisible ? 1 : 0);
        return result;
    }
}
