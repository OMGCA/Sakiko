/***
*    !!!  GEN CODE DO NOT EDIT  !!!
***/
import { getService } from "@kuiklybase/knoi"

export interface SakikoProvider {
            
   getLastname(): string;

   getFirstname(): string;

}

export function getSakikoProvider(): SakikoProvider {
   return getService<SakikoProvider>("SakikoProvider")
}

