package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.annotation.Simulador;
import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Investimento;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Simulador(investimento = Investimento.CDI)
public class SimuladorDeInvestimentoCDI implements SimuladorDeInvestimento {

    @Inject
    private Logger logger;

    @PostConstruct
    public void inicio() {
        logger.info("Iniciando o simulador CDI");
    }

    @Override
    public Double retornoDoInvestimento(Titulo titulo) {
        // Rende 14% ao ano
        return titulo.getValor() * 1.15;
    }
}
