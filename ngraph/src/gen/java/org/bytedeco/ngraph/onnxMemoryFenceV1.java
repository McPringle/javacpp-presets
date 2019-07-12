// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxMemoryFenceV1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public onnxMemoryFenceV1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public onnxMemoryFenceV1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxMemoryFenceV1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public onnxMemoryFenceV1 position(long position) {
        return (onnxMemoryFenceV1)super.position(position);
    }

  /**
   * 32-bit tag needed to distinguish different versions of a memory fence
   * structure. In the onnxMemoryFenceV1 structure, the tag MUST be set to
   * ONNXIFI_TAG_MEMORY_FENCE_V1. If ONNXIFI introduce a new version of the
   * memory fence structure in the future, it WILL have 32-bit tag with a
   * different value as the first member of the structure.
   *
   * ONNXIFI implementations MUST validate tag before accessing any other
   * members of the structure.
   */
  public native @Cast("int32_t") int tag(); public native onnxMemoryFenceV1 tag(int setter);
  /**
   * Type of memory synchronization primitive.
   *
   * Possible values:
   *      ONNXIFI_SYNCHRONIZATION_EVENT    (onnxEvent, always supported)
   *      ONNXIFI_SYNCHRONIZATION_IMPLICIT
   */
  public native @Cast("onnxEnum") int type(); public native onnxMemoryFenceV1 type(int setter);
    /**
     * Handle for a single-shot ONNXIFI event used as a synchronization
     * primitive. Event for the input fence must be created by the caller to
     * onnxRunGraph. Event for the output fence is created by implementation of
     * onnxRunGraph, and stored into the output memory fence structure before
     * onnxRunGraph returns.
     */
    public native onnxEvent event(); public native onnxMemoryFenceV1 event(onnxEvent setter);
}