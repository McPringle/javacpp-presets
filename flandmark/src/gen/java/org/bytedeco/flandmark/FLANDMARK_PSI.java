// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.flandmark.global.flandmark.*;


@Properties(inherit = org.bytedeco.flandmark.presets.flandmark.class)
public class FLANDMARK_PSI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLANDMARK_PSI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLANDMARK_PSI(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLANDMARK_PSI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLANDMARK_PSI position(long position) {
        return (FLANDMARK_PSI)super.position(position);
    }

    public native @Cast("char*") BytePointer data(); public native FLANDMARK_PSI data(BytePointer setter);
    public native @Cast("uint32_t") int PSI_ROWS(); public native FLANDMARK_PSI PSI_ROWS(int setter);
    public native @Cast("uint32_t") int PSI_COLS(); public native FLANDMARK_PSI PSI_COLS(int setter);
}