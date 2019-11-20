// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Class used to call CollectiveRegistry::Register.  This should only be used to
// create a global static object.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveRegistration extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveRegistration(Pointer p) { super(p); }

  public CollectiveRegistration(@StdString BytePointer collective_name,
                           @ByVal @Cast("tensorflow::CollectiveRegistry::Factory*") Pointer factory) { super((Pointer)null); allocate(collective_name, factory); }
  private native void allocate(@StdString BytePointer collective_name,
                           @ByVal @Cast("tensorflow::CollectiveRegistry::Factory*") Pointer factory);
  public CollectiveRegistration(@StdString String collective_name,
                           @ByVal @Cast("tensorflow::CollectiveRegistry::Factory*") Pointer factory) { super((Pointer)null); allocate(collective_name, factory); }
  private native void allocate(@StdString String collective_name,
                           @ByVal @Cast("tensorflow::CollectiveRegistry::Factory*") Pointer factory);
}