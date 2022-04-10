export interface IPonude {
  id?: number;
  sifraPostupka?: number;
  sifraPonude?: number;
  brojPartije?: number;
  sifraPonudjaca?: number;
  nazivProizvodjaca?: string | null;
  zasticeniNaziv?: string | null;
  ponudjenaVrijednost?: number;
  rokIsporuke?: number;
}
export class Ponude implements IPonude {
  constructor(
    public id?: number,
    public sifraPostupka?: number,
    public sifraPonude?: number,
    public brojPartije?: number,
    public sifraPonudjaca?: number,
    public nazivProizvodjaca?: string | null,
    public zasticeniNaziv?: string | null,
    public ponudjenaVrijednost?: number,
    public rokIsporuke?: number
  ) {}
}

export function getPonudeIdentifier(ponude: IPonude): number | undefined {
  return ponude.id;
}
