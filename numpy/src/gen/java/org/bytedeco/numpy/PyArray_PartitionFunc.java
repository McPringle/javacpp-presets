// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_PartitionFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_PartitionFunc(Pointer p) { super(p); }
    protected PyArray_PartitionFunc() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0, @Cast("npy_intp") long arg1, @Cast("npy_intp") long arg2,
                                    @Cast("npy_intp*") SizeTPointer arg3, @Cast("npy_intp*") SizeTPointer arg4,
                                    Pointer arg5);
}