// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Information for a Field Value Sample
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlFieldValue_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlFieldValue_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlFieldValue_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlFieldValue_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlFieldValue_t position(long position) {
        return (nvmlFieldValue_t)super.position(position);
    }

    /** ID of the NVML field to retrieve. This must be set before any call that uses this struct. See the constants starting with NVML_FI_ above. */
    public native @Cast("unsigned int") int fieldId(); public native nvmlFieldValue_t fieldId(int setter);
    /** Currently unused. This should be initialized to 0 by the caller before any API call */
    public native @Cast("unsigned int") int unused(); public native nvmlFieldValue_t unused(int setter);
    /** CPU Timestamp of this value in microseconds since 1970 */
    public native long timestamp(); public native nvmlFieldValue_t timestamp(long setter);
    /** How long this field value took to update (in usec) within NVML. This may be averaged across several fields that are serviced by the same driver call. */
    public native long latencyUsec(); public native nvmlFieldValue_t latencyUsec(long setter);
    /** Type of the value stored in value */
    public native @Cast("nvmlValueType_t") int valueType(); public native nvmlFieldValue_t valueType(int setter);
    /** Return code for retrieving this value. This must be checked before looking at value, as value is undefined if nvmlReturn != NVML_SUCCESS */
    public native @Cast("nvmlReturn_t") int nvmlReturn(); public native nvmlFieldValue_t nvmlReturn(int setter);
    /** Value for this field. This is only valid if nvmlReturn == NVML_SUCCESS */
    public native @ByRef nvmlValue_t value(); public native nvmlFieldValue_t value(nvmlValue_t setter);
}