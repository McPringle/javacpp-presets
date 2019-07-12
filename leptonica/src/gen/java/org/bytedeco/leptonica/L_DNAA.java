// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


    /** Array of double number arrays */
@Name("L_Dnaa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_DNAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_DNAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_DNAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_DNAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_DNAA position(long position) {
        return (L_DNAA)super.position(position);
    }

    /** size of allocated ptr array          */
    public native @Cast("l_int32") int nalloc(); public native L_DNAA nalloc(int setter);
    /** number of L_Dna saved                */
    public native @Cast("l_int32") int n(); public native L_DNAA n(int setter);
    /** array of L_Dna                       */
    public native L_DNA dna(int i); public native L_DNAA dna(int i, L_DNA setter);
    public native @Cast("L_Dna**") PointerPointer dna(); public native L_DNAA dna(PointerPointer setter);
}