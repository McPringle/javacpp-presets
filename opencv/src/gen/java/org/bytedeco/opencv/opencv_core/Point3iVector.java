// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::Point3i>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3iVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3iVector(Pointer p) { super(p); }
    public Point3iVector(Point3i value) { this(1); put(0, value); }
    public Point3iVector(Point3i ... array) { this(array.length); put(array); }
    public Point3iVector()       { allocate();  }
    public Point3iVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point3iVector put(@ByRef Point3iVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Point3i get(@Cast("size_t") long i);
    public native Point3iVector put(@Cast("size_t") long i, Point3i value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Point3i value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @ByRef @Const Point3i get();
    }

    public Point3i[] get() {
        Point3i[] array = new Point3i[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point3i pop_back() {
        long size = size();
        Point3i value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Point3iVector push_back(Point3i value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Point3iVector put(Point3i value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Point3iVector put(Point3i ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}
