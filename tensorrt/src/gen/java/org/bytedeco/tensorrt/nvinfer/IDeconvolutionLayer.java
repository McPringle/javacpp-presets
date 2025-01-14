// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IDeconvolutionLayer
 * 
 *  \brief A deconvolution layer in a network definition.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IDeconvolutionLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDeconvolutionLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the HW kernel size of the convolution.
     * 
     *  If executing this layer on DLA, both height and width of kernel size must be in the range [1,32], or the
     *  combinations of [64, 96, 128] in one dimension and 1 in the other dimensions, i.e. [1x64] or [64x1] are valid,
     *  but not [64x64].
     * 
     *  @see getKernelSize()
     * 
     *  @deprecated Superseded by setKernelSizeNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setKernelSize(@ByVal DimsHW kernelSize);

    /**
     *  \brief Get the HW kernel size of the deconvolution.
     * 
     *  @see setKernelSize()
     * 
     *  @deprecated Superseded by getKernelSizeNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getKernelSize();

    /**
     *  \brief Set the number of output feature maps for the deconvolution.
     * 
     *  If executing this layer on DLA, the number of output maps must be in the range [1,8192].
     * 
     *  @see getNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setNbOutputMaps(int nbOutputMaps);

    /**
     *  \brief Get the number of output feature maps for the deconvolution.
     * 
     *  @see setNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOutputMaps();

    /**
     *  \brief Get the stride of the deconvolution.
     * 
     *  If executing this layer on DLA, both height and width of stride must be in the range [1,32] or the combinations
     *  of [64, 96, 128] in one dimension and 1 in the other dimensions, i.e. [1x64] or [64x1] are valid, but not
     *  [64x64].
     * 
     *  @see setStride()
     * 
     *  @deprecated Superseded by setStrideNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setStride(@ByVal DimsHW stride);

    /**
     *  \brief Get the stride of the deconvolution.
     * 
     *  Default: (1,1)
     * 
     *  @deprecated Superseded by getStrideNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getStride();

    /**
     *  \brief Set the padding of the deconvolution.
     * 
     *  The output will be trimmed by this number of elements on each side in the height and width directions.
     *  In other words, it resembles the inverse of a convolution layer with this padding size.
     *  Padding is symmetric, and negative padding is not supported.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be 0.
     * 
     *  @see getPadding()
     * 
     *  @deprecated Superseded by setPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding of the deconvolution.
     * 
     *  Default: (0, 0)
     * 
     *  @see setPadding()
     * 
     *  @deprecated Superseded by getPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getPadding();

    /**
     *  \brief Set the number of groups for a deconvolution.
     * 
     *  The input tensor channels are divided into \p nbGroups groups, and a deconvolution is executed for each group,
     *  using a filter per group. The results of the group convolutions are concatenated to form the output.
     * 
     *  If executing this layer on DLA, nbGroups must be one
     * 
     *  \note When using groups in int8 mode, the size of the groups (i.e. the channel count divided by the group count)
     *  must be a multiple of 4 for both input and output.
     * 
     *  Default: 1
     * 
     *  @see getNbGroups()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setNbGroups(int nbGroups);

    /**
     *  \brief Get the number of groups for a deconvolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbGroups();

    /**
     *  \brief Set the kernel weights for the deconvolution.
     * 
     *  The weights are specified as a contiguous array in \p CKRS order, where \p C the number of
     *  input channels, \p K the number of output feature maps, and \p R and \p S are the height and width
     *  of the filter.
     * 
     *  @see getWeights()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setKernelWeights(@ByVal Weights weights);

    /**
     *  \brief Get the kernel weights for the deconvolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getKernelWeights();

    /**
     *  \brief Set the bias weights for the deconvolution.
     * 
     *  Bias is optional. To omit bias, set the count value of the weights structure to zero.
     * 
     *  The bias is applied per-feature-map, so the number of weights (if non-zero) must be equal to the number of
     *  output feature maps.
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setBiasWeights(@ByVal Weights weights);

    /**
     *  \brief Get the bias weights for the deconvolution.
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getBiasWeights();

    /**
     *  \brief Set the multi-dimension pre-padding of the deconvolution.
     * 
     *  The output will be trimmed by this number of elements on the start of every dimension.
     *  In other words, it resembles the inverse of a convolution layer with this padding size.
     *  Negative padding is not supported.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, padding must be 0.
     * 
     *  @see getPrePadding()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setPrePadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the pre-padding.
     * 
     *  @see setPrePadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPrePadding();

    /**
     *  \brief Set the multi-dimension post-padding of the deconvolution.
     * 
     *  The output will be trimmed by this number of elements on the end of every dimension.
     *  In other words, it resembles the inverse of a convolution layer with this padding size.
     *  Negative padding is not supported.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, padding must be 0.
     * 
     *  @see getPostPadding()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setPostPadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the padding.
     * 
     *  @see setPostPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPostPadding();

    /**
     *  \brief Set the padding mode.
     * 
     *  Padding mode takes precedence if both setPaddingMode and setPre/PostPadding are used.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see getPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPaddingMode(PaddingMode paddingMode);
    public native @NoException(true) void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);

    /**
     *  \brief Get the padding mode.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see setPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) PaddingMode getPaddingMode();

    /**
     *  \brief Set the multi-dimension kernel size of the deconvolution.
     * 
     *  If executing this layer on DLA, only support 2D kernel size, both height and width of kernel size must be in
     *  the range [1-32].
     * 
     *  @see getKernelSizeNd() setKernelSize() getKernelSize()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setKernelSizeNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 kernelSize);

    /**
     *  \brief Get the multi-dimension kernel size of the deconvolution.
     * 
     *  @see setKernelSizeNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getKernelSizeNd();

    /**
     *  \brief Set the multi-dimension stride of the deconvolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D stride, both height and width of stride must be in the range
     *  [1-32].
     * 
     *  @see getStrideNd() setStride() getStride()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setStrideNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 stride);

    /**
     *  \brief Get the multi-dimension stride of the deconvolution.
     * 
     *  @see setStrideNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrideNd();

    /**
     *  \brief Set the multi-dimension padding of the deconvolution.
     * 
     *  The output will be trimmed by this number of elements on both sides of every dimension.
     *  In other words, it resembles the inverse of a convolution layer with this padding size.
     *  Padding is symmetric, and negative padding is not supported.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, padding must be 0.
     * 
     *  @see getPaddingNd() setPadding() getPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the multi-dimension padding of the deconvolution.
     * 
     *  If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPaddingNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPaddingNd();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  For a IDeconvolutionLayer, only index 0 is valid unless explicit precision mode is enabled.
     *  With explicit precision mode, values 0-1 are valid where value 1 overrides kernel weights.
     *  Kernel weights tensor (computed at build-time) must be an output of dequantize scale layer (i.e. a scale layer
     *  with int8 input and float output) in explicit precision network. Conversely, this input tensor can be overridden
     *  via appropriate set call. The indices are as follows:
     * 
     *  - 0: The input activation tensor.
     *  - 1: The kernel weights tensor (a constant tensor).
     * 
     *  If this function is called with a value greater than 0, then the function getNbInputs() changes
     *  */
    
    //!
    //!
    //!

    /** \brief Set the multi-dimension dilation of the deconvolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  @see getDilationNd()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setDilationNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 dilation);

    /**
     *  \brief Get the multi-dimension dilation of the deconvolution.
     * 
     *  @see setDilationNd()
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDilationNd();
}
