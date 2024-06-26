// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.vuejs.lang

import com.intellij.codeInspection.htmlInspections.HtmlUnknownTagInspection
import com.intellij.javascript.debugger.NodeJsAppRule
import com.intellij.javascript.nodejs.npm.NpmUtil
import com.intellij.lang.javascript.linter.JSExternalToolIntegrationTest
import org.jetbrains.vuejs.inspections.VueMissingComponentImportInspection

class VueIntegrationHighlightingTest: JSExternalToolIntegrationTest() {

  override fun getBasePath(): String = vueRelativeTestDataPath() + "/highlighting"

  fun testAutoImportVueComponentWithPnpm() {
    copyTestDirectoryAndInstallDependencies()
    myFixture.enableInspections(VueMissingComponentImportInspection::class.java, HtmlUnknownTagInspection::class.java)
    myFixture.configureFromTempProjectFile("src/HelloWorld.vue")
    myFixture.checkHighlighting()
  }

  private fun copyTestDirectoryAndInstallDependencies() {
    myFixture.copyDirectoryToProject(getTestName(true), "")
    performNpmInstallUsingPackageManager(project, nodePackage, "package.json")
  }

  override fun getMainPackageName(): String = NpmUtil.PNPM_PACKAGE_NAME

  override fun configureInterpreterVersion(): NodeJsAppRule = NodeJsAppRule.LATEST_20
}
