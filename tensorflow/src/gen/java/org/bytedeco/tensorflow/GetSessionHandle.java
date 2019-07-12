// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Store the input tensor in the state of the current session.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * value: The tensor to be stored.
 * 
 *  Returns:
 *  * {@code Output}: The handle for the tensor stored in the session state, represented
 *  as a string. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GetSessionHandle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GetSessionHandle(Pointer p) { super(p); }

  public GetSessionHandle(@Const @ByRef Scope scope, @ByVal Input value) { super((Pointer)null); allocate(scope, value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native GetSessionHandle operation(Operation setter);
  public native @ByRef Output handle(); public native GetSessionHandle handle(Output setter);
}