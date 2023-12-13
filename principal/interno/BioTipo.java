package principal.interno;

import java.util.ArrayList;
import java.util.List;

public class BioTipo {

    public static List<String> recomendarSuplementos(int biotipo) {
        List<String> suplementos = new ArrayList<>();
        switch (biotipo) {
            case 1:
                suplementos.add("Whey protein isolado");
                suplementos.add("Termogênicos");
                suplementos.add("Creatina");
                break;
            case 2:
                suplementos.add("Whey Protein");
                suplementos.add("Creatina");
                suplementos.add("Glutamina");
                break;
            case 3:
                suplementos.add("Composto de vários tipos de proteína, incluindo a de soja, a caseína e o whey");
                suplementos.add(
                        "Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular");
                suplementos.add("Creatina");
                break;
            default:
                break;
        }
        return suplementos;
    }

     public static BiotipoInfo getBiotipo(double imc) {
        String descricao;
        List<String> suplementos;

        if (imc < 18.5) {
            descricao = "Ectomorfo...";
            suplementos = recomendarSuplementos(1);
        } else if (imc >= 18.5 && imc < 25) {
            descricao = "Endomorfo...";
            suplementos = recomendarSuplementos(2);
        } else {
            descricao = "Mesomorfo...";
            suplementos = recomendarSuplementos(3);
        }

        return new BiotipoInfo(descricao, suplementos);
    }

    public static class BiotipoInfo {
        private String descricao;
        private List<String> suplementosRecomendados;

        public BiotipoInfo(String descricao, List<String> suplementosRecomendados) {
            this.descricao = descricao;
            this.suplementosRecomendados = suplementosRecomendados;
        }

        public String getDescricao() {
            return descricao;
        }

        public List<String> getSuplementosRecomendados() {
            return suplementosRecomendados;
        }
    }
}
