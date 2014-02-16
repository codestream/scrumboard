package com.scrumboard;

import android.app.Application;

import com.scrumboard.models.modules.NavigationDrawerItem;
import com.scrumboard.ui.adapter.NavigationDrawerAdapter;
import com.scrumboard.util.Injector;

/**
 * Created by 1 on 15.02.14.
 */
public class ScrumBoardApplication extends Application {

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();

        Object[] modules = new Object[]{
                new NavigationDrawerItem(),
                new NavigationDrawerAdapter()
        };

        Injector.inject(modules);
    }
}
