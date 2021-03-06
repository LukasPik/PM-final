export class Medicine {
  id: number;
  name: string;
  price: number;
  size: string;
  replacements: Medicine[];
  prescriptionRequired: boolean;
  ingredients: string;
  usage: string;
  contraindications: string;
}
