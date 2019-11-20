// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the eigen decomposition of one or more square self-adjoint matrices.
 * 
 *  Computes the eigenvalues and (optionally) eigenvectors of each inner matrix in
 *  {@code input} such that {@code input[..., :, :] = v[..., :, :] * diag(e[..., :])}. The eigenvalues
 *  are sorted in non-decreasing order.
 * 
 *  <pre>{@code python
 *  # a is a tensor.
 *  # e is a tensor of eigenvalues.
 *  # v is a tensor of eigenvectors.
 *  e, v = self_adjoint_eig(a)
 *  e = self_adjoint_eig(a, compute_v=False)
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: {@code Tensor} input of shape {@code [N, N]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * compute_v: If {@code True} then eigenvectors will be computed and returned in {@code v}.
 *  Otherwise, only the eigenvalues will be computed.
 * 
 *  Returns:
 *  * {@code Output} e: Eigenvalues. Shape is {@code [N]}.
 *  * {@code Output} v: Eigenvectors. Shape is {@code [N, N]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SelfAdjointEig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SelfAdjointEig(Pointer p) { super(p); }

  /** Optional attribute setters for SelfAdjointEig */
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
  
    /** If {@code True} then eigenvectors will be computed and returned in {@code v}.
     *  Otherwise, only the eigenvalues will be computed.
     * 
     *  Defaults to true */
    public native @ByVal Attrs ComputeV(@Cast("bool") boolean x);

    public native @Cast("bool") boolean compute_v_(); public native Attrs compute_v_(boolean setter);
  }
  public SelfAdjointEig(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public SelfAdjointEig(@Const @ByRef Scope scope, @ByVal Input input,
                 @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs ComputeV(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SelfAdjointEig operation(Operation setter);
  public native @ByRef Output e(); public native SelfAdjointEig e(Output setter);
  public native @ByRef Output v(); public native SelfAdjointEig v(Output setter);
}