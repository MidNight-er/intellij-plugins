// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import {Component} from "@angular/core"

@Component({
  templateUrl: "./privateComponentField.html"
})
export class MyComponent {
  private f<caret>oo: string;

  private bar() {
    this.foo = "";
  }

}
