package com.scrumboard.util;

import dagger.ObjectGraph;

public final class Injector {
    private static ObjectGraph mObjectGraph = null;

    public static void init(final Object... modules) {

        if(mObjectGraph == null){
            mObjectGraph = ObjectGraph.create(modules);
        }
        else{
            mObjectGraph = mObjectGraph.plus(modules);
        }

        // Inject statics
        mObjectGraph.injectStatics();
    }

    public static void inject(final Object target){
        mObjectGraph.inject(target);
    }

    public static <T> T resolve(Class<T> type){
        return mObjectGraph.get(type);
    }
}
