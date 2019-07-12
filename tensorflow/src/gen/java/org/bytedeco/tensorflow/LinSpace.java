// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Generates values in an interval.
 * 
 *  A sequence of {@code num} evenly-spaced values are generated beginning at {@code start}.
 *  If {@code num > 1}, the values in the sequence increase by {@code stop - start / num - 1},
 *  so that the last one is exactly {@code stop}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  tf.linspace(10.0, 12.0, 3, name="linspace") => [ 10.0  11.0  12.0]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * start: 0-D tensor. First entry in the range.
 *  * stop: 0-D tensor. Last entry in the range.
 *  * num: 0-D tensor. Number of values to generate.
 * 
 *  Returns:
 *  * {@code Output}: 1-D. The generated values. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LinSpace extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LinSpace(Pointer p) { super(p); }

  public LinSpace(@Const @ByRef Scope scope, @ByVal Input start,
           @ByVal Input stop, @ByVal Input num) { super((Pointer)null); allocate(scope, start, stop, num); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input start,
           @ByVal Input stop, @ByVal Input num);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native LinSpace operation(Operation setter);
  public native @ByRef Output output(); public native LinSpace output(Output setter);
}