import { getSakikoProvider, ISakikoListener } from 'kmpsakiko';

@Entry
@Component
struct Index {
  @State message: string = 'Hello World';

  public aboutToAppear(): void {
    this.message = getSakikoProvider().getFullname();
    getSakikoProvider().greetSakiko(new SakikoListener())
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

class SakikoListener implements ISakikoListener {
  public onKtCalled(msg: string): void {
    console.info(`Sakiko says ${msg}`);
  }
}