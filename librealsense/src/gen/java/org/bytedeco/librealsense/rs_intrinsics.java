// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


/* Video stream intrinsics */
@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_intrinsics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs_intrinsics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs_intrinsics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_intrinsics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs_intrinsics position(long position) {
        return (rs_intrinsics)super.position(position);
    }

    /** width of the image in pixels */
    public native int width(); public native rs_intrinsics width(int setter);
    /** height of the image in pixels */
    public native int height(); public native rs_intrinsics height(int setter);
    /** horizontal coordinate of the principal point of the image, as a pixel offset from the left edge */
    public native float ppx(); public native rs_intrinsics ppx(float setter);
    /** vertical coordinate of the principal point of the image, as a pixel offset from the top edge */
    public native float ppy(); public native rs_intrinsics ppy(float setter);
    /** focal length of the image plane, as a multiple of pixel width */
    public native float fx(); public native rs_intrinsics fx(float setter);
    /** focal length of the image plane, as a multiple of pixel height */
    public native float fy(); public native rs_intrinsics fy(float setter);
    /** distortion model of the image */
    public native @Cast("rs_distortion") int model(); public native rs_intrinsics model(int setter);
    /** distortion coefficients */
    public native float coeffs(int i); public native rs_intrinsics coeffs(int i, float setter);
    @MemberGetter public native FloatPointer coeffs();
}