package lista2;

import java.util.Scanner;

public class Animais {

    public static void main(String[] args) {
        String caract1, caract2, caract3;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira característica (Vertebrado/Invertebrado):");
        caract1 = leia.next();
        System.out.println("Digite a segunda característica (Ave/Mamífero ou Inseto/Anelídeo): ");
        caract2 = leia.next();
        System.out.println("Digite a terceira característica (Carnívoro/Onívoro/Herbívoro/Hematófago): ");
        caract3 = leia.next();

        if (caract1.equalsIgnoreCase("Vertebrado")) {
            if (caract2.equalsIgnoreCase("Ave")) {
                if (caract3.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("O animal é �guia");
                } else if (caract3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é Pombo");
                } else {
                	System.out.println("Animal desconhecido");
                }
            } else if (caract2.equalsIgnoreCase("Mamifero")) {
                if (caract3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é Humano");
                } else if (caract3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("O animal é Vaca");
                } else {
                	System.out.println("Animal desconhecido");
            }

        } else if (caract1.equalsIgnoreCase("Invertebrado")) {
            if (caract2.equalsIgnoreCase("Inseto")) {
                if (caract3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("O animal é Pulga");
                } else if (caract3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("O animal é Lagarta");
                } else {
                	System.out.println("Animal desconhecido");
                }} else if (caract2.equalsIgnoreCase("Anelideo")) {
                if (caract3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("O animal é Sanguessuga");
                } else if (caract3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é Minhoca.");
                }else {
                	System.out.println("Animal desconhecido.");
            }
        }

    }
}}}
