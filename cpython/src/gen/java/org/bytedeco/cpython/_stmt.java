// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _stmt extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _stmt() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _stmt(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _stmt(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _stmt position(long position) {
        return (_stmt)super.position(position);
    }

    public native @Cast("_stmt_kind") int kind(); public native _stmt kind(int kind);
            @Name("v.FunctionDef.name") public native @Cast("identifier") PyObject v_FunctionDef_name(); public native _stmt v_FunctionDef_name(PyObject v_FunctionDef_name);
            @Name("v.FunctionDef.args") public native _arguments v_FunctionDef_args(); public native _stmt v_FunctionDef_args(_arguments v_FunctionDef_args);
            @Name("v.FunctionDef.body") public native asdl_seq v_FunctionDef_body(); public native _stmt v_FunctionDef_body(asdl_seq v_FunctionDef_body);
            @Name("v.FunctionDef.decorator_list") public native asdl_seq v_FunctionDef_decorator_list(); public native _stmt v_FunctionDef_decorator_list(asdl_seq v_FunctionDef_decorator_list);
            @Name("v.FunctionDef.returns") public native _expr v_FunctionDef_returns(); public native _stmt v_FunctionDef_returns(_expr v_FunctionDef_returns);
        
            @Name("v.AsyncFunctionDef.name") public native @Cast("identifier") PyObject v_AsyncFunctionDef_name(); public native _stmt v_AsyncFunctionDef_name(PyObject v_AsyncFunctionDef_name);
            @Name("v.AsyncFunctionDef.args") public native _arguments v_AsyncFunctionDef_args(); public native _stmt v_AsyncFunctionDef_args(_arguments v_AsyncFunctionDef_args);
            @Name("v.AsyncFunctionDef.body") public native asdl_seq v_AsyncFunctionDef_body(); public native _stmt v_AsyncFunctionDef_body(asdl_seq v_AsyncFunctionDef_body);
            @Name("v.AsyncFunctionDef.decorator_list") public native asdl_seq v_AsyncFunctionDef_decorator_list(); public native _stmt v_AsyncFunctionDef_decorator_list(asdl_seq v_AsyncFunctionDef_decorator_list);
            @Name("v.AsyncFunctionDef.returns") public native _expr v_AsyncFunctionDef_returns(); public native _stmt v_AsyncFunctionDef_returns(_expr v_AsyncFunctionDef_returns);
        
            @Name("v.ClassDef.name") public native @Cast("identifier") PyObject v_ClassDef_name(); public native _stmt v_ClassDef_name(PyObject v_ClassDef_name);
            @Name("v.ClassDef.bases") public native asdl_seq v_ClassDef_bases(); public native _stmt v_ClassDef_bases(asdl_seq v_ClassDef_bases);
            @Name("v.ClassDef.keywords") public native asdl_seq v_ClassDef_keywords(); public native _stmt v_ClassDef_keywords(asdl_seq v_ClassDef_keywords);
            @Name("v.ClassDef.body") public native asdl_seq v_ClassDef_body(); public native _stmt v_ClassDef_body(asdl_seq v_ClassDef_body);
            @Name("v.ClassDef.decorator_list") public native asdl_seq v_ClassDef_decorator_list(); public native _stmt v_ClassDef_decorator_list(asdl_seq v_ClassDef_decorator_list);
        
            @Name("v.Return.value") public native _expr v_Return_value(); public native _stmt v_Return_value(_expr v_Return_value);
        
            @Name("v.Delete.targets") public native asdl_seq v_Delete_targets(); public native _stmt v_Delete_targets(asdl_seq v_Delete_targets);
        
            @Name("v.Assign.targets") public native asdl_seq v_Assign_targets(); public native _stmt v_Assign_targets(asdl_seq v_Assign_targets);
            @Name("v.Assign.value") public native _expr v_Assign_value(); public native _stmt v_Assign_value(_expr v_Assign_value);
        
            @Name("v.AugAssign.target") public native _expr v_AugAssign_target(); public native _stmt v_AugAssign_target(_expr v_AugAssign_target);
            @Name("v.AugAssign.op") public native @Cast("operator_ty") int v_AugAssign_op(); public native _stmt v_AugAssign_op(int v_AugAssign_op);
            @Name("v.AugAssign.value") public native _expr v_AugAssign_value(); public native _stmt v_AugAssign_value(_expr v_AugAssign_value);
        
            @Name("v.AnnAssign.target") public native _expr v_AnnAssign_target(); public native _stmt v_AnnAssign_target(_expr v_AnnAssign_target);
            @Name("v.AnnAssign.annotation") public native _expr v_AnnAssign_annotation(); public native _stmt v_AnnAssign_annotation(_expr v_AnnAssign_annotation);
            @Name("v.AnnAssign.value") public native _expr v_AnnAssign_value(); public native _stmt v_AnnAssign_value(_expr v_AnnAssign_value);
            @Name("v.AnnAssign.simple") public native int v_AnnAssign_simple(); public native _stmt v_AnnAssign_simple(int v_AnnAssign_simple);
        
            @Name("v.For.target") public native _expr v_For_target(); public native _stmt v_For_target(_expr v_For_target);
            @Name("v.For.iter") public native _expr v_For_iter(); public native _stmt v_For_iter(_expr v_For_iter);
            @Name("v.For.body") public native asdl_seq v_For_body(); public native _stmt v_For_body(asdl_seq v_For_body);
            @Name("v.For.orelse") public native asdl_seq v_For_orelse(); public native _stmt v_For_orelse(asdl_seq v_For_orelse);
        
            @Name("v.AsyncFor.target") public native _expr v_AsyncFor_target(); public native _stmt v_AsyncFor_target(_expr v_AsyncFor_target);
            @Name("v.AsyncFor.iter") public native _expr v_AsyncFor_iter(); public native _stmt v_AsyncFor_iter(_expr v_AsyncFor_iter);
            @Name("v.AsyncFor.body") public native asdl_seq v_AsyncFor_body(); public native _stmt v_AsyncFor_body(asdl_seq v_AsyncFor_body);
            @Name("v.AsyncFor.orelse") public native asdl_seq v_AsyncFor_orelse(); public native _stmt v_AsyncFor_orelse(asdl_seq v_AsyncFor_orelse);
        
            @Name("v.While.test") public native _expr v_While_test(); public native _stmt v_While_test(_expr v_While_test);
            @Name("v.While.body") public native asdl_seq v_While_body(); public native _stmt v_While_body(asdl_seq v_While_body);
            @Name("v.While.orelse") public native asdl_seq v_While_orelse(); public native _stmt v_While_orelse(asdl_seq v_While_orelse);
        
            @Name("v.If.test") public native _expr v_If_test(); public native _stmt v_If_test(_expr v_If_test);
            @Name("v.If.body") public native asdl_seq v_If_body(); public native _stmt v_If_body(asdl_seq v_If_body);
            @Name("v.If.orelse") public native asdl_seq v_If_orelse(); public native _stmt v_If_orelse(asdl_seq v_If_orelse);
        
            @Name("v.With.items") public native asdl_seq v_With_items(); public native _stmt v_With_items(asdl_seq v_With_items);
            @Name("v.With.body") public native asdl_seq v_With_body(); public native _stmt v_With_body(asdl_seq v_With_body);
        
            @Name("v.AsyncWith.items") public native asdl_seq v_AsyncWith_items(); public native _stmt v_AsyncWith_items(asdl_seq v_AsyncWith_items);
            @Name("v.AsyncWith.body") public native asdl_seq v_AsyncWith_body(); public native _stmt v_AsyncWith_body(asdl_seq v_AsyncWith_body);
        
            @Name("v.Raise.exc") public native _expr v_Raise_exc(); public native _stmt v_Raise_exc(_expr v_Raise_exc);
            @Name("v.Raise.cause") public native _expr v_Raise_cause(); public native _stmt v_Raise_cause(_expr v_Raise_cause);
        
            @Name("v.Try.body") public native asdl_seq v_Try_body(); public native _stmt v_Try_body(asdl_seq v_Try_body);
            @Name("v.Try.handlers") public native asdl_seq v_Try_handlers(); public native _stmt v_Try_handlers(asdl_seq v_Try_handlers);
            @Name("v.Try.orelse") public native asdl_seq v_Try_orelse(); public native _stmt v_Try_orelse(asdl_seq v_Try_orelse);
            @Name("v.Try.finalbody") public native asdl_seq v_Try_finalbody(); public native _stmt v_Try_finalbody(asdl_seq v_Try_finalbody);
        
            @Name("v.Assert.test") public native _expr v_Assert_test(); public native _stmt v_Assert_test(_expr v_Assert_test);
            @Name("v.Assert.msg") public native _expr v_Assert_msg(); public native _stmt v_Assert_msg(_expr v_Assert_msg);
        
            @Name("v.Import.names") public native asdl_seq v_Import_names(); public native _stmt v_Import_names(asdl_seq v_Import_names);
        
            @Name("v.ImportFrom.module") public native @Cast("identifier") PyObject v_ImportFrom_module(); public native _stmt v_ImportFrom_module(PyObject v_ImportFrom_module);
            @Name("v.ImportFrom.names") public native asdl_seq v_ImportFrom_names(); public native _stmt v_ImportFrom_names(asdl_seq v_ImportFrom_names);
            @Name("v.ImportFrom.level") public native int v_ImportFrom_level(); public native _stmt v_ImportFrom_level(int v_ImportFrom_level);
        
            @Name("v.Global.names") public native asdl_seq v_Global_names(); public native _stmt v_Global_names(asdl_seq v_Global_names);
        
            @Name("v.Nonlocal.names") public native asdl_seq v_Nonlocal_names(); public native _stmt v_Nonlocal_names(asdl_seq v_Nonlocal_names);
        
            @Name("v.Expr.value") public native _expr v_Expr_value(); public native _stmt v_Expr_value(_expr v_Expr_value);
    public native int lineno(); public native _stmt lineno(int lineno);
    public native int col_offset(); public native _stmt col_offset(int col_offset);
}