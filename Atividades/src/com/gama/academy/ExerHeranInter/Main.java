package com.gama.academy.ExerHeranInter;

import com.gama.academy.ExerHeranInter.Core.*;
import com.gama.academy.ExerHeranInter.Taxes.BemTributavel;

public class Main {
    public static void main(String[] args) {
        Carro v01 = new Carro("Ford", "Ka", 2011, 17800.00, 4, 130);
        Carro v02 = new Carro("Ford", "Fiesta", 2008, 27800.00, 2, 180);
        Moto v03 = new Moto("Honda", "Biz 100", 2011, 2800.00, 100, "Moto");
        Moto v04 = new Moto("Honda", "CG150", 2011, 5800.00, 150, "Moto");
        Residencial i01 = new Residencial("Rua 11 de Abril, n°4566", 254000.00, 150);
        Rural i02 = new Rural("Rua 11 de Abril, n°4566", 254000.00, "Rural");
        Comercial i03 = new Comercial("Rua 11 de Abril, n°4566", 254000.00, "Festa");
        
        Object fulano []= new Object[8];
        fulano[0]=v01;
        fulano[1]=v02;
        fulano[2]=v03;
        fulano[3]=v04;
        fulano[4]=i01;
        fulano[5]=i02;
        fulano[6]=i03;

        BemTributavel taxa []=new BemTributavel[10];

        for (Object o:fulano){
            if(o instanceof BemTributavel){
                for (int i=0;i<taxa.length; i++){
                    if (taxa[i]==null){
                        taxa[i]=(BemTributavel) o;
                        break;
                    }
                }
            }
        }

        for (BemTributavel o:taxa){
            if (o!=null) {
                System.out.println(o);
                System.out.printf("Valor do imposto R$ %.2f\n",o.calcularImposto());
                System.out.println(" ");
            }
        }

    }

}
