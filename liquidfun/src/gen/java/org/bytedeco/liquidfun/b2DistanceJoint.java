// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A distance joint constrains two points on two bodies
 *  to remain at a fixed distance from each other. You can view
 *  this as a massless, rigid rod. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2DistanceJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2DistanceJoint(Pointer p) { super(p); }


	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	/** Get the reaction force given the inverse time step.
	 *  Unit is N. */
	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);

	/** Get the reaction torque given the inverse time step.
	 *  Unit is N*m. This is always zero for a distance joint. */
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** The local anchor point relative to bodyA's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorA();

	/** The local anchor point relative to bodyB's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorB();

	/** Set/get the natural length.
	 *  Manipulating the length can lead to non-physical behavior when the frequency is zero. */
	public native void SetLength(@Cast("float32") float length);
	public native @Cast("float32") float GetLength();

	/** Set/get frequency in Hz. */
	public native void SetFrequency(@Cast("float32") float hz);
	public native @Cast("float32") float GetFrequency();

	/** Set/get damping ratio. */
	public native void SetDampingRatio(@Cast("float32") float ratio);
	public native @Cast("float32") float GetDampingRatio();

	/** Dump joint to dmLog */
	public native void Dump();
}