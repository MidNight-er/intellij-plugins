// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jetbrains.lang.dart.DartTokenTypes.*;
import com.jetbrains.lang.dart.psi.*;
import com.jetbrains.lang.dart.util.DartPsiImplUtil;

public class DartTypeImpl extends DartPsiCompositeElementImpl implements DartType {

  public DartTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DartVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DartVisitor) accept((DartVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DartRecordType getRecordType() {
    return findChildByClass(DartRecordType.class);
  }

  @Override
  @Nullable
  public DartSimpleType getSimpleType() {
    return findChildByClass(DartSimpleType.class);
  }

  @Override
  @Nullable
  public DartTypedFunctionType getTypedFunctionType() {
    return findChildByClass(DartTypedFunctionType.class);
  }

  @Override
  @Nullable
  public DartUntypedFunctionType getUntypedFunctionType() {
    return findChildByClass(DartUntypedFunctionType.class);
  }

  @Override
  public @Nullable PsiElement resolveReference() {
    return DartPsiImplUtil.resolveReference(this);
  }

  @Override
  public @Nullable DartReferenceExpression getReferenceExpression() {
    return DartPsiImplUtil.getReferenceExpression(this);
  }

  @Override
  public @Nullable DartTypeArguments getTypeArguments() {
    return DartPsiImplUtil.getTypeArguments(this);
  }

}
