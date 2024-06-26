// This is a generated file. Not intended for manual editing.
package com.intellij.webassembly.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WebAssemblyMem extends WebAssemblyNamedElement {

  @Nullable
  WebAssemblyInlineData getInlineData();

  @NotNull
  List<WebAssemblyInlineExport> getInlineExportList();

  @Nullable
  WebAssemblyInlineImport getInlineImport();

  @Nullable
  WebAssemblyMemtype getMemtype();

  @Nullable
  PsiElement setName(@NotNull String name);

  @Nullable
  PsiElement getNameIdentifier();

}
