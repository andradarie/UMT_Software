package com.company;

public class CheckStatusPassword {
    public void CheckPasswordStatus(String[] array){
        int verificareCifra = 0;
        int verificareLitMica = 0;
        int verificareLitMare = 0;
        int verificareLungime = 0;
        int verificareSimbol = 0;
        int verificareLit12;
        int verificareLit23;
        int verificare = 0;
        int n;


        if (array.length >= 6 && array.length <= 20)
            verificareLungime++;
        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i].charAt(0)))
                verificareLitMica++;
            if (Character.isUpperCase(array[i].charAt(0)))
                verificareLitMare++;
            if (Character.isDigit(array[i].charAt(0)))
                verificareCifra++;
        }
        if (verificareCifra > 0 && verificareLitMare > 0 && verificareLitMica > 0)
            verificareSimbol++;
        for (int i = 0; i < array.length - 2; i++) {
            verificareLit12 = Character.compare(array[i].charAt(0), array[i + 1].charAt(0));
            verificareLit23 = Character.compare(array[i + 1].charAt(0), array[i + 2].charAt(0));
            if ((verificareLit12 == 0) && (verificareLit23 == 0)) {
                verificare++;
                i++;
            }
        }
        //System.out.println("Litere mici: "+ verificareLitMica);
        //System.out.println("Litere mari: "+ verificareLitMare);
        //System.out.println("Cifre: "+ verificareCifra);
        if (verificareLungime > 0 && verificare == 0 && verificareSimbol > 0)
            System.out.println("Password is strong");
        else {
            System.out.println("Password is weak");
        }

        //System.out.println("verificare: " + verificare);

        if (verificareLungime>0){
            if (verificare==0){
                if (verificareCifra>0 && verificareLitMica>0 && verificareLitMare==0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra>0 && verificareLitMica==0 && verificareLitMare>0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra==0 && verificareLitMica>0 && verificareLitMare>0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra==0 && verificareLitMica==0 && verificareLitMare>0)
                    System.out.println("We need 2 changes to make a strong password");
                else if (verificareCifra==0 && verificareLitMica>0 && verificareLitMare==0)
                    System.out.println("We need 2 changes to make a strong password");
                else if (verificareCifra>0 && verificareLitMica==0 && verificareLitMare==0)
                    System.out.println("We need 2 changes to make a strong password");
            }
            else {
                if (verificareCifra > 0 && verificareLitMica > 0 && verificareLitMare == 0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare > 0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare > 0)
                    System.out.println("We need 1 changes to make a strong password");
                else if (verificareCifra == 0 && verificareLitMica == 0 && verificareLitMare > 0)
                    System.out.println("We need 2 changes to make a strong password");
                else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare == 0)
                    System.out.println("We need 2 changes to make a strong password");
                else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare == 0)
                    System.out.println("We need 2 changes to make a strong password");
                else
                    System.out.println("We need 1 changes to make a strong password");
            }
        }
        else {
            if (array.length < 6) {
                n = 6 - array.length;
                if (verificare > n){
                    System.out.println("We need " + verificare + " changes to make a strong password");
                }
                else {
                    if (verificareCifra > 0 && verificareLitMica > 0 && verificareLitMare == 0)
                        System.out.println("We need " + n + " changes to make a strong password");
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare > 0)
                        System.out.println("We need " + n + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare > 0)
                        System.out.println("We need " + n + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica == 0 && verificareLitMare > 0)
                        if (n > 1)
                            System.out.println("We need " + n + " changes to make a strong password");
                        else
                            System.out.println("We need 2 changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare == 0)
                        if (n > 1)
                            System.out.println("We need " + n + " changes to make a strong password");
                        else
                            System.out.println("We need 2 changes to make a strong password");
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare == 0)
                        if (n > 1)
                            System.out.println("We need " + n + " changes to make a strong password");
                        else
                            System.out.println("We need 2 changes to make a strong password");
                    else
                        System.out.println("We need " + n + " changes to make a strong password");
                }
            }
            else {
                n = array.length - 20;
                if (verificare > n) {
                    if (verificareCifra > 0 && verificareLitMica > 0 && verificareLitMare == 0)
                        System.out.println("We need " + (verificare-1) + " changes to make a strong password");
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare > 0)
                        System.out.println("We need " + (verificare-1) + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare > 0)
                        System.out.println("We need " + (verificare-1) + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica == 0 && verificareLitMare > 0) {
                        if (verificare - n > 1)
                            System.out.println("We need " + (verificare-2) + " changes to make a strong password");
                        else
                            System.out.println("We need " + (verificare+1) + " changes to make a strong password");
                    }
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare == 0) {
                        if (verificare - n > 1)
                            System.out.println("We need " + (verificare-2) + " changes to make a strong password");
                        else
                            System.out.println("We need " + (verificare+1) + " changes to make a strong password");
                    }
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare == 0) {
                        if (verificare - n > 1)
                            System.out.println("We need " + (verificare-2) + " changes to make a strong password");
                        else
                            System.out.println("We need " + (verificare+1) + " changes to make a strong password");
                    }
                    else
                        System.out.println("We need " + verificare + " changes to make a strong password");
                }
                else {
                    if (verificareCifra > 0 && verificareLitMica > 0 && verificareLitMare == 0)
                        System.out.println("We need " + (n+1) + " changes to make a strong password");
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare > 0)
                        System.out.println("We need " + (n+1) + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare > 0)
                        System.out.println("We need " + (n+1) + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica == 0 && verificareLitMare > 0)
                        System.out.println("We need " + (n+2) + " changes to make a strong password");
                    else if (verificareCifra == 0 && verificareLitMica > 0 && verificareLitMare == 0)
                        System.out.println("We need " + (n+2) + " changes to make a strong password");
                    else if (verificareCifra > 0 && verificareLitMica == 0 && verificareLitMare == 0)
                        System.out.println("We need " + (n+2) + " changes to make a strong password");
                    else
                        System.out.println("We need " + n + " changes to make a strong password");
                }
            }
        }
    }
}