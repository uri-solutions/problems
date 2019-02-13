/*
Created by ygorazambuja 26/05/2017
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        int diaHum, diaDois, horaHum, horaDois, minutoHum, minutoDois, segundoHum, segundoDois;
        int day = 0, hour = 0, minute = 0, second = 0;
        boolean bool_h = false, bool_m = false, bool_s = false;
        string = sc.next();
        diaHum = sc.nextInt();

        horaHum = sc.nextInt();
        string = sc.next();
        minutoHum = sc.nextInt();
        string = sc.next();
        segundoHum = sc.nextInt();

        string = sc.next();
        diaDois = sc.nextInt();

        horaDois = sc.nextInt();
        string = sc.next();
        minutoDois = sc.nextInt();
        string = sc.next();
        segundoDois = sc.nextInt();

        if (horaHum > horaDois)
            bool_h = true;
        if (minutoHum > minutoDois)
            bool_m = true;
        if (segundoHum > segundoDois)
            bool_s = true;

        while (diaHum != diaDois) {
            day++;
            diaHum++;
        }

        while (horaHum != horaDois) {
            hour++;
            horaHum++;
            if (horaHum == 25)
                horaHum = 1;
        }

        while (minutoHum != minutoDois) {
            minute++;
            minutoHum++;
            if (minutoHum == 61)
                minutoHum = 1;
        }

        while (segundoHum != segundoDois) {
            second++;
            segundoHum++;
            if (segundoHum == 61)
                segundoHum = 1;
        }

        if (bool_h == true)
            day--;
        if (bool_m == true)
            hour--;
        if (bool_s == true)
            minute--;
        System.out.print(day + " dia(s)\n");
        System.out.print(hour + " hora(s)\n");
        System.out.print(minute + " minuto(s)\n");
        System.out.print(second + " segundo(s)\n");
    }
}