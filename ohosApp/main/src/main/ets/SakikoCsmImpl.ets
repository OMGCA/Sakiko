import { SakikoConsumer } from "kmpsakiko";
import { deviceInfo } from "@kit.BasicServicesKit";

export class SakikoCsmImpl implements SakikoConsumer {
  public getSystemVer(): string {
    return deviceInfo.displayVersion;
  }
}