// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Stub exposure compensator which does nothing.
 */
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class NoExposureCompensator extends ExposureCompensator {
    static { Loader.load(); }
    /** Default native constructor. */
    public NoExposureCompensator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NoExposureCompensator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoExposureCompensator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NoExposureCompensator position(long position) {
        return (NoExposureCompensator)super.position(position);
    }

    public native void feed(@Const @ByRef PointVector arg0, @Const @ByRef UMatVector arg1,
                  @Const @ByRef UMatBytePairVector arg2);
    public native void apply(int arg0, @ByVal Point arg1, @ByVal Mat arg2, @ByVal Mat arg3);
    public native void apply(int arg0, @ByVal Point arg1, @ByVal UMat arg2, @ByVal UMat arg3);
    public native void apply(int arg0, @ByVal Point arg1, @ByVal GpuMat arg2, @ByVal GpuMat arg3);
    public native void getMatGains(@ByRef MatVector umv);
    public native void setMatGains(@ByRef MatVector umv);
}