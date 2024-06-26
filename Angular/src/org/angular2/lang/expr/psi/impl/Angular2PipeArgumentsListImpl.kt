// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.lang.expr.psi.impl

import com.intellij.lang.javascript.JSTokenTypes
import com.intellij.lang.javascript.psi.JSExpression
import com.intellij.lang.javascript.psi.impl.JSArgumentListImpl
import com.intellij.psi.tree.IElementType
import com.intellij.util.ArrayUtil
import org.angular2.lang.expr.parser.Angular2ElementTypes
import org.angular2.lang.expr.psi.Angular2PipeArgumentsList

class Angular2PipeArgumentsListImpl(elementType: IElementType?) : JSArgumentListImpl(elementType), Angular2PipeArgumentsList {
  override fun getArguments(): Array<JSExpression> {
    val leftSide = pipeLeftSideExpression
    return if (leftSide != null) ArrayUtil.prepend(leftSide, super.getArguments()) else JSExpression.EMPTY_ARRAY
  }

  val pipeRightSideExpressions: Array<JSExpression>
    get() = super.getArguments()

  private val pipeLeftSideExpression: JSExpression?
    get() = (parent as Angular2PipeExpressionImpl)
      .findChildByType(Angular2ElementTypes.PIPE_LEFT_SIDE_ARGUMENT)
      ?.getPsi(Angular2PipeLeftSideArgumentImpl::class.java)
      ?.pipeLeftSideExpression

  override fun getDelimiter(): IElementType {
    return JSTokenTypes.COLON
  }
}