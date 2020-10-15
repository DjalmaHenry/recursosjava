package recursosjava;

public class RecursosJava {

    public static int buscaBinariaRecursiva(int vet[], int num, int menor,
            int maior) {
        int media = (menor + maior) / 2;
        if (menor > maior) {
            return -1;
        } else if (vet[media] == num) {
            return media;
        } else if (vet[media] < num) {
            return buscaBinariaRecursiva(vet, num, media + 1, maior);
        } else {
            return buscaBinariaRecursiva(vet, num, menor, media - 1);
        }
    }

    public static int inseriOrdenado(int[] vet, int quant, int num) {
        int i, j;
        boolean achou = false;
        for (i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                achou = true;
                break;
            }
        }
        if (quant == 0) {
            vet[quant] = num;
            quant++;
            return quant;
        } else if (achou == true) {
            return -1;
        } else if (quant == vet.length) {
            return -2;
        } else {
            if (num > vet[quant - 1]) {
                vet[quant] = num;
                quant++;
                return quant;
            } else {
                for (i = 0; i < quant; i++) {
                    if (vet[i] > num) {
                        break;
                    }
                }
                for (j = quant; j > i; j--) {
                    vet[j] = vet[j - 1];
                }
                vet[i] = num;
                quant++;
                return quant;
            }
        }
    }

    public static void ordenaBubbleSort(int[] vet) {
        int pos = 0, i, aux;
        int fim = vet.length - 1;
        boolean troca = true;
        while (troca == true) {
            troca = false;
            for (i = 0; i < fim; i++) {
                if (vet[i] > vet[i + 1]) {
                    aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    troca = true;
                    pos = i;
                }
            }
            fim = pos;
        }
    }

    public static int removeNum(int vet[], int quant, int num) {
        int i, j;
        boolean achou = false;
        for (i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            for (j = i; j < quant; j++) {
                vet[j] = vet[j + 1];
            }
            quant--;
            return quant;
        } else if (quant == 0) {
            return -2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

    }

}
