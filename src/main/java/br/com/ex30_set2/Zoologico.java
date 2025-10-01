package br.com.ex30_set2;
import br.com.domain.entity.Gato;
import br.com.domain.entity.Passaro;
import br.com.domain.entity.Animal;
import br.com.domain.entity.Cachorro;
public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Labrador"),
                new Gato("Mimi", 2, true),
                new Passaro("Piu", 1, 15.5)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo em ação
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            // Downcasting seguro
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            }
            System.out.println("---");
        }
    }
}