package com.github.timeu.dygraphsgwt.client.options.interactions;

import com.github.timeu.dygraphsgwt.client.DygraphsJs;
import com.google.gwt.core.client.js.JsFunction;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;

/**
 * Created by uemit.seren on 7/30/15.
 */
@FunctionalInterface
@JsFunction
public interface MouseMoveHandler {

    /**
     * Called when mouse is moved.
     *
     * @param event {@link NativeEvent}
     * @param dygraphsjs {@link DygraphsJs}
     * @param context {@link InteractionContext}
     */
    void onMouseMove(NativeEvent event,DygraphsJs dygraphsjs,InteractionContext context);
}
