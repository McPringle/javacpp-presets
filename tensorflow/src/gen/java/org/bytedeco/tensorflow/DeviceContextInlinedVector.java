// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::DeviceContext*,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceContextInlinedVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceContextInlinedVector(Pointer p) { super(p); }
    public DeviceContextInlinedVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef DeviceContextInlinedVector put(@ByRef DeviceContextInlinedVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native DeviceContext get(@Cast("size_t") long i);
    public native DeviceContextInlinedVector put(@Cast("size_t") long i, DeviceContext value);
}
