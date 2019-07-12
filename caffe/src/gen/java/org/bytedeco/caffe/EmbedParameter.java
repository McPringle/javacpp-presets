// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class EmbedParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbedParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EmbedParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EmbedParameter position(long position) {
        return (EmbedParameter)super.position(position);
    }

  public EmbedParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public EmbedParameter(@Const @ByRef EmbedParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef EmbedParameter from);

  public native @ByRef @Name("operator =") EmbedParameter put(@Const @ByRef EmbedParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef EmbedParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const EmbedParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(EmbedParameter other);
  

  // implements Message ----------------------------------------------

  public native final EmbedParameter New();

  public native final EmbedParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef EmbedParameter from);
  public native void MergeFrom(@Const @ByRef EmbedParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .caffe.FillerParameter weight_filler = 4;
  public native @Cast("bool") boolean has_weight_filler();
  public native void clear_weight_filler();
  @MemberGetter public static native int kWeightFillerFieldNumber();
  public static final int kWeightFillerFieldNumber = kWeightFillerFieldNumber();
  public native @Const @ByRef FillerParameter weight_filler();
  public native FillerParameter release_weight_filler();
  public native FillerParameter mutable_weight_filler();
  public native void set_allocated_weight_filler(FillerParameter weight_filler);

  // optional .caffe.FillerParameter bias_filler = 5;
  public native @Cast("bool") boolean has_bias_filler();
  public native void clear_bias_filler();
  @MemberGetter public static native int kBiasFillerFieldNumber();
  public static final int kBiasFillerFieldNumber = kBiasFillerFieldNumber();
  public native @Const @ByRef FillerParameter bias_filler();
  public native FillerParameter release_bias_filler();
  public native FillerParameter mutable_bias_filler();
  public native void set_allocated_bias_filler(FillerParameter bias_filler);

  // optional uint32 num_output = 1;
  public native @Cast("bool") boolean has_num_output();
  public native void clear_num_output();
  @MemberGetter public static native int kNumOutputFieldNumber();
  public static final int kNumOutputFieldNumber = kNumOutputFieldNumber();
  public native @Cast("google::protobuf::uint32") int num_output();
  public native void set_num_output(@Cast("google::protobuf::uint32") int value);

  // optional uint32 input_dim = 2;
  public native @Cast("bool") boolean has_input_dim();
  public native void clear_input_dim();
  @MemberGetter public static native int kInputDimFieldNumber();
  public static final int kInputDimFieldNumber = kInputDimFieldNumber();
  public native @Cast("google::protobuf::uint32") int input_dim();
  public native void set_input_dim(@Cast("google::protobuf::uint32") int value);

  // optional bool bias_term = 3 [default = true];
  public native @Cast("bool") boolean has_bias_term();
  public native void clear_bias_term();
  @MemberGetter public static native int kBiasTermFieldNumber();
  public static final int kBiasTermFieldNumber = kBiasTermFieldNumber();
  public native @Cast("bool") boolean bias_term();
  public native void set_bias_term(@Cast("bool") boolean value);
}