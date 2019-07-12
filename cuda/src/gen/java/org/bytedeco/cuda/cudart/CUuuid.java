// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;

@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUuuid extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUuuid() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUuuid(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUuuid(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUuuid position(long position) {
        return (CUuuid)super.position(position);
    }

    public native @Cast("char") byte bytes(int i); public native CUuuid bytes(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer bytes();
}