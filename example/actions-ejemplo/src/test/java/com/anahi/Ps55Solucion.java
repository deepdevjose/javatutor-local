package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

public class Ps55Solucion {

    public static class Hab {
        public int num; public String tipo; public double precio; public String disp;
        public Hab(int num, String tipo, double precio, String disp){ this.num=num; this.tipo=tipo; this.precio=precio; this.disp=disp; }
    }
    public static class Hue {
        public int numHab; public String nom; public int fecArr;
        public Hue(int numHab, String nom, int fecArr){ this.numHab=numHab; this.nom=nom; this.fecArr=fecArr; }
    }

    public static double calcularPago(Hab[] habs, int nH, Hue[] hues, int mH, String nombre, int fechaActual) {
        int numHab = -1;
        for (int i=0;i<mH;i++) if (hues[i].nom.equalsIgnoreCase(nombre)) { numHab = hues[i].numHab; int noches = Math.max(0, fechaActual - hues[i].fecArr);
            for (int j=0;j<nH;j++) if (habs[j].num==numHab) return noches * habs[j].precio; }
        return 0.0;
    }

    public static int contarDisponibles(Hab[] habs, int nH, String tipo) {
        int c=0; for (int i=0;i<nH;i++) if (habs[i].tipo.equalsIgnoreCase(tipo) && habs[i].disp.equalsIgnoreCase("SI")) c++; return c;
    }

    public static boolean eliminarHuesped(Hab[] habs, int nH, Hue[] hues, int[] mH, String nombre) {
        int idx=-1;
        for (int i=0;i<mH[0];i++) if (hues[i].nom.equalsIgnoreCase(nombre)) { idx=i; break; }
        if (idx==-1) return false;
        // liberar habitación
        int numHab = hues[idx].numHab;
        for (int j=0;j<nH;j++) if (habs[j].num==numHab) { habs[j].disp="SI"; break; }
        // compactar huespedes
        for (int i=idx;i<mH[0]-1;i++) hues[i]=hues[i+1];
        mH[0]--;
        return true;
    }

    public static boolean reservar(Hab[] habs, int nH, Hue[] hues, int[] mH, int numHab, String nombre, int fecArr) {
        int j=-1;
        for (int i=0;i<nH;i++) if (habs[i].num==numHab) { j=i; break; }
        if (j==-1) return false;
        if (!habs[j].disp.equalsIgnoreCase("SI")) return false;
        habs[j].disp = "NO";
        hues[mH[0]] = new Hue(numHab, nombre, fecArr);
        mH[0]++;
        return true;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Demo con pequeños datos
        Hab[] habs = new Hab[]{
            new Hab(101, "SI", 500.0, "SI"),
            new Hab(102, "DO", 800.0, "NO"),
            new Hab(201, "TR", 1200.0, "SI"),
            new Hab(301, "SU", 2000.0, "SI")
        };
        int nH = habs.length;

        Hue[] hues = new Hue[360];
        int[] mH = new int[]{1};
        hues[0] = new Hue(102, "Ana", 10); // Ana llegó el día 10 en la 102 (ocupada)

        System.out.println("Disponibles SI=" + contarDisponibles(habs,nH,"SI")
            + " DO=" + contarDisponibles(habs,nH,"DO")
            + " TR=" + contarDisponibles(habs,nH,"TR")
            + " SU=" + contarDisponibles(habs,nH,"SU"));

        System.out.println("Pago Ana al día 13: " + calcularPago(habs,nH,hues,mH[0],"Ana",13));

        System.out.println("Reservar 201 para Luis día 15: " + reservar(habs,nH,hues,mH,201,"Luis",15));
        System.out.println("Eliminar Ana (checkout): " + eliminarHuesped(habs,nH,hues,mH,"Ana"));

        sc.close();
    }
}
