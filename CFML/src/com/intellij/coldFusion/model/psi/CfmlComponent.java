/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.coldFusion.model.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CfmlComponent extends CfmlPsiElement, CfmlNamedElement {
  CfmlComponent[] EMPTY_ARRAY = new CfmlComponent[0];

  CfmlFunction @NotNull [] getFunctions();

  CfmlFunction @NotNull [] getFunctionsWithSupers(boolean isSuperPriority);

  CfmlProperty @NotNull [] getProperties();

  CfmlProperty @NotNull [] getPropertiesWithSupers(boolean isSuperPriority);

  boolean isInterface();

  @Nullable
  String getSuperName();

  String[] getInterfaceNames();

  CfmlComponent[] getImplementedInterfaces();

  @Nullable
  CfmlComponent getSuper();

  @Nullable
  CfmlComponentReference getSuperReference();

  boolean hasImplicitAccessors();

  boolean isPersistent();
}
