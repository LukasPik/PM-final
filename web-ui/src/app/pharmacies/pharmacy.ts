import { Address } from "../shared/Address";

export class Pharmacy {
  id: number;
  address: Address;

  constructor() {
    this.address = new Address();
  }
}
