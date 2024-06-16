public class Dono {
    private String nome;
    private Cao[] pets;

    public Dono(String nome) {
        this.nome = nome;
        pets = new Cao[3];  // vetor preparado para receber até 3 cães
    }

    public void addPet(int index, Cao pet) { // inclui um objeto de cão
        this.pets[index] = pet;               // no vetor pets
    }

    public Cao getPet(int index) { // obtém uma instância de Cao
        return this.pets[index];    // na posição index do vetor pets
    }


    public void alimentarCaes() {
        for(int i=0; i< 3; i++){
            this.pets[i].realizarRefeicao();
        }
    }

    public void receberFesta() {
        for(int i=0; i< 3; i++){
            System.out.println(this.nome + " está recebendo festa de " +
                    this.pets[i].getNomeCao());
        }
    }

    public void listarCaes() {      // lista todos os cães do vetor pets
        for(int i=0; i< 3; i++){
            this.getPet(i).printCao();
        }
    }

    public static void main(String[] args) {
        Dono maria = new Dono("Maria");
        Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3,
                "Enrolada", "Pêlo curtinho");
        Cao bruce = new Cao("Bruce", "Pug", "Macho", 2, "Caracol", "Pêlo curtinho");
        Cao jujuba = new Cao("Jujuba", "Maltês", "Fêmea", 1,
                "Enrolada", "Pêlo longo");

        maria.addPet(0, pipoca); // Pipoca está na posição 0 de pets
        maria.addPet(1, bruce);  // Bruce  está na posição 1 de pets
        maria.addPet(2, jujuba); // jujuba está na posição 2 de pets

        pipoca.setMeuDono(maria);  // associa Pipoca com Maria
        bruce.setMeuDono(maria);
        jujuba.setMeuDono(maria);

        System.out.println("Cãezinhos de " + maria.nome);
        maria.listarCaes();

        maria.alimentarCaes();  // Maria alimenta o seu cão Pipoca
        maria.receberFesta();
    }
}