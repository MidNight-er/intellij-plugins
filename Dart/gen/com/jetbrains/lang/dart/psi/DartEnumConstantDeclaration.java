// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DartEnumConstantDeclaration extends DartComponent {

  @Nullable
  DartArguments getArguments();

  @NotNull
  List<DartComponentName> getComponentNameList();

  @NotNull
  List<DartMetadata> getMetadataList();

  @Nullable
  DartTypeArguments getTypeArguments();

  @Nullable DartComponentName getComponentName();

}
