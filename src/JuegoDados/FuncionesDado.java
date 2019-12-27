package JuegoDados;

public class FuncionesDado {
    public FuncionesDado() {}
	
public void dibujar(int n, int[] valores) {
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (valores[i] == 6) {
                        if (j == 0 || j == 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");

                        }
                    } else {
                        if (valores[i] == 5) {
                            if (((k == 0 || k == 2) && (j == 0 || j == 2)) || (k == 1 && j == 1)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if (valores[i] == 4) {
                                if ((k == 0 || k == 2) && (j == 0 || j == 2)) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            } else {
                                if (valores[i] == 3) {
                                    if ((k == 0 && j == 0) || (k == 1 && j == 1) || (k == 2 && j == 2)) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                } else {
                                    if (valores[i] == 2) {
                                        if ((k == 0 && j == 0) || (k == 2 && j == 2)) {
                                            System.out.print("*");
                                        } else {
                                            System.out.print(" ");
                                        }
                                    } else {
                                        if (valores[i] == 1) {
                                            if (k == 1 && j == 1) {
                                                System.out.print("*");
                                            } else {
                                                System.out.print(" ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.print("  |  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int[] Lanzar(int CantidadDados) {
        int[] caras = new int[CantidadDados];
        for (int i = 0; i < CantidadDados; i++) {
            int numero = (int) (Math.random() * 6 + 1);
            caras[i] = numero;
        }
        return caras;
    }

    public boolean verificarSiLadosIguales(int[] valores) {
        boolean aux = true;
        int auxDados = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (auxDados != valores[i]) {
                aux = false;
                break;
            }
        }
        return aux;
    }

}

