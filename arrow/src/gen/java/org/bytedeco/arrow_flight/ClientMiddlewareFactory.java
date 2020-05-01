// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;

@Namespace("arrow::flight") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class ClientMiddlewareFactory extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ClientMiddlewareFactory() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClientMiddlewareFactory(Pointer p) { super(p); }
}