// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ITensor
 * 
 *  \brief A tensor in a network definition.
 * 
 *  to remove a tensor from a network definition, use INetworkDefinition::removeTensor()
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ITensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ITensor(Pointer p) { super(p); }

    /**
     *  \brief Set the tensor name.
     * 
     *  For a network input, the name is assigned by the application. For tensors which are layer outputs,
     *  a default name is assigned consisting of the layer name followed by the index of the output in brackets.
     * 
     *  This method copies the name string.
     * 
     *  @param name The name.
     * 
     *  @see getName()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setName(String name);
    public native void setName(@Cast("const char*") BytePointer name);

    /**
     *  \brief Get the tensor name.
     * 
     *  @return The name, as a pointer to a NULL-terminated character sequence.
     * 
     *  @see setName()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native String getName();

    /**
     *  \brief Set the dimensions of a tensor.
     * 
     *  For a network input the name is assigned by the application. For a network output it is computed based on
     *  the layer parameters and the inputs to the layer. If a tensor size or a parameter is modified in the network,
     *  the dimensions of all dependent tensors will be recomputed.
     * 
     *  This call is only legal for network input tensors, since the dimensions of layer output tensors are inferred based on
     *  layer inputs and parameters.
     * 
     *  @param dimensions The dimensions of the tensor.
     * 
     *  @see getDimensions()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setDimensions(@ByVal Dims dimensions); // only valid for input tensors

    /**
     *  \brief Get the dimensions of a tensor.
     * 
     *  @return The dimensions of the tensor.
     * 
     *  @see setDimensions()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getDimensions();

    /**
     *  \brief Set the data type of a tensor.
     * 
     *  @param type The data type of the tensor.
     * 
     *  The type is unchanged if the type is
     *  invalid for the given tensor.
     * 
     *  If the tensor is a network input or output,
     *  then the tensor type cannot be DataType::kINT8.
     * 
     *  @see getType()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setType(DataType type);
    public native void setType(@Cast("nvinfer1::DataType") int type);

    /**
     *  \brief Get the data type of a tensor.
     * 
     *  @return The data type of the tensor.
     * 
     *  @see setType()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native DataType getType();

    /**
     *  \brief Set dynamic range for the tensor
     * 
     *  Currently, only symmetric ranges are supported.
     *  Therefore, the larger of the absolute values of the provided bounds is used.
     * 
     *  @return Whether the dynamic range was set successfully.
     * 
     *  Requires that min and max be finite, and min <= max.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean setDynamicRange(float min, float max);

    /**
     *  \brief Get dynamic range for the tensor
     * 
     *  @return maximal absolute value of the dynamic range, -1.0f if no dynamic range is set.
     * 
     *  @deprecated This interface is superceded by getDynamicRangeMin and getDynamicRangeMax.
     *  */
    
    
    //!
    //!
    public native float getDynamicRange();

    /**
     *  \brief Whether the tensor is a network input.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean isNetworkInput();

    /**
     *  \brief Whether the tensor is a network output.
     *  */
    public native @Cast("bool") boolean isNetworkOutput();
    /**
     *  \brief Set whether to enable broadcast of tensor across the batch.
     * 
     *  When a tensor is broadcast across a batch, it has the same value for every member in the batch.
     *  Memory is only allocated once for the single member.
     * 
     *  This method is only valid for network input tensors, since the flags of layer output tensors are inferred based on
     *  layer inputs and parameters.
     *  If this state is modified for a tensor in the network, the states of all dependent tensors will be recomputed.
     * 
     *  @param broadcastAcrossBatch Whether to enable broadcast of tensor across the batch.
     * 
     *  @see getBroadcastAcrossBatch()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void setBroadcastAcrossBatch(@Cast("bool") boolean broadcastAcrossBatch);

    /**
     *  \brief Check if tensor is broadcast across the batch.
     * 
     *  When a tensor is broadcast across a batch, it has the same value for every member in the batch.
     *  Memory is only allocated once for the single member.
     * 
     *  @return True if tensor is broadcast across the batch, false otherwise.
     * 
     *  @see setBroadcastAcrossBatch()
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean getBroadcastAcrossBatch();

    /**
     *  \brief Get the storage location of a tensor.
     *  @return The location of tensor data.
     *  @see setLocation()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native TensorLocation getLocation();

    /**
     *  \brief Set the storage location of a tensor
     *  @param location the location of tensor data
     * 
     *  Only input tensors for storing sequence lengths for RNNv2 are supported.
     *  Using host storage for layers that do not support it will generate
     *  errors at build time.
     * 
     *  @see getLocation()
     *  */
    
    
    //!
    //!
    //!
    public native void setLocation(TensorLocation location);
    public native void setLocation(@Cast("nvinfer1::TensorLocation") int location);

    /**
     *  \brief Query whether dynamic range is set.
     * 
     *  @return True if dynamic range is set, false otherwise.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean dynamicRangeIsSet();

    /**
     *  \brief Undo effect of setDynamicRange.
     *  */
    
    
    //!
    //!
    //!
    public native void resetDynamicRange();

    /**
     *  \brief Get minimum of dynamic range.
     * 
     *  @return Minimum of dynamic range, or quiet NaN if range was not set.
     *  */
    
    
    //!
    //!
    //!
    public native float getDynamicRangeMin();

    /**
     *  \brief Get maximum of dynamic range.
     * 
     *  @return Maximum of dynamic range, or quiet NaN if range was not set.
     *  */
    public native float getDynamicRangeMax();
}