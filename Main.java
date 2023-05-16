package application;

import struct.Grafo;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();


        grafo.addVertice("1");
        grafo.addVertice("2");
        grafo.addVertice("3");
        grafo.addVertice("4");
        grafo.addVertice("5");

        grafo.addAresta(2.0, "1", "2");
        grafo.addAresta(3.0, "2", "4");
        grafo.addAresta(1.0, "4", "3");
        grafo.addAresta(1.0, "3", "1");
        grafo.addAresta(2.0, "5", "2");
        grafo.addAresta(3.0, "5", "1");

        grafo.buscaLargura();
    }
}
