// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Defines a barrier that persists across different graph executions.
 * 
 *  A barrier represents a key-value map, where each key is a string, and
 *  each value is a tuple of tensors.
 * 
 *  At runtime, the barrier contains 'complete' and 'incomplete'
 *  elements. A complete element has defined tensors for all components of
 *  its value tuple, and may be accessed using BarrierTakeMany. An
 *  incomplete element has some undefined components in its value tuple,
 *  and may be updated using BarrierInsertMany.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * component_types: The type of each component in a value.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * shapes: The shape of each component in a value. Each shape must be 1 in the
 *  first dimension. The length of this attr must be the same as the length of
 *  component_types.
 *  * capacity: The capacity of the barrier.  The default capacity is MAX_INT32,
 *  which is the largest capacity of the underlying queue.
 *  * container: If non-empty, this barrier is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this barrier will be shared under the given name
 *  across multiple sessions.
 * 
 *  Returns:
 *  * {@code Output}: The handle to the barrier. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Barrier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Barrier(Pointer p) { super(p); }

  /** Optional attribute setters for Barrier */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** The shape of each component in a value. Each shape must be 1 in the
     *  first dimension. The length of this attr must be the same as the length of
     *  component_types.
     * 
     *  Defaults to [] */
    
    ///
    public native @ByVal Attrs Shapes(@ArraySlice PartialTensorShape x);

    /** The capacity of the barrier.  The default capacity is MAX_INT32,
     *  which is the largest capacity of the underlying queue.
     * 
     *  Defaults to -1 */
    
    ///
    public native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);

    /** If non-empty, this barrier is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this barrier will be shared under the given name
     *  across multiple sessions.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @ArraySlice PartialTensorShape shapes_(); public native Attrs shapes_(PartialTensorShape setter);
    public native @Cast("tensorflow::int64") long capacity_(); public native Attrs capacity_(long setter);
    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public Barrier(@Const @ByRef Scope scope, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types) { super((Pointer)null); allocate(scope, component_types); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types);
  public Barrier(@Const @ByRef Scope scope, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types,
          @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, component_types, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types,
          @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Shapes(@ArraySlice PartialTensorShape x);
  public static native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native Barrier operation(Operation setter);
  public native @ByRef Output handle(); public native Barrier handle(Output setter);
}