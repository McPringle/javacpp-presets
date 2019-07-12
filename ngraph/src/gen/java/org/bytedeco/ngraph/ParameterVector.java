// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Name("std::vector<std::shared_ptr<ngraph::op::Parameter> >") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class ParameterVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParameterVector(Pointer p) { super(p); }
    public ParameterVector(Parameter value) { this(1); put(0, value); }
    public ParameterVector(Parameter ... array) { this(array.length); put(array); }
    public ParameterVector()       { allocate();  }
    public ParameterVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef ParameterVector put(@ByRef ParameterVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr Parameter get(@Cast("size_t") long i);
    public native ParameterVector put(@Cast("size_t") long i, Parameter value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr Parameter value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @SharedPtr @Const Parameter get();
    }

    public Parameter[] get() {
        Parameter[] array = new Parameter[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Parameter pop_back() {
        long size = size();
        Parameter value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ParameterVector push_back(Parameter value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ParameterVector put(Parameter value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ParameterVector put(Parameter ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}
