// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Checks whether a tensor has been initialized.
 * 
 *  Outputs boolean scalar indicating whether the tensor has been initialized.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: Should be from a {@code Variable} node. May be uninitialized.
 * 
 *  Returns:
 *  * {@code Output}: The is_initialized tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IsVariableInitialized extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IsVariableInitialized(Pointer p) { super(p); }

  public IsVariableInitialized(@Const @ByRef Scope scope, @ByVal Input ref) { super((Pointer)null); allocate(scope, ref); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native IsVariableInitialized operation(Operation setter);
  public native @ByRef Output is_initialized(); public native IsVariableInitialized is_initialized(Output setter);
}