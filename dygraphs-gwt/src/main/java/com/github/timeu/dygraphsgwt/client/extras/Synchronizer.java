package com.github.timeu.dygraphsgwt.client.extras;

import com.google.gwt.core.client.js.JsType;

/**
 * Created by uemit.seren on 8/3/15.
 */
@JsType
public interface Synchronizer {

    /**
     * Call if you want to detach the synchronized Dygraph instances
     */
    void detach();
}
