package com.arslaner.karar;

public class KararYapi2 {

    public void tekÇift(int sayi){
        int kalan = sayi % 2;

        if(kalan==0){

            System.out.println(sayi+" çifttir.");
        }

        if (kalan !=0){

            System.out.println(sayi+" tektir.");
        }
    }
}
