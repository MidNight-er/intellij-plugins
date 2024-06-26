import {Component, Directive, Input, model, Optional, Self, TemplateRef} from "@angular/core";

@Directive({
   selector: '[foo]',
   standalone: true
 })
export class FooDirective {
  public constructor(@Optional() @Self() private readonly template: TemplateRef<void> ) {

  }
  @Input() foo!: string;
}

@Directive({
   selector: '[bar]',
   standalone: true
 })
export class BarDirective {
  public constructor(@Self() private readonly template: TemplateRef<void> ) {

  }
  @Input() bar!: string;
}

@Component({
   selector: 'app-test',
   standalone: true,
   imports: [FooDirective, BarDirective],
   template: `
        <div [foo]="<error descr="Type number is not assignable to type string">12</error>"></div>
        <div *foo="<error descr="Type number is not assignable to type string">12</error>"></div>
        <div <error descr="Property bar is not provided by any applicable directives nor by <div> element">[bar]</error>="12"></div>
        <div *bar="<error descr="Type number is not assignable to type string">12</error>"></div>
    `,
 })
export class TestComponent {
}