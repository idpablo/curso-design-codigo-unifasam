package service;

public enum TipoCargo {

    COORDENADOR {
        @Override
        public CalculaSalario getCargo() {
            return new ImpressaoHolerite(new Coordenador());
        }
    },
    PROFESSOR {
        @Override
        public CalculaSalario getCargo() {
            return new ImpressaoHolerite(new Professor());
        }
    },
    DIRETOR {
        @Override
        public CalculaSalario getCargo() {
            return new ImpressaoHolerite(new Diretor());
        }
    };

    public abstract CalculaSalario getCargo();
}
