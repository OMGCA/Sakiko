import { getSakikoProvider } from 'kmpsakiko';

@Entry
@Component
struct Index {
  @State message: string = 'Hello World';

  public aboutToAppear(): void {
    this.message = getSakikoProvider().getFullname();
  }

  build() {
    RelativeContainer() {
      Text("ArkUI: Hello, " + this.message + "!")
        .id('HelloWorld')
        .fontSize(14)
        .fontWeight(FontWeight.Medium)
        .alignRules({
          center: { anchor: '__container__', align: VerticalAlign.Center },
          middle: { anchor: '__container__', align: HorizontalAlign.Center }
        })
        .onClick(() => {
          this.message = 'Welcome';
        })
    }
    .height('100%')
    .width('100%')
  }
}