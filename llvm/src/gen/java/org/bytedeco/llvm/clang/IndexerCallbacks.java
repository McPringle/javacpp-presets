// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * A group of callbacks used by #clang_indexSourceFile and
 * #clang_indexTranslationUnit.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class IndexerCallbacks extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IndexerCallbacks() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IndexerCallbacks(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IndexerCallbacks(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IndexerCallbacks position(long position) {
        return (IndexerCallbacks)super.position(position);
    }

  /**
   * Called periodically to check whether indexing should be aborted.
   * Should return 0 to continue, and non-zero to abort.
   */
  public static class AbortQuery_CXClientData_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    AbortQuery_CXClientData_Pointer(Pointer p) { super(p); }
      protected AbortQuery_CXClientData_Pointer() { allocate(); }
      private native void allocate();
      public native int call(CXClientData client_data, Pointer reserved);
  }
  public native AbortQuery_CXClientData_Pointer abortQuery(); public native IndexerCallbacks abortQuery(AbortQuery_CXClientData_Pointer setter);

  /**
   * Called at the end of indexing; passes the complete diagnostic set.
   */
  public static class Diagnostic_CXClientData_CXDiagnosticSet_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Diagnostic_CXClientData_CXDiagnosticSet_Pointer(Pointer p) { super(p); }
      protected Diagnostic_CXClientData_CXDiagnosticSet_Pointer() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                       CXDiagnosticSet arg1, Pointer reserved);
  }
  public native Diagnostic_CXClientData_CXDiagnosticSet_Pointer diagnostic(); public native IndexerCallbacks diagnostic(Diagnostic_CXClientData_CXDiagnosticSet_Pointer setter);

  public static class EnteredMainFile_CXClientData_CXFile_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    EnteredMainFile_CXClientData_CXFile_Pointer(Pointer p) { super(p); }
      protected EnteredMainFile_CXClientData_CXFile_Pointer() { allocate(); }
      private native void allocate();
      public native CXIdxClientFile call(CXClientData client_data,
                                       CXFile mainFile, Pointer reserved);
  }
  public native EnteredMainFile_CXClientData_CXFile_Pointer enteredMainFile(); public native IndexerCallbacks enteredMainFile(EnteredMainFile_CXClientData_CXFile_Pointer setter);

  /**
   * Called when a file gets \#included/\#imported.
   */
  public static class PpIncludedFile_CXClientData_CXIdxIncludedFileInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    PpIncludedFile_CXClientData_CXIdxIncludedFileInfo(Pointer p) { super(p); }
      protected PpIncludedFile_CXClientData_CXIdxIncludedFileInfo() { allocate(); }
      private native void allocate();
      public native CXIdxClientFile call(CXClientData client_data,
                                      @Const CXIdxIncludedFileInfo arg1);
  }
  public native PpIncludedFile_CXClientData_CXIdxIncludedFileInfo ppIncludedFile(); public native IndexerCallbacks ppIncludedFile(PpIncludedFile_CXClientData_CXIdxIncludedFileInfo setter);

  /**
   * Called when a AST file (PCH or module) gets imported.
   *
   * AST files will not get indexed (there will not be callbacks to index all
   * the entities in an AST file). The recommended action is that, if the AST
   * file is not already indexed, to initiate a new indexing job specific to
   * the AST file.
   */
  public static class ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo(Pointer p) { super(p); }
      protected ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo() { allocate(); }
      private native void allocate();
      public native CXIdxClientASTFile call(CXClientData client_data,
                                          @Const CXIdxImportedASTFileInfo arg1);
  }
  public native ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo importedASTFile(); public native IndexerCallbacks importedASTFile(ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo setter);

  /**
   * Called at the beginning of indexing a translation unit.
   */
  public static class StartedTranslationUnit_CXClientData_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    StartedTranslationUnit_CXClientData_Pointer(Pointer p) { super(p); }
      protected StartedTranslationUnit_CXClientData_Pointer() { allocate(); }
      private native void allocate();
      public native CXIdxClientContainer call(CXClientData client_data,
                                                   Pointer reserved);
  }
  public native StartedTranslationUnit_CXClientData_Pointer startedTranslationUnit(); public native IndexerCallbacks startedTranslationUnit(StartedTranslationUnit_CXClientData_Pointer setter);

  public static class IndexDeclaration_CXClientData_CXIdxDeclInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    IndexDeclaration_CXClientData_CXIdxDeclInfo(Pointer p) { super(p); }
      protected IndexDeclaration_CXClientData_CXIdxDeclInfo() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                             @Const CXIdxDeclInfo arg1);
  }
  public native IndexDeclaration_CXClientData_CXIdxDeclInfo indexDeclaration(); public native IndexerCallbacks indexDeclaration(IndexDeclaration_CXClientData_CXIdxDeclInfo setter);

  /**
   * Called to index a reference of an entity.
   */
  public static class IndexEntityReference_CXClientData_CXIdxEntityRefInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    IndexEntityReference_CXClientData_CXIdxEntityRefInfo(Pointer p) { super(p); }
      protected IndexEntityReference_CXClientData_CXIdxEntityRefInfo() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                                 @Const CXIdxEntityRefInfo arg1);
  }
  public native IndexEntityReference_CXClientData_CXIdxEntityRefInfo indexEntityReference(); public native IndexerCallbacks indexEntityReference(IndexEntityReference_CXClientData_CXIdxEntityRefInfo setter);

}