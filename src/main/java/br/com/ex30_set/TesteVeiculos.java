package br.com.ex30_set;
import br.com.domain.entity.Carro;
import br.com.domain.entity.Moto;
import br.com.domain.entity.Veiculo;
public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true)
        };
        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(173);
            if(veiculo instanceof Moto) {
                ((Moto) veiculo).empinar();
            }else {
                ((Carro) veiculo).abrirPortaMalas();
            }
            System.out.println("---");

        }
    }
}
