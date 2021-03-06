package com.github.timeu.dygraphsgwt.client.callbacks;


import jsinterop.annotations.JsFunction;

/**
 * Created by uemit.seren on 7/29/15.
 */
@FunctionalInterface
@JsFunction
public interface DataFunction<T> {

    /**
     * Function that returns any valid data (String, URL, DataTable or Array)
     *
     * @return  String | URL | DataTable | Array
     */
    T apply();
}
