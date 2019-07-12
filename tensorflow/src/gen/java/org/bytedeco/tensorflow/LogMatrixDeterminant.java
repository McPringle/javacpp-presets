// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the sign and the log of the absolute value of the determinant of
 * 
 *  one or more square matrices.
 * 
 *  The input is a tensor of shape {@code [N, M, M]} whose inner-most 2 dimensions
 *  form square matrices. The outputs are two tensors containing the signs and
 *  absolute values of the log determinants for all N input submatrices
 *  {@code [..., :, :]} such that the determinant = sign*exp(log_abs_determinant).
 *  The log_abs_determinant is computed as det(P)*sum(log(diag(LU))) where LU
 *  is the LU decomposition of the input and P is the corresponding
 *  permutation matrix.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Shape is {@code [N, M, M]}.
 * 
 *  Returns:
 *  * {@code Output} sign: The signs of the log determinants of the inputs. Shape is {@code [N]}.
 *  * {@code Output} log_abs_determinant: The logs of the absolute values of the determinants
 *  of the N input matrices.  Shape is {@code [N]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LogMatrixDeterminant extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogMatrixDeterminant(Pointer p) { super(p); }

  public LogMatrixDeterminant(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);

  public native @ByRef Operation operation(); public native LogMatrixDeterminant operation(Operation setter);
  public native @ByRef Output sign(); public native LogMatrixDeterminant sign(Output setter);
  public native @ByRef Output log_abs_determinant(); public native LogMatrixDeterminant log_abs_determinant(Output setter);
}